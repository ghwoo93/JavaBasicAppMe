package exception21;

import java.io.IOException;

public class ExceptionThrowsApp {
	
	static void throwsMethodByJava() throws IOException{
		System.out.println("문자 입력?");
		System.in.read();
	}
	
	static void callByJava() throws IOException{
		throwsMethodByJava();
	}
	
	static void throwsMethodByUser(int value) throws Exception{
		if(value%2==0) {
			Exception e = new Exception("짝수는 안되요");
			throw e;
//			System.out.println("throw키워드 사용");
		}
	}
	
	static void callByUser(int value) throws Exception {
		throwsMethodByUser(value);
	}
	
	
	public static void main(String[] args) /*throws Exception*/ /*throws IOException*/{
//		callByJava();
		/*
		try {
			callByJava();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		//callByUser(10);
		try {
			callByUser(10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
