package io24.filter;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

//자바 클래스의 객체는 직렬화가 되야 파일로 저장허가나
//네트웍을 통해 전송할 수 있다.
public class PersonExternalizable implements Externalizable{
	String name;
	int age;
	String addr;
	
	public PersonExternalizable() {}
	
	public PersonExternalizable(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "PersonExternalizable [name:"+name+",age:"+age+",addr:"+addr+"]";
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(age);
		out.writeObject(addr);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name=(String)in.readObject();
		age=(int)in.readObject();
		addr=(String)in.readObject();
	}

}
