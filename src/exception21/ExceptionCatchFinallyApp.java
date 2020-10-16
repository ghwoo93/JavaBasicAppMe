package exception21;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionCatchFinallyApp {
	static void compile() throws IOException {
		System.out.println("한 문자를 입력하세요?");
		int ascii = System.in.read();
		System.out.println("입력한 문자:"+(char)ascii);
		/*
		try {
			int ascii = System.in.read();
			System.out.println("입력한 문자:"+(char)ascii);
		}catch(Exception e) {
			
		}
		*/
	}
	//런타임 예외 발생하는 메소드
	static void runtime() {
		Integer.parseInt("일억원");
	}
	static void tryCatchFinally() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요?");
		int age = -10;
		try {
			age = sc.nextInt();
			//return;
			System.exit(0);
		}catch(Exception e) {
			System.out.println("나이는 숫자만...");
		}finally {
			System.out.println("당신의 10년 후 나이:"+(age+10));
		}
	}
	static void tryFinally() throws IOException {
		try {
			compile();
		}finally {
			System.out.println("반드시 실행할 명령문");
		}
	}
	
	public static void main(String[] args) throws IOException 
			/*throws NumberFormatException*/ /*throws IOException */{
		try{
			compile();
		}catch(IOException e){
			
		}
		try {
			runtime();
		}catch(Exception e) {
			System.out.println(
					"숫자 형식이 아니에요:"+e.getMessage().split(":")[1].trim());
		}
		tryCatchFinally();
		tryFinally();
	}
}
