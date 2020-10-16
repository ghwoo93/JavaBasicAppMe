package ectclass12;

import java.util.Random;

public class MathClass {
	private static int abs(int value) {
//		if(value<0) return -value;
//		else return value;
		return value>0? value: -value;
	}
	
	private static long round(double value) {
//		double std = value - (int)value;
//		return value>=0?(std >=0.5?
//				(long)value+1:(long)value):
//					(std >=-0.5?(long)value:(long)value-1);
		return value>0?(long)(value+0.5):(long)(value-0.4);
	}
	
	private static int pow(int num, int loop) {
//		int fNum=num;
//		while(loop>=0) {
//			num=fNum;
//			num*=num;
//			--loop;
//		}
//		return num;
		int result = 1;
		for(int i=0;i<loop;i++) result*=num;
		return result;
	}

	
	public static void main(String[] args) {
		//Math math = new Math(); X
		System.out.println(Math.E);
		
		float f = -3.14f;
		double d = -100.9;
		int num=10;
		System.out.println("[abs()]");
		System.out.println(Math.abs(f));
		System.out.println(Math.abs(d));
		System.out.println(Math.abs(num));
		
		System.out.println(abs(-100));
		System.out.println(abs(100));
		System.out.println(abs(99));
		
		System.out.println("[ceil()]");
		System.out.println(Math.ceil(3.4));
		System.out.println(Math.ceil(3.9));
		System.out.println(Math.ceil(-3.4));
		
		System.out.println("[floor()]");
		System.out.println(Math.floor(3.4));
		System.out.println(Math.floor(3.9));
		System.out.println(Math.floor(-3.4));
		
		System.out.println("round()");
		System.out.println(Math.round(3.59));
		System.out.println(Math.round(3.49));
		System.out.println(Math.round(-3.49));
		System.out.println(Math.round(-3.59));
		System.out.println(Math.round(-1.59));
		System.out.println(Math.round(-1.5));
		
		System.out.println(round(3.59));
		System.out.println(round(3.49));
		System.out.println(round(-3.49));
		System.out.println(round(-3.59));
		System.out.println(round(-1.59));
		System.out.println(round(-0.8));
		
		System.out.println("[min()/max()]");
		System.out.println("최대값:"+Math.max(100, 10));
		System.out.println("최소값:"+Math.min(100, 10));
		
		System.out.println("[pow()]");
		System.out.println(Math.pow(2,3));
		System.out.println(Math.pow(3,2));
		System.out.println("내가만든 pow()");
		System.out.println(pow(2,3));
		System.out.println(pow(3,2));
		
		System.out.println("Random");
		int end=10,start=5;
		//(int)(Math.random*(end-start+1))+start
		//Random클래스의 인스턴스변수.nextInt(end-start+1)+start
		Random random = new Random();
		//시드를 사용하면 처음 난수 불생시킨 숫자를 일정하기 사용할 수 있다
		random.setSeed(System.currentTimeMillis());
		System.out.println((random.nextInt(6)+5));
		System.out.println("시드사용");
		System.out.println(random.nextInt());
	}

}
