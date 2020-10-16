package stringclass11;

import datatype01.StirngType;

public class StringBufferClass {
	/*
	 * 스트링버퍼는 메모리 낭비를 막기위해서
	 * 스트링버퍼클래스가 사용된다
	 * 즉 스트링버퍼클래스는 원래값이 변한다.
	 */
	public static void main(String[] args) {
		/*StringBuffer클래스의 주요 메소드*/
		//StringBuffer buf = "HELLO;;//직적대입 불가
		//스트링버퍼클래스를 생성하면서 문자열 초기화하지 않기
		StringBuffer buf = new StringBuffer();
		System.out.println("sb="+buf);
		System.out.println("sb="+buf.toString());
		System.out.println("sb="+buf.length());
		
		String str = new String("");
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(str.length());
		//
		buf.append("JAVA");
		System.out.println("[JAVA문자열 저장후]");
		System.out.println(buf);
		System.out.println(buf.toString());
		System.out.println(buf.length());
		System.out.println(buf.capacity());
		
		buf.append("0123456789").append("ABCD");
		System.out.println(buf);
		System.out.println(buf.toString());
		System.out.println(buf.length());
		System.out.println(buf.capacity());
		buf.trimToSize();
		System.out.println("trimToSize() 호출 후 버퍼 크기"+buf.capacity());
		
		//StringBuffer delete(int start,int end)
		System.out.println("[delete()메소드]");
		buf.delete(4, 14);
		System.out.println("삭제후 buf:"+buf);
		System.out.println("삭제후 버퍼크기:"+buf.capacity());
		//StringBuffer deleteCharAt(int index
		buf.deleteCharAt(4);
		System.out.println("한문자 삭제후:buf="+buf.capacity());
		//StringBuffer insert(int index,String str
		System.out.println("[insert()메소드]");
		System.out.println("문자열 삽입후:"+buf.insert(4, "12345"));
		System.out.println("0인덱스에 문자열 삽입후:"+buf.insert(0, "가나다라"));
		//가나다라JAVA12345BCD
		//JAVA이후의 문자열부터 끝까지 삭제하자
		buf.delete(buf.indexOf("JAVA")+"JAVA".length(), buf.length());
		System.out.println(buf);
		//StringBuffer replace(int start,int end,String str)
		//start인덱스부터 end-1인덱스까지의 문자열을 str로 바꾼다
		System.out.println("[replace()메소드]");
		int start=buf.indexOf("JAVA");
		int end = start+"JAVA".length();
		System.out.println("JAVA를 자바로 Replace:"+buf.replace(start, end, "자바"));
		//특정 문자열로 초기화하면서 StringBuffer
		buf=new StringBuffer("123456789");
		System.out.println(buf);
		System.out.println(buf.toString());
		System.out.println(buf.length());
		System.out.println(buf.capacity());
		
		//StringReverse
		System.out.println("[reverse()메소드]");
		System.out.println("문자열을 거꾸로:"+buf.reverse());
		String string = "HELLO WORLD!";
		//형변환 및 대입연산불가
		//buf = (StirngBuffer)string;
		buf = new StringBuffer(string);
		
		//String클래스의 메소드를 이용해서 StringBuffer클래스의
		//reverse()메소드와 같은 기능을 하는 메소드를 정의해라
		System.out.println(reverse(string));
		
	}

	private static String reverse(String string) {
		//반복을 2분의1로 줄이고 char[]하나 사용
		char[] src=string.toCharArray();
		for(int i=0;i<src.length/2;i++) {
			char temp = src[i];
			src[i] = src[src.length-1-i];
			src[src.length-1-i] = temp;
		}
		return String.copyValueOf(src);
		/*
		int lastNum = string.lastIndexOf("!");
		String reverse = "";
		for (int j = lastNum; j >=0 ; j--) {
			reverse+=string.charAt(j);
		return reverse;
		}*/
		
		/*
		int lenght = string.length();
		 for(int i =lenght-1;i>=0;i--){
		 	reverse+=string.charAt(i);
		 }
		 */
		
		/*
		char[] chArr = string.toCharArray();
		for (int i = chArr.length-1; i >= 0; i--) {
			reverse+=chArr[i];
		} 
		*/
	}
}
