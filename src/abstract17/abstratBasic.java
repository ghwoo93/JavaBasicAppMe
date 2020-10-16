package abstract17;
abstract class NoHavingAbstractMethod {
	public static final int MAX_INT = Integer.MAX_VALUE;
	int instanceVar;
	static int staticVar;
	void instanceMethod() {
		
	}
}
class NoHavingChild extends NoHavingAbstractMethod{
	//멤버변수
	int newVar;
	
	//강제사항 아님 - 임의로 오버라이딩 한 것임
	@Override
	void instanceMethod() {}
	
}

abstract class HavingAbstractMethod{
	public HavingAbstractMethod() {
		
	}
	//구현부가 없거나 abstract지정자를 안붙여서
	//void abstractMethod();
	abstract void abstractMethod(); 
}

class HavingChild extends HavingAbstractMethod{
	@Override
	void abstractMethod() {}
	void newMethod() {}
}

abstract class HavingChildNoOverriding extends HavingAbstractMethod{
	abstract void absractNewMethod();
}

class HavingNewChild extends HavingChildNoOverriding{

	@Override
	void absractNewMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
		
	}
	
}

public class abstratBasic {
	public static void main(String[] args) {
//		NoHavingAbstractMethods nam = new NoHavingAbstractMethods();
		NoHavingAbstractMethod nam = new NoHavingChild();
		
		HavingAbstractMethod ham = new HavingChild();
		ham.abstractMethod();
		((HavingChild)ham).newMethod();
		
		System.out.println(NoHavingAbstractMethod.MAX_INT);
		System.out.println(NoHavingChild.MAX_INT);
		
		
	}
}
