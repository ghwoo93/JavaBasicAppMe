package exception21;

import java.io.IOException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionBasicApp {
	static Date today;
	public static void main(String[] args) /*throws IOException*/ {
		int num;
		if(true); {}
		//else {}
		/*
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		try {
			int[] array = new int[2];
			array[0] = 100;
			array[1] = 200;
//			array[2] = 300;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 발생했어요");
			System.out.println("관리자에게 문의하세요");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		try {
//			String strAge = sc.nextLine();
//			int age = Integer.parseInt(strAge);
			int age = sc.nextInt();
			System.out.println("당신의 10년후 나이는 "+(age+10));
		}catch (InputMismatchException | NumberFormatException e) {
			System.out.println("숫자만 입력하시오");
		}
		System.out.println("today:"+today);
		try {
			System.out.println(today.getTime());
		}catch (NullPointerException e) {
			System.out.println("today는 널입니다. 포인터할 수 없어요.");
		}
		
		String emptyString = "";
		System.out.println("emptyString의 문자열 길이:"+emptyString.length());
		String nullString = null;
		try {
			System.out.println("emptyString의 문자열 길이:"+nullString.length());
		}catch (Exception e) {
			System.out.println("nullString은 널 입니다.");
		}
		
		int result=10;
		try {
			result /= 0;
			System.out.println("0으로 나눈 결과:"+result);
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어요.");
		}
		Object obj = new Object();
		try {
			String str = (String)obj;
		} catch (ClassCastException e) {
			System.out.println("형변환 할 수 없어요");
			e.toString();
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
