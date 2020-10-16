package abstraction06;
class Car{
	//멤버상수
	public static final String AUTO="자동";
	public static final String MANUAL="수동";
	//멤버변수
	String carModel;//차량모델
	int carYear;//연식
	String carGear=AUTO;//차량기어
	Person owner;//차량 소유주
	//멤버 메소드
	void drive() {
		System.out.println(owner.name+"가"+carModel+"을 운전한다.");
	}
	//프로그램 효율을 위한 멤버 메소드
	//멤버변수 초기화용 메소드
	void initialize() {
		carModel="벤틀리";
		carYear=2020;
		owner=new Person();
		owner.name="가길동";
		owner.age=20;
		owner.weight=70;
	}
	void printCar() {
		System.out.println("[차량정보]");
		System.out.println("모델명:"+carModel);
		System.out.println("연식:"+carYear);
		System.out.println("기어:"+carGear);
		System.out.print("소유주:");
		owner.printPerson();
	}
	
}

public class CarApp {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("[멤버변수 초기화용 메소드(initialize) 호출 전]");
		car1.initialize();
		car1.printCar();
		
		Car car2 = new Car();
		car2.carModel="포르쉐";
		car2.carGear=Car.MANUAL;//스태틱붙으면 클래스이름으로 접근
		car2.carYear=21;
		
		car2.owner = new Person();
		car2.owner.age=20;
		car2.owner.weight=60;
		car2.owner.name="박길동";
		car2.printCar();
		
		car1.drive();
		car2.drive();
		
	}
}
