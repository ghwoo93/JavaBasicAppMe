package io24.filter;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.InputMismatchException;

import common.utility.CommonUtilities;

public class BufferedRWKeyboardToFile {
	//스캐너 클래스의 nextLine()이나 nextInt()같은 메소드 만들기
	private static int nextInt() throws InputMismatchException{
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(System.in));
		String inputStr=null;
		try {
			inputStr = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(!CommonUtilities.isNumber(inputStr))
			throw new InputMismatchException();
		
		return Integer.parseInt(inputStr);
	}
	
	private static String nextline() throws InputMismatchException{
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(System.in));
		String inputStr=null;
		try {
			inputStr = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return inputStr;
	}
	
	public static void main(String[] args) throws IOException {
		/*
		//바이트로 입력받아서 필터를 통해서 입력이 들어옴
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		//
		PrintWriter pw = 
				new PrintWriter(
						new FileWriter(
								"src/io24/filter/KeyboardChar.txt"),true);
		String data;
		while((data=br.readLine())!=null) {
			pw.println(data);
		}
		pw.close();
		*/
		System.out.println("나이를 입력하세요");
		int age = nextInt();
		System.out.println("당신의 10년 후 나이:"+(age+10));
		
		System.out.println("이름을 입력하세요");
		System.out.println("당신의 이름:"+nextline());
	}
}
