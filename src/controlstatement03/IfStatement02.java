package controlstatement03;

import java.io.IOException;
import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) throws IOException {
		/*
		 * if문 기본형식2]
		 * 경우가 두개일 때 
		 * if(조건식){
		 *   조건식이 참일 때 실항할 명령문;
		 * }else{
		 * 	else단독으로 사용이 불가능하다
		 * 	 조건식이 거짓일 때 실행할 명령문;
		 * }
		 * 역시 실행할 명령문이 하나일 때는
		 * {} 생략가능
		 */
		int num1 = 100;
		
		System.out.println("[if문 형식 첫번째로 짝/홀수 판단]");
		if(num1%2==0)System.out.println("짝수");
		if(num1%2!=0)System.out.println("홀수");
		
		System.out.println("[if문 형식 두번째로 짝/홀수 판단]");
		if(num1%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		/*
		 * 삼항 연산자
		 * if~else 문과 같다
		 * 간결한 지시문일때 주로 사용
		 * 코드를 짧게 표현할 때 대신 사용
		 * 변수 = 조건식 ? 참일때 값 : 거짓일때 값;
		 */
		
		System.out.println("[삼항 연산자로 짝/홀수 판단]");
//		String strResult = num1%2==0?"짝수":"홀수";
//		System.out.println(strResult);
		System.out.println(num1%2==0?"짝수":"홀수");
		
		System.out.println("[짝/홀수 판단후 짝수인 경우 100이상인지 판단 - if~else문]");
		if(num1%2==0) {
			if(num1>=100)System.out.println("짝수이면서 100이상");
			else System.out.println("짝수이면서 100미만");
		}
		
		System.out.println("[짝/홀수 판단후 짝수인 경우 100이상인지 판단 - 삼항연산자]");
		System.out.println(num1%2==0?num1>100?"짝수이면서 100이상":"짝수이면서 100미만":"");
		
		if(num1%2!=0) //{
			System.out.println("num1은"+num1);
			System.out.println(num1+"은 홀수");
		//}아래 else는 짝을 이루는 if문이 없다.
		//else System.out.println(num1+"은 짝수");
			
		/*
		 * 한 문자를 입력받아 숫자인지 아닌지
		 * if else문과 삼항연산자를 이용하여 판단하라
		 */
		System.out.println("한 문자를 입력하시오");
		int asciiCode = System.in.read();
//		System.out.println("[if~else문 사용]");
//		if(asciiCode >= '0' && asciiCode <='9') System.out.println("숫자이다");
//		else System.out.println("숫자아니다");
//		System.in.skip(5);
//		
//		System.out.println("[삼항 연산자 사용]");
//		System.out.println(asciiCode >= '0' && asciiCode <='9'?"숫자이다":"숫자아니다");
		
		/*
		 * 숫자판단
		 * 2의배수 판단
		 * 2의배수 > 2의배수맞음 출력
		 * 2의배수x > 2의배수아님 출력
		 * 숫자 아닐시
		 * 알파벳 대소문자 판단
		 * 대문자 > 대문자출력
		 * 소문자 > 소문자출력
		 * 가정)숫자나 알파벳만 입력한다고 가정하자
		 */
		System.out.println("[if~else문 사용]");
		if(asciiCode >= '0' && asciiCode <='9') {
			if(asciiCode%2==0) System.out.println("2의배수맞음");
			else System.out.println("2의배수아님");
		}else {
			if(asciiCode>='A'&&asciiCode<='Z') System.out.println("대문자");
			else System.out.println("소문자");
		}
		
		//삼항연산시 헷갈릴때 먼저 예외를 줄바꿈해주고 괄호랑 줄을 사용해서 나눠서 생각!!
		System.out.println("[삼항 연산자 사용]");
		System.out.println(asciiCode >= '0' && asciiCode <='9'?(asciiCode%2==0?"2의배수":"2의배수아님"):
									(asciiCode>='A'&&asciiCode<='Z'?"대문자":"소문자"));
	}

}
