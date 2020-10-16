package console;

import java.util.Scanner;

import common.utility.CommonUtilities;
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
public class RockPaperScissorsMethodVersion {
	//상수 정의]
	public static final int SCISSORS=1;
	public static final int ROCK=2;
	public static final int PAPER=3;
	
	//1]메뉴 출력
	static void printMenu() {
		System.out.println("=============메뉴 번호=============");
		System.out.println("|1.가위 2.바위 3.보 4.메뉴 다시보기 9.종료 |");
		System.out.println("================================");
	}
	
	//2]컴퓨터 숫자 랜덤하게 발생
	static int getComputerNumber(int start,int end) {
		return (int)(Math.random()*(end-start+1)+start);
	}
	
	//3]사용자 숫자 입력 받기
	static int getUserNumber() {
		System.out.println("입력하시오");
		String menuNumber;
		while(true) {
			Scanner sc = new Scanner(System.in);
			//return sc.nextInt();
			menuNumber = sc.nextLine();
			if(!CommonUtilities.isNumber(menuNumber))
				System.out.println("메뉴번호는 숫자만..");
			else
				break;
		}
		return Integer.parseInt(menuNumber);
	}
	
	//4]게임 승리여부 판단
	static void printGame(int user,int computer) {
		String userString = getStringValue(user);
		String computerString = getStringValue(computer);
		System.out.printf("컴퓨터:%-2s 당신:%-2s%n",computerString,userString);
		if((user==SCISSORS&&computer==PAPER)||
				(user==ROCK&&computer==SCISSORS)||
				(user==PAPER&&computer==ROCK)) {
			System.out.println("당신,승리,축하");
		}else if(user==computer) {
			System.out.println("당신,비김,한심");
		}else {
			System.out.println("당신,패배,안타깝");
		}
	}
	
	//상수값에 따라 문자열을 반환하는 메소드
	static String getStringValue(int menuNumber) {
		switch(menuNumber) {
			case SCISSORS: return "가위";
			case ROCK: return "바위";
			default: return "보";
		}
	}
	
	public static void main(String[] args) {
		
		printMenu();
		while(true) {
			int computer = getComputerNumber(1,3);
			int user = getUserNumber();
			//3-1]게임종료 여부
			if(user==9) {
				System.out.println("다음에 또 봐요");
				break;
			}else if(user==4) {
				printMenu();
				continue;
			}else if(!(user>=1&&user<=4||user==9)) {
				System.out.println("메뉴에 없는 번호입니다");
				continue;
			}
			printGame(user, computer);
		}
		System.out.println("종료");
		
	}

	
}
