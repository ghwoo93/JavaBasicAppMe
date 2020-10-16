package constructor15;

class Saram{//초기화용 메소드로 멤버변수 초기화
	String name;
	String lastJumin;
	void initialize(String name, String lastJumin) {
		this.name = name;
		this.lastJumin = lastJumin;
	}
	void print() {
		System.out.println(
				String.format("%s는 %s입니다",
						name,lastJumin.charAt(0)=='1'?"남자":"여자"));
	}
}

class Saram2{
	String name;
	String lastJumin;
	
	public Saram2() {
		name = "기본값";
		lastJumin = "234567";
	}
	//인자생성자
	public Saram2(String name) {
		this.name = name;
		lastJumin = "234567";
	}
	public Saram2(String name,String lastJumin) {
		this.name = name;
		this.lastJumin = lastJumin;
	}

	void print() {
		System.out.println(
				String.format("%s는 %s입니다",
						name,lastJumin.charAt(0)=='1'?"남자":"여자"));
	}
}

public class Constructor01 {
	public static void main(String[] args) {
		//Saram 인스턴스화/객체화/메모리 생성
		Saram saram = new Saram();
		saram.initialize("가길동", "12345");
		saram.print();
		//기본 생성자로 객체 생성
		Saram2 saram2_1 = new Saram2();
		saram2_1.print();
		//인자 생성자로 객체 생성]
		Saram2 saram2_2 = new Saram2("나길동");
		saram2_2.print();
		Saram2 saram2_3 = new Saram2("다길동", "1234");
		saram2_3.print();
		
	}
}
