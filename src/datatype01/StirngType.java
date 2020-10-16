package datatype01;

public class StirngType {
	public static void main(String[] args) {
		int number;//변수선언
		number =99;//변수초기화
		//참조형과 기본자료형 사이에 형변환 불가함
//		String strNumber = (String)number;
//		int initString = (int)"100";
		String strNumber = "100";
		System.out.println(strNumber+number);
		String newString = new String("new 연산자 사용");
		System.out.println(newString);
		String stringLikeBasic= "기본자료형처럼 문자열 저장";
		System.out.println(stringLikeBasic);
		
		String plusString;
		plusString = newString+","+stringLikeBasic;
		System.out.println(plusString);
		
		int kor=100,eng=100,math=100;
		System.out.println("총점:"+kor+eng+math);
		System.out.println("총점:"+(kor+eng+math));
				
		
	
	}
}
