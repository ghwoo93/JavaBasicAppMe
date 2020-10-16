package datatype01;

import java.lang.reflect.Array;

public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * 1]자동 형변환:
		 * 	작은 그릇의 데이터를 큰그릇에 넣을 때
		 * 	형변환이 자동으로 일어난다
		 */
		byte b1 = 65;
		short s1;
		s1=b1;
		System.out.printf("b1은 %d s1은 %d%n",b1,s1);
				
//		int num1 = b1+s1;
		//문자는 unsigned 숫자는 signed라서 구조가 틀려서 자동형변환x
//		char ch1 = b1;
		char ch1 = (char) b1;
		System.out.printf("ch1은 %c%n",ch1);
		
		short s2 = 100;
		byte b2 = (byte)s2;
		System.out.printf("데이터 미 손실]s2는 %d b2는 %d%n",s2,b2);
		
		int num3=300;
		b2 = (byte)num3;
		System.out.printf("데이터 손실]num3는 %d b2는 %d%n",num3,b2);
		
		double dl=3.14;
//		int num4=num3+dl;
		int num4=(int) (num3+dl);
		num4=num3+(int)dl;
		double dl2=num3+dl;
		
//		System.out.println(5/0);
//		System.out.println(5%0);
	}

}
