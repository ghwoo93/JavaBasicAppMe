package operator02;

public class HaldangOP {
//	static int num1;
	public static void main(String[] args) {
		int num1;
//		System.out.println(num1);
		// 지역변수는 반드시 초기화 후 사용
		num1 = 100;
		System.out.println(num1);
		int num2;
		num2 = num1;
//		10 = num1; 왼쪽에는 변수가 와야한다
		//축약연산자는 산술연산자에서만 사용
		num1 += 100;
		System.out.printf("num1:%d,num2:%d%n",num1,num2);
		num1 %= num2;
		System.out.printf("num1:%d,num2:%d%n",num1,num2);
		
		num2 *= 2+10;//num2 = num2 * (2+10)
		System.out.printf("num1:%d,num2:%d%n",num1,num2);
		
		int num3 = 10;
//		num3++;//num3=num3+1
		System.out.printf("num3:%d%n",num3);
		++num3;
		System.out.printf("num3:%d%n",num3);
		int num4 = 10;
		int result = num4 + num3++;
		System.out.printf("result:%d,num3:%d%n",result,num3);
		result = num4 + ++num3;
		System.out.printf("result:%d,num3:%d%n",result,num3);
		
		int num5 = 10;
		System.out.println(num5++);//단독으로 사용된게 아니다.
		System.out.println(num5);
		
	}
}
