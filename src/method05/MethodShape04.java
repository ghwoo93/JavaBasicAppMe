package method05;

import java.io.IOException;
import java.util.Scanner;

//가장 활용빈도가 높음
public class MethodShape04 {
	/*
	 * 인원수를 매개변수로 전달 받아서
	 * 인원수만큼 나이를 사용자로부터 입력받고
	 * 그 나이의 평균값을 반환하는 메소드 정의
	 */
	
	public static int getAvgOfAge(int personCount) {
		int sumOfAge=0;
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<personCount;i++) {
			System.out.println(i+1+"번째 나이 입력");
			sumOfAge+=sc.nextInt();
		}
		return sumOfAge/personCount;
	}
	
	/*
	 * 매개변수로 두 숫자와 연산자를
	 * 전달 받아서 그결과값을 반환하는 메소드를 정의하라
	 */
	public static int cal(int fnum,int snum,char sign)  {
		
		
		switch(sign) {
			case '+':
				return fnum+snum;
			case '-':
				return fnum-snum;
			case '*':
				return fnum*snum;
			case '/':
				return fnum/snum;
			default :
				System.out.println("틀린연산입니다.");
				return -1245721552;
		}
		
	}
	
	/*
	 * 여러개 숫자를 입력받아서 그 중
	 * 최대값을 구하는 메소드를 정의하자
	 * 숫자의 개수는 매개변수로 전달받고
	 * 숫자의 개수만큼 사용자로부터 숫자를 입력받아
	 * 최대값을 구해서 최대값밚놘
	 * 
	 */
	public static int gcdNum(int countNum) {
		Scanner sc = new Scanner(System.in);
		int maxNum=0;
		
//		for(int i=0;i<countNum;i++) {
//			System.out.println(i+1+"번째 숫자 입력");
//			int inputNum = sc.nextInt();
//			if(i==0)maxNum=inputNum;
//			else {
//				if(inputNum>maxNum) maxNum = inputNum;  
//			}
//		}
		
		int[] numArr = new int[countNum];
		for(int i=0;i<countNum;i++) {
			System.out.println(i+1+"번째 숫자 입력");
			numArr[i]=sc.nextInt();
			if(i==0)maxNum=numArr[i];
			else {
				if(maxNum<numArr[i]) maxNum= numArr[i];
			}
		}
		return maxNum;
	}
	
	public static void main(String[] args) {
//		System.out.println(getAvgOfAge(3));
//		
//		int rt = cal(5, 7, '+');
//		
//		if(rt==-1245721552) {
//			System.out.println("잘못된 연산자 기호입니다.");
//		}else {
//			System.out.println(rt);
//		}
		
		System.out.println(gcdNum(5));
		
	}
}
