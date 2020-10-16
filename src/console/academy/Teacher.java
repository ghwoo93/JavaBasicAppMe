package console.academy;

public class Teacher extends Person{
	public String subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	@Override
	public String get() {
		return String.format("%s,과목:%s", super.get(),subject);
	}
	@Override
	public void print() {
		System.out.println(get());
	}
}
