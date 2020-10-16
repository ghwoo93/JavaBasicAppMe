package modifier09;
//스태틱 블럭이 메인블럭보다 빠르다
//스태틱 블럭은 클래스로딩때 찾고 메인은 인터프리터가 찾기때문

public class StaticBlock {
	public StaticBlock() {
		System.out.println("StaticBlock 클래스의 생성자");
	}
	
	int instanceVar;
	void instanceMethod() {
		
	}
	
	static int staticVar;
	static void staticMethod() {
		int localVar=10;
		System.out.println("정적메소드:"+localVar);
	}
	static {
		System.out.println("[static블락 시작]");
		//인스턴스형 멤버 사용 불가능
		//System.out.println(instanceVar);
		//instanceMethod();
		//정적 멤버 사용 가능
		System.out.println(staticVar);
		staticMethod();
		int localVar=10;
		System.out.println("static블락안에서 선언된 지역변수:"+localVar);
		System.out.println("[static블락 끝]");
	}
//	public static void main(String[] args) {
//		System.out.println("[메인 메소드 시작]");
//	}
}
