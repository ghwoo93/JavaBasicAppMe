package controlstatement03;

import java.io.IOException;
import java.util.Scanner;

public class SwitchStatament {
	public static void main(String[] args) throws IOException {
		//jdk 5.0부터 추가된 클래스 : Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int inputNumber = sc.nextInt();
		System.out.println("입력한 숫자:"+inputNumber);
		
		System.out.println("[if문으로 나머지값 판단]");
		int remain = inputNumber%3;
		if(remain==0)System.out.println("나머지가 0");
		else if(remain==1)System.out.println("나머지가 1");
		else System.out.println("나머지가 2");
		
		System.out.println("[switch문으로 나머지값 판단]");
		switch (remain) {
		case 0:
			System.out.println("나머지가 0");
			break;
		case 1:
			System.out.println("나머지가 1");
			break;
		default:
			System.out.println("나머지가 2");
		}
		
		//switch문에는 정수식 즉 결과값이 byte,short,int,char,String
		//타입은 가능 boolean값은 불가 비교식 논리식 사용할수 없다
//		switch (inputNumber%3==0) { }
//		switch (inputNumber%3==0||inputNumber>100) {}
		
		byte b = 5;
		switch(b) {
			case 1:
				System.out.println("b에 저장된 값1");
				break;
//			case 1:
//				System.out.println("b에 저장된 값1");
//				break;
			case 2:
				System.out.println("b에 저장된 값2");
				break;
			case 5:
				System.out.println("b에 저장된 값5");
				break;
			case 10:
				System.out.println("b에 저장된 값10");
		}
		
		long ln=5;
//		switch(ln) {}
//		switch(ln%3) {}
		System.out.println("첫번째 숫자 입력?");
		int fnum = sc.nextInt();
		System.out.println("연산자 기호 입력(+,-,*,/) 입력?");
		char op = (char)System.in.read();
		System.out.println("두번째 숫자 입력?");
		int snum = sc.nextInt();
		System.out.printf("fnum:%d,snum:%d,op:%c%n",fnum,snum,op);
		
		switch (op) {
		case '+':
			System.out.printf("%d+%d=%d%n",fnum,snum,fnum+snum);
			break;
		case '-':
			System.out.printf("%d-%d=%d%n",fnum,snum,fnum-snum);
			break;
		case '*':
			System.out.printf("%d*%d=%d%n",fnum,snum,fnum*snum);
			break;
		case '/':
			System.out.printf("%d/%d=%d%n",fnum,snum,fnum/snum);
			break;
		default:
			System.out.printf("잘못된 연산자 기호입니다:%c%n",op);
			break;
		}
		
		String subject = "수학";
		switch (subject) {
		case "국어":
			System.out.println("과묵은 국어");
			break;
		case "수학":
			System.out.println("과묵은 수학");
			break;
		case "영어":
			System.out.println("과묵은 영어");
			break;
		default:
			System.out.println("없어");
		}
		
		switch (inputNumber) {
		case 1:
		case 2:
		case 100:
		case 200:
			System.out.println("1거나 2이거나 100이거나 200중 하나");
			break;
		case 300:
			System.out.println(300);
		}
		
		/*
		 * 평균을 구해서 학점
		 */
		System.out.println("국어 점수 입력?");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력?");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력?");
		int math = sc.nextInt();
		
		double avg = (kor+eng+math)/3.0;
		int cal = (int)avg/10;
		
		switch (cal) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;	
		case 7:
			System.out.println("C학점");
			break;	
		case 6:
			System.out.println("D학점");
			break;	
		default:
			System.out.println("F학점");
		}
		
	}
}
