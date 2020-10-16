package datatype01;

public class JungsuType {
	public static void main(String[] args) {
		byte b1;
		b1 = 127;
		System.out.println("b1="+b1);
//		b1=128;
//		128은 int형 상수로 대입불가
		b1 = (byte)128; //형변환을 하면 예상치 못한 값이 저장됨.
		System.out.println("b1="+b1);//-128
		byte b2 = 20, b3 = 30;
//		byte b4=b2+b3; b2+b3의 더하기 연산 결과는 int
		int num1 = b2+b3;
		System.out.println(num1);
		byte b4 = (byte)(b2+b3);
		System.out.println(b4);
		
		short s1=1000, s2=2000;
//		short s3 = s1+s2;
		num1 = s1+s2;
		System.out.println(num1);
		short s3 = (short)(s1+s2);
		System.out.println(s3);
		
		int num2=100, num3=200;
		long ln1=1000,ln2=2000;
		num1=num2+num3;//연산결과 int형
		System.out.println(num1);
		long ln3 = ln1+ln2;
		System.out.println(ln3);
		
//		int num4 = ln1+ num2;
		int num4 = (int)ln1 + num2;
		System.out.println(num4);
		num4 = (int)(ln1+num2);
		System.out.println(num4);
		
//		long ln4 =22000000000; 소숫점이 붙지않은 숫자는 인트로봄
		long ln4 = 2200000000L;//인트형 상수가 아니라 롱형 상수라고 지시자 L
		System.out.println(ln4);
		num4 = (int)2200000000l;
		System.out.println(num4);
		
		num4=0412;
		System.out.println(num4);
		num4 = 0x1F;
		System.out.println(num4);
		
		/*
		 * 1]국영수 점수 및 점수 총합을 저장할 수 있는
		 * 변수 4개를 선언하여라 int사용
		 * 
		 * 
		 */
		
		int kor,eng,math,tot;
		kor=89;
		eng=99;
		math=78;
		tot = kor+eng+math;
		
		System.out.println("국어:"+kor+"점"+"\n"+"영어:"+eng+"점"+"\n"+"수학:"+math+"점"+"\n"+"총점:"+tot+"점");
//		System.out.println("영어:"+eng+"점");
//		System.out.println("수학:"+math+"점");
//		System.out.println("총점:"+tot+"점");
						
			
	}//main
}//class
