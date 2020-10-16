package accessmodifier07.another;

import accessmodifier07.AccessmodifierOne;
//임포트는 패키지에 있는 클래스나 인터페이스를 하는 것

public class AccessmodifierTwo {
	//임포트 할필요가없다
	AccessmodifierOne one;
	
	public void access() {
		one = new AccessmodifierOne();
		//one.privateVar=10; is not visible
		//one.packageVar=10; is not visible
		one.publicVar=10;
		
		//one.privateMethod();is not visible
		//one.packageMethod();is not visible
		one.publicMethod();
		
		//PackageClass pack = new PackageClass();is not visible 
		
	}
}
