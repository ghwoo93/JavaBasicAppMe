package polymorphism14;
class Base {
	void base() {
		System.out.println("Base의 메소드:base()");
	}
}
class NoDerived{}
class Derived extends Base{
	void derived() {
		System.out.println("Derive의 derived 메소드");
	}
	@Override
	void base() {
		System.out.println("Derived에서 오버라이딩:base()");
	}
}
public class RefTypecasting {
	public static void main(String[] args) {
		Base base = new Base();
		base.base();
		Derived derived = new Derived();
		derived.base();
		//상속관계가 존재하지 않을 때 - 주소 대입 연산 및 형변환 불가
		NoDerived noDerived = new NoDerived();
		//noDerived = base;
		//대입연산xx
		//noDerived = (NoDerived)base;
		//base=(Base)noDerived;
		//형변환xx
		//두 클래스간 상속관계가 존재시 - 주소 대입 연산 및 형변환 가능
		System.out.println("[base인스턴스 변수에 derived인스턴스 변수 대입전]");
		System.out.println("base가 참조하는 클래스명:"+base.getClass().getName());
		System.out.println(base instanceof Derived);
		//Derived de = (Derived)base; runtime error base에는 derived가 없음
		//상속관계라 주소대입연산o
		System.out.println("[base인스턴스 변수에 derived인스턴스 변수 대입후]");
		base = derived;//업캐스팅,암묵적 형변환
		System.out.println("base가 참조하는 클래스명:"+base.getClass().getName());
		System.out.println(base instanceof Derived);
		
		base.base();
		//base.derived(); undefined
		
		((Derived)base).derived();//다운캐스팅,강제적 형변환
		
		Derived dev = (Derived)base;//다운캐스팅,강제적 형변환
		dev.derived();
		
	}
}
