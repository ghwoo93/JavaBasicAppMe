package innerclass22;

class OuterStatic{
	
	static InnerClass inner = new InnerClass();
	
	int outerInstanceVar;
	void outerInstanceMethod() {
		System.out.println(InnerClass.innerStaticVar);
		System.out.println(inner.innerInstanceVar);
		
	}
	static int outerStaticVar;
	static int sameVar;
	static void outerStaticMethod() {
		System.out.println(InnerClass.innerStaticVar);
		System.out.println(inner.innerInstanceVar);
	}
	
	static class InnerClass{
		int innerInstanceVar;
		int sameVar;
		void innerInstanceMethod() {
			//outerInstanceMethod();
			System.out.println(outerStaticVar);
			OuterStatic.sameVar=sameVar;
			outerStaticMethod();
		}
		static int innerStaticVar;
		static void innerStaticMethod() {
			System.out.println(outerStaticVar);
			System.out.println(OuterStatic.sameVar);
			outerStaticMethod();
		}
	}///InnerClass
}

public class InnerStaticClass {
	public static void main(String[] args) {
		OuterStatic.inner.innerInstanceMethod();
		
		OuterStatic.InnerClass.innerStaticMethod();
		
		OuterStatic.InnerClass inner = new OuterStatic.InnerClass();
		//인스턴스 맴버 접근하려구
		inner.innerInstanceMethod();
	}
}
