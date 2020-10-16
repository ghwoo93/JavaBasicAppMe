package modifier09;
/*
 * 멤버변수는 크게 정적멤버 변수와 인스턴스형
 * 멤버변수로 나눈다.
 * 멤버메소드도 정적메소드와 인스턴스형 메소드로 나눈다
 * 
 * 
 */
//static class StaticClass{} 클래스 앞에는 static못 붙임
//단 내부 클래스는 붙일 수 있다
class MyStatic{
	//[멤버 변수]
	/*
	 * 인스턴스형 멤버변수-반드시 클래스를
	 * 인스턴스화(객체화,heap영역에 메모리 생성)
	 * 하여 인스턴스 변수로 접근
	 */
	//인스턴스형 멤버변수
	int instanceVar;
	/*
	 * 정적 멤버 변수
	 */
	//정적 멤버 변수
	static int staticVar;
	//[멤버메소드]
	//인스턴스형 메소드]
	void instanceMethod() {
		//인스턴스형 메소드 안에서는
		//모든 멤버 인스턴스형 or 정적멤버fmf
		//사용할 수 있다
		System.out.println(instanceVar);
		System.out.println(staticVar);
	}//instanceMethod
	//정적 메소드]
	static void staticMethod() {
		//메모리의 생성 시점이 다르기 때문에
		//정적 메소드 안에서는 
		//인스턴스 멤버를 사용 할 수 없다.
		//System.out.println(instanceVar);
		System.out.println(staticVar);
	}//staticMethod
}
public class StaticModifier {
	//인스턴스형 멤버]
	int instanceVar;
	void instanceMethod() {
		
	}
	//정적 멤버]
	static int staticVar;
	static void staticMethod() {
		
	}
	public static void main(String[] args) {
		//MyStatic클래스의 정적 멤버 접근]- 클래스명.정적멤버
		System.out.println(MyStatic.staticVar);
		MyStatic.staticMethod();
		//MyStatic클래스의 인스턴스형 멤버 접근]
		//- 인스턴스변수.인스턴스멤버
		MyStatic ms = new MyStatic();
		System.out.println(ms.instanceVar);
		ms.instanceMethod();
		//아래처럼 정적 맴버도 인스턴스 변수로
		//접근이 가능하나, 인스턴스 멤버로 착각 할 수
		//있기 때문에 아래처럼 접근하지는 않는다.
		System.out.println(ms.staticVar);
		ms.staticMethod();
		
		//StaticModifier의 멤버접근]
		//정적 멤버: 클래스명.멤버로 접근하나 자기 클래스안에서
		//접근하기 때문에 보통 생략함
		System.out.println(staticVar);
		staticMethod();
		//인스턴스형 멤버:인스턴스화 후 접근
		StaticModifier sm = new StaticModifier();
		System.out.println(sm.instanceVar);
		sm.instanceMethod();
		
		//멤버변수 x,y가 인스턴스형인 경우
		System.out.println("[멤버변수 x,y가 인스턴스형인 경우]");
		Calculator1 cal1 = new Calculator1();
		cal1.x=10;
		cal1.y=10;
		cal1.add();
		
		Calculator1 cal2 = new Calculator1();
		cal2.x=100;
		cal2.y=100;
		cal2.add();
		System.out.println("[cal1계산기 add() 다시 호출");
		cal1.add();
		//멤버변수 x,y가 정적인 경우
		System.out.println("[멤버변수 x,y가 정적인 경우]");
		Calculator2 c1 = new Calculator2();
		Calculator2.x=10;
		Calculator2.y=10;
		c1.add();
		
		Calculator2 c2 = new Calculator2();
		Calculator2.x=100;
		Calculator2.y=100;
		c2.add();
		System.out.println("[cal1계산기 add() 다시 호출");
		c1.add();
	}
}
/*
 * 정적 멤버는 인스턴스화된 객체마다
 * 갖고 있는 멤버가 아니라
 * 하나만 생성되서 모든 객체가
 * 공유한다
 * 그래서 공통으로 사용하는 변수나 메소드에
 * 주로 static을 붙인다
*/
//멤버변수가 인스턴스형인 경우
class Calculator1{
	//멤버변수]
	int x,y;
	//멤버 메소드]
	void add() {
		System.out.println("덧셈 결과:"+(x+y));
	}
}
//멤버변수가 정적인 경우
class Calculator2{
	//멤버변수]
	static int x,y;
	//멤버 메소드]
	static void add() {
		System.out.println("덧셈 결과:"+(x+y));
	}
}