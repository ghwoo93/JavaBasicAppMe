package abstraction06;
/*
 * 레퍼런스 연산자
 */
public class PersonApp {
	public static void main(String[] args) {
		//인스턴스 변수
		Person person1;//person1이라는 이름으로
		//stack영역에 주소를 저장할 수 있는 메모리 생성
		/*
		 * new 연산자의 의미
		 * Person클래스를 인스턴스화 한다
		 * Person클래스를 객체화 한다
		 * Person타입의 메모리를 heap영역에 생성한다
		 */
		person1= new Person();//heap영역
		System.out.println(person1);
		person1.printPerson();
		//멤버 변수 초기화
		person1.age=20;
		person1.name="홍길동";
		person1.weight=80;
		System.out.println("[멤버변수 값 할당 후]");
		person1.printPerson();
		person1.eat();
		person1.sleep();
		//인스턴스 변수 선언과 동시에 메모리 할당
		Person person2 = new Person();
		System.out.println(person2);
		System.out.println(person2.getPerson());
		//멤버 변수 초기화
		person2.name="가길동";
		person2.weight=3.14;
		System.out.println("[멤버변수 값 할당 후]");
		System.out.println(person2.getPerson());
		
		person2 = new Person();//GC메모리 할당 해제
		System.out.println(person2);
	}////main
}////class
