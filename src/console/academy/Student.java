package console.academy;

public class Student extends Person{
	//멤버변수
	public String stNumber;
	//인자생성자

	public Student(String name, int age, String stNumber) {
		super(name, age);
		this.stNumber = stNumber;
	}
	@Override
	public String get() {
		return String.format("%s,학번:%s", super.get(),stNumber);
	}
	@Override
	public void print() {
		System.out.println(get());
	}
}
