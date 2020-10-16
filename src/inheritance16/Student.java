package inheritance16;

import datatype01.StirngType;

public class Student extends Person{
	//멤버변수
	//이름나이주소는 상속받아서 재사용
	//student클래스에서 새롭게(확장)한 멤버변수
	String stNumber;//학번
	public Student() {
		//super();
		System.out.println("Student의 기본 생성자");
	}
	//인자생성자
	public Student(String name,int age,String addr,String stNumber) {
		this.stNumber = stNumber;
		this.addr = addr;
		this.age = age;
		this.name = name;
		System.out.println("Student의 인자생성자");
	}
	//멤버메소드
	//person에서 정의한 메소드는 재사용
	//student클래스에서 새롭게 추가한 (확장)한 메소드
	void study() {
		System.out.println(String.format("나이가 %d인 %s가 공부한다",   age,name));
	}
	String getStudent() {
		return String.format(
				"%s,학번:%s", getPerson(),stNumber);
	}
	void printStudent() {
		System.out.println(getStudent());
	}
}
