package polymorphism14;

import java.util.Date;

public class Child extends Parent{
	String newExtendVar;//자식에서 새롭게 확장한 멤버
	//인자 생성자
	public Child(String name,int age,String newExtendVar) {
		super(name,age);
		this.newExtendVar=newExtendVar;
	}
	//멤버메소드
	void newExtendMethod() {//새롭게 확장한 멤버
		System.out.println("자식에서 새롭게 확장한 메소드");
	}
	//오버라이딩이 아님
	//자식에서 부모의 메소드가 보이지않아서 메소드 오버라이드 불가
	private void eat() {//자식에서 새롭게 확장한 멤버
		System.out.println("자식이 먹는다");
	}
	//오버라이딩 ㅇㅇ
	@Override
	public String sleep(int age) {
		System.out.println("자식이 잔다");
		return null;
	}
	int walk(int date) {
		System.out.println("나이가"+age+"살인 자식이 걷다");
		return 0;
	}
	@Override
	public void exercise() {
		System.out.println("자식이 운동한다");
	}
	@Override
	String getParent() {
		return super.getParent()+", 자식의 멤버변수:"+newExtendVar;
	}
	@Override
	void printParent() {
		System.out.println(getParent());
	}
	//오버라이딩 아님
	//정적 메소드는 오버라이딩 불가
	static void staticMethod() {
		System.out.println("자식의 정적 메소드");
	}
}
