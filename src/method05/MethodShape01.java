package method05;

public class MethodShape01 {
	//메소드형식01
	static void noParamNoReturn() {
		System.out.println("*************메인메뉴*************");
		System.out.println("1.New 2.Continue 3.Exit");
		System.out.println("*******************************");
	}
	
	//동일한 클래스안에서 메소드명은 중복 불가. 단,오버로딩 예외
	static void noParamNoReturn(int a) {
		
	}
	
	static void noParamNoReturn2() {
		
	}
	
	static void noParamNoReturn3() {
		int returnValue=100;
		//return returnValue; 변수에 저장된 값을 반환한다는 의미
		//하지만 메서드의 반환값이 보이드이므로 값을 반환할 수 없다.
		//System.out.println("return문 이전");
		//return;//값을 반환한다는 의미가 아니라 메소드를 바로 빠져나가겠다는 의미
		//System.out.println("return문 이후");//x
		//반환 타입이 void인 메소드에서
		//return;문은 주로 어떤 특정 조건하에서
		//메소드를 빠저 나갈 때 사용함
		if(returnValue%2==0) {
			System.out.println(returnValue+"는 짝수");
			return;
		}
		System.out.println(returnValue+"는 홀수");
	}
	
	
	
	public static void main(String[] args) {
		noParamNoReturn();//메서드 호출:메소드원형 그대로 호출
		noParamNoReturn2();//일안함
		noParamNoReturn3();
		//void noParamNoReturn4() {} 메서드안에서는 메서드를 정의할 수 없다
		//값을 반환하는 메서드가 아니므로 변수에 담거나 메서드의 인자로 호출(중요)할 수 없다.
		//int value = noParamNoReturn3();
		//System.out.println(noParamNoReturn3());
	}
}
