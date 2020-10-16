package polymorphism14;

import java.util.Date;

public class Overloading {
	
	//int noOverloading(String str,Date date) {return -1;}
	//float noOverloading(String str2,Date date2) {return -1;}
	/*
	 * 두 메소드는 같은 메소드임 오버로딩이 아님
	 * 메소드명 동일,매개변수 타입 및 개수 및 순서가 동일하기 때문에
	 * 같은 메소드로 본다
	 * 반환타입과는 전혀 상관없다.
	 */
	//1]매개변수 타입이 다른 경우 - 양념의 종류가 다른 경ㅇ우
	void paramTypeDiff(int param) {}
	void paramTypeDiff(float param) {}
	void paramTypeDiff(double param) {}
	//2]매개변수 갯수가 다른 경우 - 양념을 넣는 횟수가 다른 경우
	void paramCountDiff() {}
	void paramCountDiff(int param) {}
	void paramCountDiff(int param,int param2) {}
	void paramCountDiff(int param,int param2,int param3) {}
	//3]매개변수 순서가 다른 경우 - 같은 양념이지만 넣는 순서를 바꿈
	void paramOrderDiff(int args1,float args2,double args3) {}
	void paramOrderDiff(int args1,double args3,float args2) {}
	void paramOrderDiff(double args3,float args2,int args1) {}
	void paramOrderDiff(double args3,int args1,float args2) {}
	void paramOrderDiff(float args2,int args1,double args3) {}
	void paramOrderDiff(float args2,double args3,int args1) {}
	//VarArgs기능 미사용
	/*
	static int getTotal(int param) {
		int total=0;
		total+=param;
		return total;
	}
	static int getTotal(int param1,int param2) {
		int total=0;
		total+=param1+param2;
		return total;
	}
	static int getTotal(int param1,int param2,int param3) {
		int total=0;
		total+=param1+param2+param3;
		return total;
	}*/
	
	//VarArgs기능 사용
	static int getTotal(int ... param) {
		int total=0;
		for (int i = 0; i < param.length; i++) 
			total += param[i];
		return total;
	}
	public static void main(String[] args) {
		System.out.println(getTotal(10));
		System.out.println(getTotal(10,20));
		System.out.println(getTotal(10,20,30));
		System.out.println(getTotal(10,20,30,40));
	}
}
