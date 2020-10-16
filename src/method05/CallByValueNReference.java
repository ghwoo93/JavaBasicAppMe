package method05;

public class CallByValueNReference {
	
	/*
	 * 매소드 호출과 관련된 개념으로
	 * 매개변수에 값을 전달,복사하거나CallByValue > 일일이 나열한다
	 * 메모리의 주소값을 전달,복사하는 경우CallByReference >반환 효과,여러개의 값을 전달하는 효과
	 */
	
	//호출 call,invoke(콜백메소드)
	
	static void callByValue(int first,int second) {
		int temp = first;
		first = second;
		second = temp;
		System.out.printf(
				"callByValue메소드 안]first:%d,second:%d%n",first,second);
	}
	
	static void callByReference(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.printf(
				"callByReference메소드 안]arr[0]:%d,arr[1]:%d%n",arr[0],arr[1]);
	}
	
	public static void main(String[] args) {
		int first=1;
		int second=10;
		System.out.printf(
				"main 메소드 안-callByValue호출전]first:%d,second:%d%n",first,second);
		callByValue(1, 10);
		System.out.printf(
				"main 메소드 안-callByValue호출후]first:%d,second:%d%n",first,second);
		
		int[] ref = new int[2];
		ref[0] =1;
		ref[1] =10;
		System.out.printf(
				"main 메소드 안-callByReference호출전]ref[0]:%d,ref[1]:%d%n",ref[0],ref[1]);
		callByReference(ref);
		System.out.printf(
				"main 메소드 안-callByReference호출후]ref[0]:%d,ref[1]:%d%n",ref[0],ref[1]);

	}

}
