package controlstatement03;

import java.io.IOException;

public class IfStatement03 {
	public static void main(String[] args) throws IOException {
		int kor=99,eng=80,math=89;
		double avg=(kor+eng+math)/3.0;
		
		if(avg >=90) System.out.println("A학점");
		else if(avg >=80) System.out.println("B학점");
		else if(avg >=80) System.out.println("C학점");
		else if(avg >=80) System.out.println("D학점");
		else System.out.println("F학점");
		
		System.out.println("한문자를 입력하세요");
		char word = (char)System.in.read();
		/*
		 * 숫자판단
		 * 2의배수판단
		 * 2의배수 > 2배수맞음출력
		 * 2배수아님 > 2배수아님출력
		 * 숫자아님
		 * 알파벳대소문판단
		 * 대문자 > 대문자출력
		 * 소문자 > 소문자출력
		 * 나머지 기타
		 * if ~else if 사용
		 */
		if(word>='0'&&word<='9'&&word%2==0) System.out.println("2의배수");
		else if(word>='0'&&word<='9'&&word%2!=0) System.out.println("2의배수아님");
		else if(word>='A'&&word<='Z') System.out.println("대문자");
		else if(word>='a'&&word<='z') System.out.println("소문자");
		else System.out.println("기타"); 
		
		/*
		 * 위에서 입력받은 문자가 숫자이면 "숫자"
		 * 알파벳이면 "알파벳"
		 * 숫자도 알파벳도 아니면 "기타"를 출력하라
		 */
		if(word>='0'&&word<='9') System.out.println("숫자");
		else if(word>='A'&&word<='Z'||word>'a'&&word<'z') System.out.println("알파벳");
		else System.out.println("기타");
		
		/*
		 * 세 숫자 중 최대 값을 구하는 로직을 작성하자 
		 */
		int num1=900,num2=780,num3=430;
		int max=num1;
		
		if(num2-max>0) max = num2;
		else if(num3-max>0) max = num3;
		
		System.out.println("최대값은"+max+"이다.");
		
//		if(num1-num2>0) {
//			//1이 클때
//			if(num1-num3>0) {
//				//1이 클때
//			}else if(num1-num3<0){
//				//3이 클때
//			}else {
//				//1과3이 같을때
//			}
//		}else if (num1-num2<0) {
//			//2가 클때
//			if(num2-num3>0) {
//				//2가 클때
//			}else if(num2-num3<0) {
//				//3이 클때
//			}else {
//				//2와 3이 같을때
//			}
//		}else {
//			//1과2가 같을때
//			if(num1-num3>0) {
//				//1이 큼
//			}else if(num1-num3<0) {
//				//3이 큼
//			}else {
//				//1과 3이 같음
//				//2와 3비교
//				//3이 큼 
//			}
//		}
	}
}
