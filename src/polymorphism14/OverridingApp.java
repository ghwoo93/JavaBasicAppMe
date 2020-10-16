package polymorphism14;

import java.util.Date;

public class OverridingApp {
	public static void main(String[] args) {
		/*
		 * 
		 */
		Child child = new Child("가길동", 20, "child Member var1");
		System.out.println("[자식타입의 ");
		child.sleep(10);
		child.exercise();
		child.printParent();
		System.out.println(child.getParent());
		System.out.println("자식타입의 인스턴스 변수 - 자식에서 새롭게 확장한 메소드 호출");
		child.newExtendMethod();
		child.walk(7);
		
		Parent parent = new  Child("나길동",30,"child Member var2");
		System.out.println("[부모타입의 인스턴스 변수 - 오버라이딩한 메소드 호출");
		parent.sleep(10);
		parent.exercise();
		parent.printParent();
		System.out.println("[부모타입의 인스턴스 변수- 자식에서 새롭게 확장한 메소드");
		//두클래스간의 상속관계가 있을 땐 형변환이 가능하다.
		//부모 타입일때 자식에서 새롭게 확장한 멤버는 접근이 불가능하다
		//parent.newExtendMethod();
		//parent.walk(10);
		((Child)parent).newExtendMethod();
		Child ch = (Child)parent;
		ch.walk(10);
	}
}
