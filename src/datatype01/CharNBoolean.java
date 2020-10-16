package datatype01;

public class CharNBoolean {
	public static void main(String[] args) {
//		char ch1 = "가";
//		char ch1 = '가나';
		char ch1 = '가';
		System.out.println(ch1);
		char ch2 = 'A';
		int num1 =2;
		System.out.println(ch2+num1);
//		char ch3 = ch2+num1; char형과 int형 연산결과는 int형
		int num2 = ch2+num1;
		System.out.println(num2);
//		char ch3 = ch2 +(char)num1; char형과 char형 연산결과는 int형 
		char ch3 =  (char)(ch2+num1);
		System.out.println(ch3);
		System.out.println((char)num2);
		
		char ch4 = '1';
		char ch4_1 = 49;
		System.out.println(ch4==ch4_1);
		char ch5 ='a';
		char ch5_1 =97;
		System.out.println(ch5+","+ch5_1);
		
		char ch6 = '가';
		char ch6_1 = 44032;
		char ch6_2 = 0xAC00;
		char ch6_3 = '\uAC00';
		System.out.println(ch6+","+ch6_1+","+ch6_2+","+ch6_3);
		System.out.println((int)ch6);
		char ch7 = (char)((int)ch6+1);
		System.out.println(ch7);
		
		int num3=48;
		int num3_1='0';
		System.out.println(num3_1);
		int num4 = num3 - '0';
		System.out.println(num4);
		
		boolean b1=true;
		boolean b2=false;
//		System.out.println(b1+b2);
//		System.out.println(b1>b2);
		System.out.println(b1&&b2);
		boolean b3 = '가' > 30000;
		System.out.println(b3);
		
		
		
	}

}
