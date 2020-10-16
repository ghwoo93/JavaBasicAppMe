package operator02;

public class SansulOP {
	public static void main(String[] args) {
		
		int result  = 3*2 + 5%2 -6/3*5;
//		System.out.printf("3*2 + 5%2 -6/3*5=%d%n",result);
		System.out.printf("3*2 + 5%%2 -6/3*5=%d%n",result);
		
		int num1=10,num2=20;
		System.out.println(num1 > num2);//비교식:num1 > num2
		boolean b =num1==num2;
		System.out.printf("%d==%d의 결과:%b%n",num1,num2,b);
		b = num1!=num2;
		System.out.printf("%d!=%d의 결과:%b%n",num1,num2,b);
		b = 15%3*2+4>(10-2)*4 != true;
		System.out.printf("15%%3*2+4>(10-2)*4 != true의 결과:%b%n",b);
		
		
		
	}
}
