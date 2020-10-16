package accessmodifier07;

public class Normal extends Super{
	
	void access() {
		//this.privateMethod();
		this.packageMethod();
		this.protectedMethod();
		this.publicMethod();
	}
}
