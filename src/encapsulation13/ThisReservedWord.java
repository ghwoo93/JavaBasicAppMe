package encapsulation13;

public class ThisReservedWord {
	//this. x항상 인스턴스형 메소드 안에서만 사용가능
	//인스턴스형 멤버
	int instanceVar,anotherInstanceVar;
	void instanceMethod() {
		System.out.println(this.staticVar);
		//[경고]정적인 방법으로 접근해야됨
	}
	//정적멤버
	static int staticVar;
	static void staticMethod() {
		
	}
	void initialize(
			int instanceVar,int another, int staticVar){
		this.instanceVar=instanceVar;
		anotherInstanceVar=another;
		//this.staticVar=staticVar;
		ThisReservedWord.staticVar = staticVar;
	}
	public static void main(String[] args) {
		ThisReservedWord reserved = new ThisReservedWord();
		reserved.initialize(10, 100, 1000);
		System.out.println("[멤버 변수 초기화 후]");
		System.out.println("reserved.instanceVar:"+ reserved.instanceVar);
		System.out.println("reserved.anotherInstanceVar:"+ reserved.anotherInstanceVar);
		System.out.println("ThisReservedWord.staticVar:"+ staticVar);
	}
}
