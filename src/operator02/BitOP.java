package operator02;

public class BitOP {
	public static void main(String[] args) {
		byte b1 = 10, bit1=2;
		int num1 = b1 << bit1;
		System.out.printf("%d<<%d의 결과:%d%n",b1,bit1,num1);
		num1 = b1 >> bit1;
		System.out.printf("%d>>%d의 결과:%d%n",b1,bit1,num1);
		
		b1= -9;
		num1 = b1 >>bit1;
		System.out.printf("%d>>%d의 결과:%d%n",b1,bit1,num1);
		b1=3;
		byte b2 = -15; 
		
		System.out.println("논리 연산자:"+(true&10>100));
		System.out.println("비트 연산자:"+(3&-15));
		System.out.printf("%d&%d의 결과:%d%n",b1,b2,b1&b2);
		System.out.printf("%d|d의 결과:%d%n",b1,b2,b1|b2);
		System.out.printf("%d^d의 결과:%d%n",b1,b2,b1^b2);
		System.out.printf("~%d의 결과:%d%n",b2,~b2);
		
		
	}
}
