package operator02;

public class NolliOP {
	public static void main(String[] args) {
		int num1=15,num2=10;
		boolean b = num1 >= num2 && num1 == num2;
		System.out.printf("%d >= %d && %d == %d의 결과:%b%n",num1,num2,num1,num2,b);
		b = true||false;
		System.out.printf("%b || %b의 결과:%b%n",true,false,b);
		
//		b = num1 + num2 && num1 != num2;
		b = num1 <= num2 ^ num1 != num2;
		System.out.printf("%d <= %d ^ %d != %d의 결과:%b%n",num1,num2,num1,num2,b);
		
		b = !(num1 != num2) || num1 >= num2 && num1 == num2;
		System.out.println("b="+b);
		
		b= 10%3 > 6-2*2 && 10 <= 6*2 || 5*3 !=10;
		System.out.println("b="+b);
		
		b= !true || true ^ false && true;
		System.out.println("b="+b);
		
//		Ref ref = new Ref();
//		System.out.println(ref.data);
		Ref ref = null;
//		System.out.println(ref.data ==100);
		System.out.println("[&&연산자 사용]");
		System.out.println(ref != null && ref.data ==100);
		
		//NullPointerException
		System.out.println("[&연산자 사용]");
		System.out.println(ref != null & ref.data ==100);
	}
}

class Ref{
	
	int data = 100;
	
}
