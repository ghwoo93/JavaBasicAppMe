package stringclass11;

import java.util.Scanner;

import common.utility.CommonUtilities;

public class StringConstructor {
	public static void main(String[] args) {
		byte[] bArr = { 65, 66, 67, 68, 69, 48 };
		System.out.println(bArr.toString());
		System.out.println(bArr);
		String byteToString = new String(bArr);
		System.out.println("바이트형 배열을 문자열로 변환:" + byteToString);

		byteToString = new String(bArr, 2, 3);
		System.out.println("바이트형 배열 일부분을 문자열로 변환:" + byteToString);
		// 문자열을 byte형 배열로:String 클래스의 getBytes
		bArr = byteToString.getBytes();
		for (int i = 0; i < bArr.length; i++)
			System.out.println(String.format("bArr[%d]:%c", i, bArr[i]));

		// char형 배열을 문자열로 변환
		// 생성자 혹은 static String valueOf(char [])이용
		// String(char[] value)
		char[] chArr = { 'H', 'I', '!', ' ', '안', '녕' };
		System.out.println(chArr.toString());
		System.out.println(chArr);
		String charToStr = new String(chArr);
		System.out.println("char형 배열을 문자열로 변환:" + charToStr);
		charToStr = new String(chArr, 4, 2);
		System.out.println("바이트형 배열 일부분을 문자열로 변환:" + charToStr);
		chArr = charToStr.toCharArray();
		for (int i = 0; i < chArr.length; i++)
			System.out.println(String.format("chArr[%d]:%c", i, chArr[i]));

		// 아스키나 유니코드값이 저장된
		// int형 배열을 문자열로 변환\
		// String(int[] codePoints,int offset,int count)
		int[] codePoints = { 50, 51, 65, 66, 44032, 94 };
		String intToString = new String(codePoints, 0, codePoints.length);
		System.out.println("int형 배열을 문자열로 변환:" + intToString);
		
		/* 문자열 입력
		 * nextLine 사용 char형 배열로 변환해서 출력하고
		 * 문자열을 숫자로 변환해서 2를 곱한 값을 출력
		 * 단 입력 받은 문자열이 숫자형식이 아니면
		 * 숫자 형식일때까지 계속 입력받아서 위의 결과를 출력해라
		 */
		Scanner sc = new Scanner(System.in);
		/*
		boolean isDigit;
		String value;
		while(true) {
			value = sc.nextLine();
			isDigit = true;
			for (int i = 0; i < value.length(); i++) {
				if(!Character.isDigit(value.charAt(i))) {
					isDigit = false;
					System.out.println("숫자 형태의 문자열을 입력하세요");
					break;
				}
			}
			if(isDigit) break;
		}*/
		while(true) {
			System.out.println("숫자 형태의 문자열을 입력하세요");
			String value = sc.nextLine();
			if(!CommonUtilities.isNumber(value)) {
				System.out.println("숫자형식이 아닙니다");
				continue;
			}
			chArr = value.toCharArray();
			for (int i = 0; i < chArr.length; i++) {
				System.out.println(String.format("chArr[%d]:%c", i,chArr[i]));
			}
			System.out.println("2를 곱한 값:"+Integer.valueOf(value)*2);
			break;
		}
		/*
		char[] charArr = value.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			System.out.println(
					String.format(
							"charArr[%d]:%c charArr[%d]*2의 숫자값:%d",
							i, charArr[i],i,(int)(charArr[i])*2));
		}
		*/
	}

}
