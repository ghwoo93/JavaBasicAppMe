package abstraction06;
/*
 * .java파일에 여러개의 class를 정의할 때는
 * main메소드가 있는 클래스에 public을 붙여라
 * 그 외 클래스는
 */
class Student{
	//멤버변수
	//멤버 변수의 데이터 타입으로 person타입 사용:상속아님
	Person person;
	Person another = new Person();//선언과 동시에 메모리 할당
	String stNumber;
	
	//멤버 메소드
	void study() {
		System.out.println(person.name+"가(이) 공부하다");
	}
	void printStudent() {
		person.printPerson();//reference & pointer를 할 메모리 주소가 저장되지 않음
		System.out.println("학번:"+stNumber);
	}
}

public class StudentApp {
	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println("st1:"+st1);
//		st1.printStudent();
		//st.person이 null임으로 즉 person타입의
		//메모리를 가ㅣ키고 있지 않음으로
		//nullpointerexception예외발생
		System.out.println(st1.person);
		//해결1 person타입의 메모리를 생성해서 주소 대입
		st1.person = new Person();
		System.out.println("st1.person 주소 저장후"+st1.person);
		st1.printStudent();
		st1.person.name="가길동";
		st1.person.age=20;
		st1.person.weight=99.0;
		System.out.println("[Person초기화 후");
		st1.person=st1.another;
		System.out.println("st1.person:"+st1.person);
		System.out.println("st1.another:"+st1.another);
		//초기화
		st1.person.name="다길동";
		st1.person.age=40;
		st1.person.weight=60;
		st1.stNumber="20학번";
		System.out.println("[초기화후]");
		st1.printStudent();
		//해결2 person타입의 메모리를 생성해서 주소 대입
		st1.person = new Person();
		
	}
}
