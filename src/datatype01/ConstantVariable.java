package datatype01;

public class ConstantVariable {
	static final double PI = 3.14;	
	static final int SCISSORS = 1;
	static final int ROCK=2;
	static final int PAPER=3;
	
	public static void main(String[] args) {
		System.out.println(PI);
		//PI=	3.141592653589793;
		//모든 상수는 프로그램 중간에 값 변경 불가
		final String NICKNAME;
		//System.out.println(NICKNAME);
		//상수를 초기화하지 않아서 에러
		NICKNAME = "WOO";
		System.out.println(NICKNAME);
//		NICKNAME = "JAVA";
		//상수는 값 변경 불가
		int computer=1,user=2;
		System.out.println("컴퓨터 lose:가독성낮다");
		computer = SCISSORS;
		user = ROCK;
		System.out.println("컴퓨터 lose:가독성높다");
	}
	
}
