package inheritance16;

public class PersonApp {
	public static void main(String[] args) {
		System.out.println("[기본 생성자로 객체 생성:Student]");
		Student st1 = new Student();
		st1.printStudent();
		//인스턴스 변수로 접근해서 멤버 초기화
		st1.name="가길등";
		st1.age=17;
		st1.addr="가산당";
		st1.stNumber="14학번";
		st1.printStudent();
		st1.study();
		System.out.println("[인자 생성자로 객체 생성:Student]");
		Student st2 = new Student("나길동", 19, "수원", "13학번");
		System.out.println(st2.getStudent());
		
		//Teacher teacher = new Teacher();
		Teacher teacher = new Teacher("홍길동", 40, "인천", "자바");
		teacher.printTeacher();
		teacher.teach();
		
	}
}
