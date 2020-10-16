package inheritance16;

public class AnimalApp {
	public static void main(String[] args) {
		Dog dog = new Dog("포유류", 2, "수컷", "치와와");
		dog.printDog();
		dog.bark();
		dog.printAnimal();
		System.out.println(dog.year);
		System.out.println(dog.getSuperYear());
	}
}
/*
 accessmodifier07 > polymorphism14
 protected			오버라이딩(다형성)
 					이질화 헤테로지니어스
 					
*/