package abstraction06;

//사람을 추상화 해보자
//사람의 설계도를 만들어보자
//사람의 행동과 속성을 뽑아내서
//행동은 메서드로 속성은 상수나 멤버변수로
public class Person {
	//[멤버 변수 선언]
	//1]멤버변수
	//has a 관계
	public String name;//이름 속성 퍼블릭 접근지정자 사용
	int age=1;//나이속성-생략형(패키지) 접근지정자 사용 선언과 동시에 초기화
	double weight;//몸무게 속성-생략형 접근지정자 사용
	
	//[멤버 메소드 정의]
	void sleep() {
		System.out.println(name+"가(이) 자다");
	}
	void eat() {
		System.out.printf(
				"나이가 %d살인 %s가 먹다%n그래서 몸무게가 %.2fKg이다%n"
				,age,name,weight);
	}
	
	//프로그램 효율성을 위한 메소드들]
	public String getPerson() {
		return 
				"["+name+"의 정보]\r\n나이:"+age+"\r\n몸무게:"+weight;
	}
	void printPerson() {
		System.out.println(getPerson());
	}
			
}
