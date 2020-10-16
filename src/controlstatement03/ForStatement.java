package controlstatement03;

public interface ForStatement {
	public static void main(String[] args) {
		//반복문을 이용해서 1부터 10까지 누적합
		int sum=0;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//1부터10까지 숫자중2배수의 합
		sum=0;
		//sol1]2씩증가시킨다.
		for (int i = 0; i <= 10; i+=2) {
			sum+=i;
		}
		System.out.println(sum);
		//sol2]
		sum=0;
		for (int i = 0; i <=10; i++) {
			if(i%2==0) sum+=i; 
		}
		System.out.println(sum);
		
//		System.out.println("for문이 끝난 후 z의 값:"+i);
		int z=5;
		for (; z < 10; z++) {}
		System.out.println("for문이 끝난 후 z의 값:"+z);
		
		for(int b=10;b>0;b--) {
			System.out.println("HellKorea"+b);
		}
		
		/*
		 * 1부터 100까지 숫자중
		 * 3의 배수이거나 5의 배수인 숫자의 합을 구하여라
		 * 3과5의 공배수인 경우 누적합에 단 한번만 포함시켜라
		 */
		sum=0;
		for (int j = 1; j <= 100; j++) {
			if(j%3==0||j%5==0) sum+=j;
		}
		System.out.println(sum);
		
		sum=0;
		for (int j = 1; j <= 100; j++) {
			if(j%3==0||j%5==0) sum+=j;
			if(j%3==0&&j%5==0) sum-=j;
		}
		System.out.println(sum);
		
		sum=0;
		for (int j = 1; j <= 100; j++) {
			if((j%3==0||j%5==0)&&j%15!=0) sum+=j;
		}
		System.out.println(sum);
		
		sum=0;
		for (int j = 1; j <= 100; j++) {
			if(j%3==0 ^ j%5==00) sum+=j;
		}
		System.out.println(sum);
		
		sum=0;
		for (int j = 1; j <= 100; j++) {
			if((j%3==0||j%5==0)&&(j%3==0^j%5==0)) sum+=j;
		}
		System.out.println(sum);
		
		int repeatCount=1;
		for (int i = 0; i < 3; i++) {
			System.out.printf("[i가 %d일때]%n",i);
			for (int j=1;j<=3;j++) {
				System.out.printf("[j가 %d일때,반복횟수%d]%n",j,repeatCount++);
			}
		}
		
		
		/*
		 * 1 0 0 0
		 * 0 1 0 0
		 * 0 0 1 0
		 * 0 0 0 1
		 * 0 0 0 0
		 */
		System.out.println("문제1");
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				if(i==j) System.out.printf("%-2d",1);
				else System.out.printf("%-2d",0);
			}
			System.out.println();
		}
		
		/*
		 *  0 0 0 1
		 *  0 0 1 0
		 *  0 1 0 0
		 *  1 0 0 0
		 */
		System.out.println("문제2]풀이1");
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if(i+j==5) System.out.printf("%-2d",1);
				else System.out.printf("%-2d",0);
			}
			System.out.println();
		} 
		
		System.out.println("문제2]풀이2-1");
		for(int i=1;i<5;i++) {
			for(int j=4;j>0;j--) {
				if(i==j) System.out.printf("%-2d",1);
				else System.out.printf("%-2d",0);
			}
			System.out.println();
		}
		
		/*
		 *  * 1,1
		 *  * * 2,1 2,2
		 *  * * * 3.1 
		 *  * * * *
		 *  * * * * *  
		 */
		
		System.out.println("문제3]-25번 반복");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i>=j) System.out.printf("%-2s","*");
			}
			System.out.println();
		}
		
		System.out.println("문제3]-15번 반복");
		for(int i=0;i<5;i++) {
			for(int j=0;i>=j;j++) {
				System.out.printf("%-2s","*");
			}
			System.out.println();
		}
		
		/*
		 *  구구단
		 *  2*1=2 3*1=4
		 *  2*2=4
		 */
		for(int i=1;i<=9;i++) {
			for(int j=2;j<10;j++) {
				System.out.printf("%-2d* %-2d=  %-4d",j,i,i*j);
			}
			System.out.println();
		}
		
		//무한반복
		for(;;) {
			System.out.println("무한반복");
			break;
		}
		System.out.println("프로그램 끝");
		
	}
}
