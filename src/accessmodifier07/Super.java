package accessmodifier07;

public class Super {
	//멤버 메소드
	private void privateMethod() {}
	void packageMethod() {}
	protected void protectedMethod() {}
	public void publicMethod() {}
	
	void callAll() {
		privateMethod();
		packageMethod();
		protectedMethod();
		publicMethod();
	}
}
