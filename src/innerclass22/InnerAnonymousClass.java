package innerclass22;

class Person{
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "이름:"+name;
	}
}

class Student extends Person{
	
	String stNumber;//자식에서 새롭게 확장한 변수

	public Student(String name, String stNumber) {
		super(name);
		this.stNumber = stNumber;
	}
	//자식에서 새롭게 확장한 멤버 메소드
	String get() {
		return String.format("%s,학번:%s",super.toString(), stNumber);
	}
	
	@Override
	public String toString() {
		return get();
	}
}

abstract class AbstractClass{
	abstract void abstractMethod();
}

interface Inter{
	void abstractMethod();
}

public class InnerAnonymousClass {
	public static void main(String[] args) {
		//이름이 있는 자식클래서의 일반적인 이질화 형태
		Person person = new Student("홍길동", "2020");
		System.out.println(person);
		
		Student st = (Student)person;
		System.out.println(st.stNumber);
		System.out.println(st.get());
		
		Person anonyPerson = new Person("가길동") {
			//멤버변수
			int newVar;//익명클래스에서 새롭게 확장한 멤버
			
			void newMethod() {
				
			}
			
			@Override
			public String toString() {
				newMethod();
				return super.toString()+" ,newVar:"+newVar;
			}
		};//
		System.out.println(anonyPerson);
		
		Student anonySt = new Student("박길동", "2020") {
			int age = 20;
			
			@Override
			String get() {
				return super.get()+",익명 클래스의 새로운 멤버변수:"+age;
			}
			
			@Override
			public String toString() {
				return get();
			}
		};
		System.out.println(anonySt);
		
		AbstractClass ac = new AbstractClass() {
			
			@Override
			void abstractMethod() {
				System.out.println("추상 메소드 오버라이딩");
			}
		};
		ac.abstractMethod();
		
		Inter inter = new Inter() {
			
			@Override
			public void abstractMethod() {
				System.out.println("추상 메소드 오버라이딩");
			}
		};
		inter.abstractMethod();
		
	}
}
