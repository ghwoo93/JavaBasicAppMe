package console;

import java.util.Scanner;

/*
 * Math클래스의 random()메소드:
 * 0.0사이에서 1.0사이의 double형값을 무작위로
 * 발생시켜주는 메소드(단,1.0은 미 포함)
 * 
 * 특정 범위의 숫자를 랜덤하게 발생 시키려면
 * 
 * (int)(Math.random()*차이값)+시작값
 * 단,끝값은 포함 안됨
 * 끝값을 포함 시키려면
 * (int)(Math.random()*(차이값+1))+시작값
 * 
 * 예] 5부터 15사이의 숫자를 랜덤하게 발생시키려면
 * 차이값: 15-5 =10;
 * 시작값: 5
 * 끝값:15
 * 
 * (int)(Math.random()*10)+5 : 단,15는 발생 안됨
 * 
 * 끝값도 발생시키려면 
 * (int)(Math.random()*11)+5
 */
public class RockPaperScissorsMethodVersion2 {
	//상수 정의]
	final static int SCISSORS=1;
	final static int ROCK=2;
	final static int PAPER=3;
	
	//메뉴 출력용 메소드]
	public static void printMenu() {
		System.out.println("1.가위 2.바위 3.보 4.메뉴재출력 9.종료");
	}//////////////printMenu
	//특정 범위 내의 숫자를 랜덤하게 발생시키는 메소드]
	public static int generateRandomNumber(int start,int end) {
		return (int)(Math.random()*(end-start+1)+start);
	}
	//사용자 숫자 입력받아서 반환하는 메소드]
	public static int inputNumber() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	//게임 승리 여부 판단후 결과 출력하는 메소드]
	public static void judgement(int user, int computer) {
		String userString = getStringValue(user);
		String comString = getStringValue(computer);
		
		System.out.printf("유저:%s 컴퓨터:%s%n",userString,comString);
		if((user==SCISSORS&&computer==PAPER)||
				(user==PAPER&&computer==ROCK)||
				(user==ROCK&&computer==SCISSORS)) {
			System.out.println("승리했습니다");
		}else if(user==computer){
			System.out.println("비겼습니다");
		}else {
			System.out.println("패배했습니다");
		}
	}
	//상수값에 따라 문자열을 반환하는 메소드]
	public static String getStringValue(int rcpNum) {
		switch(rcpNum) {
			case 1: return "가위";
			case 2: return "바위";
			default : return "보";
		}
	}
	///////////////////getStringValue
	
	public static void main(String[] args) {
		printMenu();
		while(true) {
			//1]메뉴 출력
			//2]컴퓨터 숫자 랜덤하게 발생
			int computer =generateRandomNumber(1, 3);
			//3]사용자 숫자 입력 받기			
			int user = inputNumber();
			//3-1]게임종료 여부
			if(user==9) break;
			else if(user==4) printMenu();
			//4]게임 승리여부 판단후 결과 출력
			judgement(user, computer);
		}
	}//////////main
}//////////class
