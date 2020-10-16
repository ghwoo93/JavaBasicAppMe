package accessmodifier07.sub;

import accessmodifier07.Super;

public class Normal extends Super{
	
	void access() {
		//this.privateMethod();
		//this.packageMethod(); 패키지가 다름
		this.protectedMethod();
		this.publicMethod();
	}
}
