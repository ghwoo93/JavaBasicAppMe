package accessmodifier07.sub;

import accessmodifier07.Super;

public class General {
//	private 멤버만 접근불가
//	같은 패키지에 있음으로 생략형 및 프로텍티드
//	및 퍼블릭 모두 접근가능
//	또한 같은 패키지에 있기때문에 import가능
	void access() {
		Super sup = new Super();
		//sup.packageMethod(); 패키지가 달라연
		//sup.protectedMethod(); 상속도아니고 패키지도 다름
		sup.publicMethod();
	}
}
