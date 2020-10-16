package innerclass22;

import innerclass22.OuterClass.InnerClass;

class OuterClass{
	//멤버 변수
	//인스턴스형 멤버 변수
	int outerInstanceVar;
	int sameVar=100;
	
	static int outerStaticVar;
	
	//내부클래스 인스턴스화 하기
	InnerClass inner;
	
	public OuterClass() {
		inner = new InnerClass();
	}
	
	void outerInstanceMethod() {
//		System.out.println(innerInstanceVar);
//		innerInstanceMethod();
		System.out.println(InnerClass.INNER_MAX_INT);
		System.out.println(inner.innerInstanceVar);
		//inner.innerInstanceMethod();재귀 recursive
	}
	static void outerStaticMethod() {
		
	}
	class InnerClass{
		int innerInstanceVar;
		int sameVar=1;
		
		public InnerClass() {
			System.out.println("내부 클래스의 생성자");
		}
		void innerInstanceMethod() {
			System.out.println(outerInstanceVar);
			System.out.println(outerStaticVar);
			outerInstanceMethod();
			outerStaticMethod();
			this.sameVar = sameVar;
			
			OuterClass.this.sameVar = sameVar;
		}
		/*
		 * 정적 멤버(상수 제외)는 가질 수 없다.
		 * 단,static이 붙은 상수는 가질 수 있다.
		 */
//		static int innerStaticVar;
//		static void innerStaticMethod() {}
		static final int INNER_MAX_INT = Integer.MAX_VALUE;
		
	}
}

public class innerMemberClass {
	public static void main(String[] args) {
//		OuterClass oc = new OuterClass();
//		oc.outerInstanceMethod();
		System.out.println(InnerClass.INNER_MAX_INT);
		//InnerClass inner = new InnerClass();
		OuterClass outer = new OuterClass();
		outer.inner.innerInstanceMethod();
		
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.innerInstanceMethod();
	}
}
