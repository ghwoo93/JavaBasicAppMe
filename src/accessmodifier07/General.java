package accessmodifier07;

public class General {
//	private 멤버만 접근불가
//	같은 패키지에 있음으로 생략형 및 프로텍티드
//	및 퍼블릭 모두 접근가능
//	또한 같은 패키지에 있기때문에 import가능
	void access() {
		Super sup = new Super();
		sup.packageMethod();
		sup.protectedMethod();
		sup.publicMethod();
	}
}
