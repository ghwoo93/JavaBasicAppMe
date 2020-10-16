package datatype01;

import java.math.BigDecimal;

public class Silsu {
	public static void main(String[] args) {
		//정수형보다 실수형이 더 큰 그릇이다
		//실수형이 소수점 표현으로 인해 더 크기 때문
		long ln = 100;
		float f1 = 200;
		float f2 = ln+f1;
		System.out.println(f2);
		long ln1 = (long)(ln+f1);
		System.out.println(ln1);
		
		float kor=99,eng=80,math=96;
		float avg=(kor+eng+math)/3;
		System.out.println(avg);
		System.out.println((int)avg);
		
		int kor1=99,eng1=80,math1=96;
		double avg1 = (kor1+eng1+math1)/3.0;//3.0이 더블
		System.out.println(avg1);
		System.out.println((int)avg1);
		
//		float f3 = 3.14;//더블이 대표상수
		float f3 = 100;
		f3 = (float)3.14;
		System.out.println(f3);
		f3=3.14f;
		
		float ff1=100,ff2=3.14f,fresult;
		double d1=100,d2=3.14,dresult;
		fresult = ff1+ff2;
		System.out.println(fresult);
		dresult = d1+d2;
		System.out.println(dresult);
		
		// 파이알제곱
		int r = 10;
		double pi = 3.14;

		int iarea;
		double darea;
		float farea;
						
		darea = r*r*pi;
		iarea = (int)darea;
		farea = (float)darea;
		
		System.out.println("인트면적:"+iarea);
		System.out.println("더블면적:"+darea);
		System.out.println("플롯면적:"+farea);
		
		System.out.println("인트면적(정수):"+iarea);
		System.out.println("더블면적(정수):"+(int)darea);
		System.out.println("플롯면적(정수):"+(int)farea);
		
		d1=0.1;
		d2=0.2;
		System.out.println(d1+d2);
		System.out.println(d1*d2);
		System.out.println(d1+d2==0.3);
		BigDecimal big1 = new BigDecimal("0.1");
		BigDecimal big2 = new BigDecimal("0.2");
		System.out.println(big1.add(big2));
	    BigDecimal big_add = big1.add(big2);
	    BigDecimal big3 = new BigDecimal("0.3");
	    System.out.println(big_add.compareTo(big3)==0);
	    System.out.println(big1.multiply(big2));
	    
	    BigDecimal big4 = new BigDecimal(0.1);
	    BigDecimal big5 = new BigDecimal(0.2);
	    BigDecimal big6 = big4.add(big5);
	    System.out.println(big6);
	    System.out.println(big6.compareTo(new BigDecimal(0.3)));
	    
	}

}
