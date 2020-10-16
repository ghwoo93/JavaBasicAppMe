package globalnlocal08;

public class GlobalNLocalVar {
	//멤버변수
	int a;
	//클래스 안에서는 정의하거나 선언하는 것만 가능하다
	//a=10;	//정의와 선언을 제외한 건 할 수 없다
	//멤버 변수 명명할때 앞에 m이나g를 붙이기도함
	private int mNoInit;
	int mInit=100;
	int[] mArray = new int[3];
	//멤버메소드
	int getTotal(int start,int end) {
		int sum;//지역변수는 자동으로 초기화 안됨
		//System.out.println(sum);[x
		sum=0;//지역변수 초기화
		System.out.println(sum);
		for(int i=start;i<=end;i++) 
			sum+=i;
		//System.out.println("for문이 끝난 후 i:"+i);
		//변수로 풀이할 수 없다 for 반복문 안에 지역변수이기 때문에
		//지역변수 sum,start,end는 getTot메소드 안에서는
		//어디서든 사용가능
		System.out.printf("%d부터 %d까지 누적합:%d%n",start,end,sum);
		if(sum%2==0) {
			//System.out.println(strResult);//초기화안해서
			String strResult;
			strResult="총합은 짝수";//초기화
			System.out.println(strResult);
		}else {
			//strResult="총합은 홀수";//if블락 안에서 선언되어서
		}
		System.out.println("멤버변수:mNoInit="+mNoInit);
		
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		GlobalNLocalVar gnv = new  GlobalNLocalVar();
		System.out.println("멤버변수:mNoInit="+gnv.mNoInit);
		System.out.println("멤버변수:mInit="+gnv.mInit);
		System.out.println("멤버변수:mArray="+gnv.mArray);
		//public int start; 클래스의 맴버에게만 접근지정자를 붙일 수 있다
		//int tot = gnv.getTotal(start,end);
		int start,end;
		start=1;
		end=100;
		int tot =gnv.getTotal(start, end);
		
		/*
		 * 배열은 지역에서 선언된 배열이든
		 * 클래스의 멤버로 선언된 배열이든
		 * 해당 자료형으로 기초 초기화된다
		 */
		System.out.println("[클래스의 멤버인 배열:초기화 안함]");
		for(int i=0;i<gnv.mArray.length;i++) {
			System.out.printf("%d번방:%d%n",i,gnv.mArray[i]);
		}
		
		System.out.println("[지역 배열:초기화 안함]");
		int[] lArray = new int[3];
		for(int i=0;i<lArray.length;i++) {
			System.out.printf("%d번방:%d%n",i,lArray[i]);
		}
				
	}
}
