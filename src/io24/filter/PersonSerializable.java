package io24.filter;

import java.io.Serializable;

public class PersonSerializable implements Serializable{
	String name;
	int age;
	String addr;
	
	public PersonSerializable() {}
	
	public PersonSerializable(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return String.format("[이름:%s,나이:%s,주소:%s]", name,age,addr);
	}
	
	
}
