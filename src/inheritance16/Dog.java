package inheritance16;
/*
 * Animal을 상속받은 Dog클래스 생성하자
 * (Animal의 기본생성자 정의 안하고 인자생성자만 정의한 경우)
 * 마자 Dog클래스명에 레드라인 해결법
 * 1.부모 클래스에 기본 생성자 정의하거나
 * 2.자식 클래스의 부모 클래스의 인자 생성 호출
 */
public class Dog extends Animal {
	//확장한 멤버
	String dogKind;
	int year;//Dog에서 새롭게 추가(확장)한 멤버 변수
	//기본 생성자]
	public Dog() {
		super(null,0,null);
		//this(null,9,null,null); this와 super는 동시 호출 불가
	}
	public Dog(String species, int year, String gender, String dogKind) {
		super(species, year, gender);
		this.dogKind = dogKind;
//		this.species=species;
//		super.year = year;
//		this.year=year; dog의 year
//		this.gender=gender;
//		this.dogKind=dogKind;
	}
	void bark() {
		//super(); 항상 생성자 안에서 호출가능함
		System.out.println(super.year+"살인 "+dogKind+"가 짖다");
	}
	void printDog() {
		printAnimal();
		System.out.println(",개 종류:"+dogKind);
	}
	static void staticMethod() {
		//super//인스턴스 메소드 에서만 사용가능
		//super();//생성자 안에서만
	}
	int getSuperYear() {
		//Animal의 year
		return super.year;
	}
	
}
