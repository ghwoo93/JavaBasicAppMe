package inheritance16;

public class Person {
	//멤버변수
	String name;
	int age;
	String addr;
	
	public Person() {
		//super();//오브젝트의 기본생성자 아무일도안함
		System.out.println("Person의 기본 생성자");
	}
	public Person(String name) {
		
	}
	String getPerson() {
		return String.format(
				"이름:%s,나이:%s,주소:%s", name,age,addr);
	}
	void print() {
		System.out.println(getPerson());
	}
}
