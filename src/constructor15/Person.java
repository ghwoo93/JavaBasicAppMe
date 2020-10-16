package constructor15;

public class Person {
	//멤버변수
	String name;
	int age;
	String addr;
	//멤버메소드
	//멤버변수 초기화용 메소드
	void initialize(String name,int age,String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
//	public Person() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	public Person() {
		/*name = "미상";
		age=1;
		addr="부모님 주소";*/
		this("미상",1,"부모님 주소");
		System.out.println("기본 생성자");
	}
	public Person(String name) {
		/*this.name = name;
		age = 1;
		addr = "부모님 주소";*/
		this(name,1,"부모님 주소");
		System.out.println("인자 생성자:name");
	}
	public Person(String name,int age) {
		/*this.name = name;
		this.age = age;
		addr = "부모님 주소";*/
		this(name,age,"부모님 주소");
		System.out.println("인자 생성자:name,age");
	}
	public Person(String name,int age,String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		System.out.println("인자 생성자:name,age,addr");
	}
	
	//정보출력용 메소드
	void print() {
		System.out.println(
				String.format(
						"[%s님의 정보]%n나이:%d%n사는곳:%s", name,age,addr));
	}
}
