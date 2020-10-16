package controlstatement03;

import java.io.IOException;
import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) throws IOException {
		//1부터10까지 누적함
		int sum=0;
		int i=1;
		
		do {
			sum+=i;
			i++;
		} while (i<=10);
		System.out.println(sum);
		
		/*
		 * 무조건 1명의 점수를 입력받아 성적처리
		 */
		 Scanner sc = new Scanner(System.in);
		 int kor,eng,math,exitCode;
		 /*
		 do {
			System.out.println("국어 점수 입력?");
			kor = sc.nextInt();
			System.out.println("영어 점수 입력?");
			eng = sc.nextInt();
			System.out.println("수학 점수 입력?");
			math = sc.nextInt();
			//학점 출력
			switch ((kor+eng+math)/30) {
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
				case 5:
					System.out.println("F학점");
			}
			System.out.println("계속 입력하려면 아무키나\r\n종료하려면 'X'나'x'를 누르세요");
			exitCode = System.in.read();
		} while (!(exitCode == 'X'|| exitCode == 'x'));
		*/
		
		while (true) {
			System.out.println("국어 점수 입력?");
			kor = sc.nextInt();
			System.out.println("영어 점수 입력?");
			eng = sc.nextInt();
			System.out.println("수학 점수 입력?");
			math = sc.nextInt();
			//학점 출력
			switch ((kor+eng+math)/30) {
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
				case 5:
					System.out.println("F학점");
			}
			System.out.println("계속 입력하려면 아무키나\r\n종료하려면 'X'나'x'를 누르세요");
			exitCode = System.in.read();
			if(exitCode == 'X'|| exitCode == 'x') break;
		}
		System.out.println("시스템끝");
		
		 
	}
}
