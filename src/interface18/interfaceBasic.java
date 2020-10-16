package interface18;

//interface MyInter{}//default접근지정자 사용
//static interface MyInter{}//클래스와 동일 
//final interface MyInter{}//클래스와 다름
//abstract interface MyInter{}//붙여도되나 의미없다
interface MyInter1{
	//public MyInter1() {}//생성자를 가질 수 없다
	public static final int MAX_INT = Integer.MAX_VALUE;
	double MAX_DOUBLE = Double.MAX_VALUE;
	
	public abstract void noOmit();
	void omit();
}

interface MyInter2{
	void omit();
}

abstract class AbstractClass implements MyInter1 {
	//추상클래스 안에서 추상메소드
	//정의시에는 반드시 abstract키워드를 붙ㅇ니다
	//단,인터페이스에서는 생략 가능
	//void abstractMethod();//x
	abstract void abstractMethod();
}

class MyClass implements MyInter2,MyInter1{

	@Override
	public void noOmit() {
		// TODO Auto-generated method stub
		
	}
	//중복일 때 먼저 기술된 
	@Override
	//protected void omit() {}//접근지정자가 부모와 같거나 넓어야한다.
	public void omit() {}
	
}

interface MyInter3 extends MyInter1,MyInter2{
	void abstractNewMethod();//새롭게 확장한 추상 메소드
}

class LasyClass extends AbstractClass implements MyInter2{

	@Override
	public void noOmit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void omit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
		
	}

	
	
}

public class interfaceBasic {
	public static void main(String[] args) {
		MyInter1 mi1 = new MyClass();
		mi1.noOmit();
		mi1.omit();
		
		MyInter2 mi2 = new MyClass();
		((MyClass)mi2).noOmit();
		
		MyClass mc = (MyClass)mi2;
		System.out.println(mc instanceof MyClass);
		System.out.println(mc instanceof MyInter1);
		System.out.println(mc instanceof MyInter2);
		
		//
		System.out.println(MyInter1.MAX_INT);
		System.out.println(MyInter3.MAX_INT);
		
		System.out.println(AbstractClass.MAX_INT);
		System.out.println(MyClass.MAX_INT);
	}
}
