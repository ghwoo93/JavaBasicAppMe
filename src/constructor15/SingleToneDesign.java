package constructor15;

//싱글톤으로 미설계시
class NosingleTone {
	//멤버변수
	int noShareVar;
	//멤버메소드
	void print() {
		System.out.println("noShareVar:"+noShareVar);
	}
}
class SingleTone{
	//멤버변수
	int shareVar;
	private static SingleTone single = new SingleTone();
	//getInstance()가 static이므로 static 멤버여야함
	//생성자
	//1.접근 지정자를 private로 지정
	private SingleTone() {}
	//멤버메소드
	//2.정적메소드로 해당 클래스의 객체를 반환하도록 정의한다.
	public static SingleTone getInstance() {
		return single;
	}
	void print() {
		System.out.println("shareVar:"+shareVar);
	}
	
}
public class SingleToneDesign {
	public static void main(String[] args) {
		//싱글톤으로 미 설계시
		//new 할때마다 메모리가 생긴다
		NosingleTone no1 = new NosingleTone();
		no1.noShareVar=100;
		no1.print();
		
		NosingleTone no2 = new NosingleTone();
		no2.noShareVar=200;
		no2.print();
		
		System.out.println(
				String.format(
						"no1:%s,no2:%s,no1의 noShareVar:%s,no2의 noShareVar:%s"
										,no1,no2,no1.noShareVar,no2.noShareVar ));
		
		//싱글톤
		//SingleTone st1 = new SingleTone(); 인스턴스화 불건웅
		SingleTone st1 = SingleTone.getInstance();
		st1.shareVar=100;
		st1.print();
		SingleTone st2 = SingleTone.getInstance();
		st2.shareVar=200;
		st2.print();
		System.out.println(
				String.format(
						"no1:%s,no2:%s,no1의 noShareVar:%s,no2의 noShareVar:%s"
										,st1,st2,st1.shareVar,st2.shareVar));
		
	}
}
