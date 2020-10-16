package method05;

public class MethodShape03 {
	//메소드 정의 s부터 e까지 누적합을 구하는 메소드
	public static void printTotal(int start,int end) {
		int sum=0;
		for(int i=start;i<=end;i++) sum+=i;
		System.out.printf("%d부터%d까지 누적합:%d%n",start,end,sum);
	}
	
	/*
	 * 국영수 매개변수
	 * 평균을 구하고 학점을 출력하는 메소드정의
	 * 메인메소드에서 호출 결과출력
	 */
	
	public static void calSumAvg(int[][] scoreBoard) {
		int sum=0;
		for(int i=0;i<scoreBoard.length;i++) {
			for(int j=0;j<scoreBoard[i].length;j++) {
				sum += scoreBoard[i][j];
			}
			switch(sum/30) {
			case 10:
			case 9: System.out.println("A학점"); break;
			case 8: System.out.println("B학점"); break;
			case 7: System.out.println("C학점"); break;
			case 6: System.out.println("D학점"); break;
			default: System.out.println("F학점"); break;
			}
			sum=0;
		}
//		System.out.printf("총점:%-2d%n평균:%-2.2f%n",sum);
		
		
	}
	
	/*
	 * 
	 */
	public static void printInfo(String name,int age) {
		System.out.println("이름은 "+name+"이고, 나이는 "+age+"세입니다.");
	}
	
	/*
	 * 
	 */
	public static void calGugu(int startL,int endL) {
		for(int i=1;i<endL;i++) {
			for(int j=startL;j<endL;j++) {
				System.out.printf("%-2d* %-2d= %-3d  ",j,i,i*j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//메소드호출
		//매개변수에 값 전달:변수에 저장해서 전달
		int start = 1,end=10;
		printTotal(start, end);
		
		printTotal(14, 56);
		printTotal(90, 675);
		
//		calSumAvg(80, 88, 75);
		
		printInfo("홍", 17);
		calGugu(7, 15);
		
		int[][] score= {{77,90,87},{89,91,99},{80,75,66},{66,75,15},{74,55,87}};
		calSumAvg(score);
		
	}
}
