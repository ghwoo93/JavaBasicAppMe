package accessmodifier07;

//private class PrivateClass{}
class PackageClass{}//생략형 패키지 디폴트 접근지정자
public class AccessmodifierOne {
	public int publicVar;
	int packageVar;
	private int privateVar;
	
	public void publicMethod() {
		privateMethod();
	}
	
	void packageMethod() {
		
	}
	
	private void privateMethod() {
		//private가 붙은 멤버는 자기 클래스안에서는 접근가능
		System.out.println("privateVar:"+privateVar);
	}
	
}
