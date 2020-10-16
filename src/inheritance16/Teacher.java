package inheritance16;

public class Teacher extends Person {
	//멤버변수
	//이름과 나이와 주소는 상속받아서 사용
	//teacher클래스에 새롭게 확장
	String subject;

	public Teacher(String name,int age,String addr,String subject) {
		super();//부모 클래스의 기본 생성자생략해도 자동호출된다
		this.subject = subject;
		this.name = name;
		this.age = age;
		this.addr = addr;
		System.out.println("Teacher의 인자 생성자");
	}
	//멤버 메소드]
	void teach() {
		System.out.println(String.format("%s샘이 %s과목을 가르치다",name,subject));
	}
	String getTeacher() {
		return String.format(
				"%s,학번:%s", getPerson(),subject);
	}
	void printTeacher() {
		System.out.println(getTeacher());
	}
}
