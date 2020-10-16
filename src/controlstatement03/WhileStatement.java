package controlstatement03;

import java.io.IOException;

public class WhileStatement {
	public static void main(String[] args) throws IOException {
		int sum=0;
		int i=1;//[초기식]
		while(i<=10) {
			sum+=i++;//[명령문]
		}
		System.out.println(sum);
		
		System.out.println(i);
		
		/*
		 * 1000까지
		 * 3 5 배수 합
		 * 공배수 제외
		 */
		
		sum=0;
		i=1;
		while(i<=1000) {
//			if((i%3==0||i%5==0)&&(i%3==0^i%5==0)) sum+=i;
			if(i%3==0^i%5==0) sum+=i;
			i++;
		}
		System.out.println(sum);
		//사용자가 몇 자를 입력할지 모름으로 while문 사용
		System.out.println("문자열을 입력하시오");
		char word;
		while((word=(char)System.in.read())!=13) {
			System.out.print(word);
		}
		System.out.println();
		
//		for(;(word=(char)System.in.read())!=13;) {
//			System.out.print(word);
//		}
		
		/*
		 * 1 0 0 0
		 * 0 1 0 0
		 * 0 0 1 0
		 * 0 0 0 1
		 */
		int k=1;
		
		while(k<=4) {
			int j=1;
			while(j<=4) {
				if(k==j) System.out.printf("%-2d",1);
				else System.out.printf("%-2d",0);
				j++;
			}
			//j=1;//안쪽 와일의 초기식을 바깥쪽 와일 밖에 위치시킬 때에는 안쪽와일의 초기값을 초기화해줘야함
			k++;
			System.out.println();
		}
		
		/*
		
	 	*
	 	* *
	 	* * *
	 	* * * *
 			
		 */
		
		int r =1;
		while(r<=4) {
			int c=1;
			while(c<=4) {
				if(c<=r) System.out.printf("%-2s","*");
				c++;
			}
			System.out.println();
			r++;
		}
		
		/*
		 * 구구단
		 */
		int num1 =1;
		while(num1<=9) {
			int num2=2;
			while(num2<=9) {
				System.out.printf("%-2d* %-2d= %-3d",num2,num1,num2*num1);
				num2++;
			}
			System.out.println();
			num1++;
		}
		
		//무한루프
		while(true) {
			System.out.println("무릎");
			break;
		}
	}
}
