package stringclass11;

import java.util.Scanner;

import common.utility.CommonUtilities;

public class StringMethod {
	public static void main(String[] args) {
		String str1= "Welcome To Java!";//16
		String str2= "안녕 자바!";//6
		//int lenght()
		System.out.println("[legnth()메소드]");
		System.out.println("str1문자열길이:"+str1.length());
		System.out.println("str2문자열길이:"+str2.length());
		//char charAt(int index)
		System.out.println("charAt()메소드");
		System.out.println("str1의5번째문자:"+str1.charAt(4));
		System.out.println("str2의5번째문자:"+str2.charAt(4));
		//각 인덱스 위치에 해당하는 문자 출력
		for (int i = 0; i < str1.length(); i++) {
			System.out.printf("%d인덱스에 해당하는 문자:%c%n",i,str1.charAt(i));
		}
		String jumin = "012345-1234567";
		System.out.println(jumin.charAt(7)=='1'?"남자":"여자");
		int lastJumin = 1234567;
		//int를 Integer타입으로 바꾼후 toString()메소드로 문자열로 변경
		//오토박싱하거나 혹은 Integer클래스의 메소드 직접 사용
		Integer inst = lastJumin;
		System.out.println(inst.toString().charAt(0)=='1'?"남자":"여자");
		System.out.println(Integer.toString(lastJumin).charAt(0)=='1'?"남자":"여자");
		
		//int codePointAt(int index)
		System.out.println("[codePointAt()]메소드");
		System.out.println("str1의4번째문자의 아스키(유니)코드값:"+str1.codePointAt(3));
		System.out.println("str2의4번째문자의 아스키(유니)코드값:"+Integer.toHexString(str2.codePointAt(3)));
		System.out.println(CommonUtilities.isNumber("1004"));
		System.out.println(CommonUtilities.isNumber("100a"));
		
		//int compareTo(String anotherString)
		//equals는 비교 compareTo는 정렬
		System.out.println("[compareTo()]메소드");
		String str3="ABc";
		String str4="ABC";
		//뒤에서 앞을 뺀다
		System.out.println(str3.compareTo(str4));//32
		System.out.println(str4.compareTo(str3));//-32
		System.out.println("ABCD".compareTo("ABCD")==0);
		System.out.println("ABCD".compareTo("A"));//남은 문자 수
		System.out.println("A".compareTo("ABCD"));
		//String concat(String str)
		System.out.println("[concat()]메소드");
		System.out.println("JAVA".concat(" WORLD").concat(" HI"));
		System.out.println("JAVA"+" WORLD"+" HI");
		//boolean contain(CharSequence s)
		//문자열에 특정 문자열이 포함되었는지
		//판단하는 메소드 특정 문자열이 포함되었으면
		//true 아니면 false 반환.
		System.out.println("[contain()]메소드");
		System.out.println(str1.contains("To"));
		System.out.println(str1.contains("to"));
		String email="kim@nate.com";
		System.out.println(email.contains("@")?"이메일 형식이다":"이메일 형식이 아니다");
		
		//static String copyValueOf(char[] data)
		//static String copyValueOf(char[] data,int offset,in count)
		//시작점 끝점 설정할 수 있음 시작점과 길이
		//static String valueOf(char[] data)
		//static String valueOf(char[] data,int offset,in count)
		System.out.println("[valueOf게열()메소드]");
		char[] chArr= {'A','C','A','D','E','M','Y','!'};
		String stringPlus="";
		for (int i = 0; i < chArr.length; i++) {
			stringPlus+=chArr[i];
		}
		System.out.println(stringPlus);
		System.err.println(String.copyValueOf(chArr));
		System.err.println(String.copyValueOf(chArr,3,4));
		System.err.println(String.valueOf(chArr));
		System.err.println(String.valueOf(chArr,3,4));
		
		//char[] toCharArray()
		System.out.println("[toCharArray() 메소드]");
		chArr="가나다라".toCharArray();
		for(int i=0;i<chArr.length;i++) 
			System.out.printf("chArr[%d]:%-4c",i,chArr[i]);
		System.out.println();
		
		//boolean endWith(String suffix)
		//문자열이 특정 문자열로 끝나면 true,
		//아니면 false
		System.out.println("[endWith() 메소드]");
		System.out.println("www.nate.com".endsWith("com"));
		System.out.println("www.nate.com".endsWith("co.kr"));
		//boolean startWith(String prefix)
		System.out.println("[startsWith() 메소드]");
		System.out.println("www.nate.com".startsWith("www"));
		System.out.println("www.nate.com".startsWith("http"));
		System.out.println("www.nate.com".startsWith("nate",4));
		//static String format(String format,Object ..args)
		//formating converter / specifier
		System.out.println("[format()메소드]");
		System.out.printf("국어:%d,영어:%d,수학:%d,평균:%.2f%n",90,90,90,270/3.0);
		System.out.format("국어:%d,영어:%d,수학:%d,평균:%.2f%n",90,90,90,270/3.0);
		System.out.println(String.format("국어:%d,영어:%d,수학:%d,평균:%.2f",90,90,90,270/3.0));
		//byte[] getBytes()
		//문자열을 byte형 배열로 반환 해줌
		//배열로 반환 될 때 아스키 코드값으로 변환됨.
		byte[] by="ABCD".getBytes();
		for (int i = 0; i < by.length; i++) {
			System.out.println(String.format("by[%d]:%d",i,by[i]));
			System.out.println(String.format("by[%d]:%c",i,by[i]));
		}
		//***********************
		//int indexOf(String str) 
		//시작 인덱스를 반환, 특정 문자열이 없는 경우 -1 반환
		System.out.println("[indexOf()메소드]");
		System.out.println("JAVA".indexOf("AVA"));
		System.out.println("JAVA".indexOf("A"));
		System.out.println("JAVA".indexOf("VA"));
		System.out.println("JAVA".indexOf("aVA"));
		jumin="123456-1234567";
		int index = jumin.indexOf("-")+1;
		System.out.println(jumin.charAt(index)=='1'?"남자":"여자");
		
		//int lastIndexOf(String str)
		System.out.println("[indexOf()메소드]");
		System.out.println("JAVA".lastIndexOf("AVA"));
		System.out.println("JAVA".lastIndexOf("A"));
		System.out.println("JAVA".lastIndexOf("VA"));
		System.out.println("JAVA".lastIndexOf("aVA"));
		System.out.println("my.file.txt".lastIndexOf("."));
		
		//String replace(char oldChar, char newChar)
		//String replace(CharSequence
		//string에 저장된 값은 절대 불변 >immutable
		System.out.println(str1.replace('T', 'G'));
		System.out.println(str1);
		System.out.println(str1.replace("Java", "Korea"));
		System.out.println(str1.replace("Java", "안녕"));
		System.out.println(str1.replace("o", "a"));
		System.out.println(str1.replaceAll("o", "a"));
		
		String password="1234567";
		System.out.println("비밀번호:"+password.replaceAll(".", "*"));
		System.out.println("비밀번호:"+password.replaceAll("[1-4]", "*"));
		System.out.println("비밀번호:"+password.replaceAll("[^1-4]", "*"));
		//String[] split(String regex)
		//문자열을 특정 구분자(혹은 정규표현식에 맞는 패턴)로
		System.out.println("[split()메소드]");
		String tel="010-1234-5678";
		String[] strArr = tel.split("-");
		for(int i=0;i<strArr.length;i++) 
			System.out.println(String.format("strArr[%d]:%s",i,strArr[i]));
		//없는 구분자로 split시 배열의 크기가 1인 메모리가 생성되어서
		//전체 문자열이 인덱스가 0인 방에 저장됨.
		tel="010-1234-5678";
		strArr = tel.split("@");
		for(int i=0;i<strArr.length;i++) {
			System.out.println(String.format("strArr[%d]:%s",i,strArr[i]));
		}
		String today ="2020.08.21";
		strArr=today.split("\\.");//.은 정규식이 아니다라는 것을 알려주기 위해 \\를 붙인다
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(String.format("strArr[%d]:%s",i,strArr[i]));
		}
		//String substring(int beginIndex)
		System.out.println("[split()메소드]");
		System.out.println("Welcome".substring(3));
		String filename="my.file.homework.ppt";
		int beginIndex = filename.lastIndexOf(".")+1;
		System.out.println("lastIndex:"+beginIndex);
		System.out.println("확장자:"+filename.substring(beginIndex));
		//String substring(int beginIndex,int endIndex)
		//시작인덱스부터 끝 인덱스 -1까지 문자열 추출
		//끝인덱스 포함 안됨.
		System.out.println("kim@nate.com".substring(4,8));
		String[] emails = {"a@b.c","kim@cyworld.com","choi@daum.net","lee@naver.com"};
		for (int i = 0; i < emails.length; i++) {
//			int code = emails[i].indexOf("@")+1;
//			int code2 = emails[i].lastIndexOf(".");
			System.out.println(emails[i].substring(emails[i].indexOf("@")+1, emails[i].lastIndexOf(".")));
		}
		//String toLowerCase()
		//String toUpperCase()
		System.out.println("[toLowerCase()/toUpperCase()메소드]");
		System.out.println("대문자로변경:"+str1.toLowerCase());
		System.out.println("소문자로변경:"+str1.toUpperCase());
		//대소문자 구분없이 아이디 체크하기
		//회원의 아이디가 소문자 "park"이라고 가정하자
		Scanner sc =new Scanner(System.in);
		System.out.println("아이디 입력?");
		String nick = sc.nextLine();
		//equalsIgnoreCase
		System.out.println("park".equalsIgnoreCase(nick)?"회원":"비회원");
		//equals나toUpperCase사용
		System.out.println("park".equals(nick.toLowerCase())?"회원":"비회원");
		System.out.println("park".equals(nick.toUpperCase())?"회원":"비회원");
		//String trim()
		//문자열은 값을 비교하기전에 항상 trim()해라
		//항상 문자열 비교시에는 트림후 비교해라
		System.out.println("트림전: X"+"   J  A  V     A          "+"X         ");
		System.out.println("트림전: X"+"   J  A  V     A          ".trim()+"X         ");
	}//main
}//class
