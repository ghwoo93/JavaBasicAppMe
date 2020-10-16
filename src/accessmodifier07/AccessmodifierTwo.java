package accessmodifier07;

public class AccessmodifierTwo {
	//임포트 할필요가없다
	AccessmodifierOne one;
	
	public void access() {
		one = new AccessmodifierOne();
		//one.privateVar=10; is not visible
		one.packageVar=10;
		one.publicVar=10;
		
		//one.privateMethod();is not visible
		one.packageMethod();
		one.publicMethod();
		
		PackageClass pack = new PackageClass(); 
		
	}
}
