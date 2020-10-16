package inheritance16;

public class Animal {
	//멤버변수
	String species;
	int year;
	String gender;
	//생성자
	//기본 생성자
	public Animal() {
		super();//하는일 없음
	}
	//인자 생성자
	public Animal(String species, int year, String gender) {
		super();
		this.species = species;
		this.year = year;
		this.gender = gender;
	}
	//멤버메소드
	void printAnimal() {
		System.out.print(
				String.format(
						"종:%s,나이:%s,암수:%s", species,year,gender));
	}
	

}
