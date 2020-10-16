package polymorphism14;

class Person{
	String name;
	void personMethod() {
		System.out.println("부모의 메소드:personMethod()");
	}
}
class Student extends Person{
	String stNumber;
	void study() {
		System.out.println("자식에서 새롭게 확장한 메소드:study()");
	}
	@Override
	void personMethod() {
		System.out.println("자식에서 오버라이딩한 메소드:personMethod()");
	}
	void personMethod(int num) {
		System.out.println("자식에서 오버로딩한 메소드:personMethod(int)");
	}
}
public class heterogeneous {
	public static void main(String[] args) {
		//호모지니어스 동질화
		Student st= new Student();
		System.out.println(st.name);
		System.out.println(st.stNumber);
		st.personMethod();//오버라이딩
		st.personMethod(10);//오버로딩
		st.study();//새롭게 추가
		//퍼슨 타입의 변수에 자식타입의 메모리 주소 복사
		Person p = st;//heterogeneous
		System.out.println(p.name);
		p.personMethod();//오버라이딩한 메소드만 접근가능
		
		Person p2 = new  Student();
		System.out.println(p2.name);
		p2.personMethod();
		//방법1]형변환후 바로 접근
		System.out.println(((Student)p2).stNumber);
		((Student)p2).personMethod(10);
		//방법2]자식타입의 인스턴스 변수에 담아서 그 변수로 접근
		Student s = (Student)p2;
		System.out.println(s.stNumber);
		s.personMethod(10);
	}
}
