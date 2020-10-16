package wrapperclass10;

import java.util.Scanner;

import javax.swing.text.ChangedCharSetException;

import common.utility.CommonUtilities;

public class WrapperClass03 {
	//문]안자로 전달받은 value가 숫자형식이면 true반환 아니면 false를 반환하는
	//	메소드를 정의해라
	public static boolean isNumber(String value) {
		for(int i=0;i<value.length();i++) {
			if( !(Character.isDigit(Character.codePointAt(value, i) ) ) ){
				return false;
			}
		}
		return true;
//		for(int i=0;i<value.length();i++) {
//			int codeValue = Character.codePointAt(value, i);
//			if(!(codeValue>='0'&&codeValue<='9'))
//				return false;
//		}
//		return true;
	}
	
	public static void main(String[] args) {
		/*jdk 1.4이전 버전의 코딩형태*/
		char ch = 'A';
		Character chObj = new Character(ch);
		char chResult = (char)(chObj.charValue()+1);
		System.out.println(chResult);
		/*jdk 5.0이후 버전의 코딩 형태*/
		chObj = 'C';//오토박싱
		chResult=chObj;//오토언박싱
		System.out.println("chResult:"+chResult);
		/*
		 * 
		 * 아스키코드(유니코드)값을 반환한다.
		 */
		System.out.println(Character.codePointAt("가나다라", 3));
		//is로 시작하는 메소드는 대게 불린반환
		System.out.println("isDigit?");
		System.out.println(Character.isDigit('A')?"숫자다":"숫자가아니다");
		System.out.println(Character.isDigit('2')?"숫자다":"숫자가아니다");
		System.out.println(Character.isDigit(65)?"숫자다":"숫자가아니다");
		System.out.println(Character.isDigit(50)?"숫자다":"숫자가아니다");
		System.out.println(Character.isDigit('가')?"숫자다":"숫자가아니다");
		System.out.println(Character.isDigit(44032)?"숫자다":"숫자가아니다");
		System.out.println("isNum?");
		System.out.println(isNumber("1004"));
		System.out.println(isNumber("100사"));
		System.out.println(isNumber("10CCA445"));
		
		//isLetter
		//언어 한글 한문 영어 일본어등에 핻ㅇ하는 것만 판단하는 메소드
		System.out.println("isLetter?");
		System.out.println(Character.isLetter('가'));
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isLetter('家'));
		System.out.println(Character.isLetter('9'));
		System.out.println(Character.isLetter('@'));
		System.out.println(Character.isLetter(' '));
		//isWhitespace
		System.out.println("isWhitespace?");
		System.out.println(Character.isWhitespace('가'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println((int)' ');
		System.out.println(Character.isWhitespace(32));
		String whiteString = "  H   E   L    L   O   ";
		int whiteCount = 0;
		for(int i=0;i<whiteString.length();i++) {
			if(Character.isWhitespace(Character.codePointAt(whiteString, i)))
				whiteCount++;
		}
		System.out.println("whiteCount="+whiteCount);
		//isLowerCase
		//isUpperCase
		//알파벳이 아닌 문자에 적용시 모두 false반환
		System.out.println("isLowerCase?");
		System.out.println("isUpperCase?");
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isUpperCase('家'));
		System.out.println(Character.isLowerCase('가'));
		
		/*
		 * 아이디입력
		 * 영문자 소문자 숫자로만 입렵받아야됨
		 * 대문자가 포함되면 잘못입력 출력
		 * 제대로된 아이디를 입력 받을 때 까지 계속 입렵받고
		 * 
		 * 단, 숫자로 시작해서도 안됨
		 * 숫자로 시작했어도 잘못입력 출력
		 */
//		System.out.println("[String클래스의 toCharArray()메소드");
		Scanner sc = new Scanner(System.in);
		while(true) {
			//여기서부터
			System.out.println("아이디를 입력하세요");
			String id = sc.nextLine();
			char[] chArr = id.toCharArray();
			boolean isRight=true;
			for(int i=0;i<id.length();i++) {
//				if(Character.isDigit(chArr[0])||
//						!Character.isLowerCase(chArr[i])&&//소문자가 아님
//						!Character.isDigit(chArr[i])) {//숫자가 아님
//					isRight=false;
//					break;
//				}
				if( !(Character.isLowerCase(chArr[i])||Character.isDigit(chArr[i] ) ) ) {
					if(Character.isUpperCase(chArr[i])){
						System.out.println("아이디에 [대문자]가 포함될 수 없습니다.");
					}else 
						System.out.println("아이디는 [소문자]와 [숫자]로만 생성해야합니다.");
					isRight=false;
					break;
				}else {
					if(Character.isDigit(chArr[0])) {
						System.out.println("첫번째 자리가 [숫자]가 될 수 없습니다.");
						isRight=false;
						break;
					}
				}
				
			}
			//조건을 줘서 빠져나가게끔
			if(isRight) {
				System.out.println("당신의 아이디는 "+id);
				break;
			}
		}
		System.out.println("완료");
		
		//대문자 > 소문자, 소문자 > 대문자
		System.out.println("toLowerCase/toUpperCase");
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toUpperCase('A'));
		System.out.println(Character.toLowerCase('a'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toLowerCase('가'));
		System.out.println(Character.toLowerCase('9'));
		
		/*
		 * 대 > 소
		 * 소 > 대
		 * 출력
		 */
		System.out.println("영문자를 입력하세요?");
		String alphabet = sc.nextLine();
		char[] exch = alphabet.toCharArray();
		System.out.println(exch);
		for(int i=0;i<alphabet.length();i++) {
			if(Character.isUpperCase(exch[i])||
					Character.isLowerCase(exch[i])) {
				if(Character.isUpperCase(exch[i])) {
					exch[i]=Character.toLowerCase(exch[i]);
				}else {
					exch[i]=Character.toUpperCase(exch[i]);
				}
			}
			System.out.print(exch[i]);
		}
		System.out.println();
		//위 최종변화를 거꾸로
		System.out.println("거꾸로 출력");
		for (int i = exch.length-1; i >=0 ; i--) {
			System.out.print(exch[i]);
		}
		System.out.println();
		/*
		 * 모든 Wrapper클래스는 기본 자료형을
		 * String형으로 변환 해줄 수 있는 아래와 같은 메소드를
		 * 공통으로 갖고 있음
		 * String toString()
		 * static String toString(기본 자료형 타입)
		 */
		short s =200;
		System.out.println(Short.toString(s));
		Short sObj =s;//오토박싱
		System.out.println(sObj.toString());
		System.out.println(new Short(s).toString());
		
		ch='가';
		System.out.println(Character.toString(ch));
		//오토박싱 하지 않고 
		System.out.println(Character.valueOf(ch).toString());
		
		boolean b= true;
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.valueOf(b).toString());
		/*
		 * 
		 */
		String boolString = "TRue";//"TRue" -> true
		System.out.println(Boolean.parseBoolean(boolString)&&false);
		System.out.println(Boolean.valueOf(boolString)&&true);
	}
}
