package io24.filter;
/*
 * 데이터 소스 PersonExternalizable 메모리
 * 데이터 목적지 파일
 * 
 * */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExternalizableObjectToFile {
	public static void main(String[] args) throws IOException {
		PersonExternalizable pe1 = new PersonExternalizable();
		pe1.name="가길동";
		pe1.age=20;
		pe1.addr="가산동";
		PersonExternalizable pe2 = new PersonExternalizable("나길동", 30, "나산동");
		PersonExternalizable pe3 = new PersonExternalizable("다길동", 40, "다산동");
		
		ObjectOutputStream oos = 
				new ObjectOutputStream(
						new FileOutputStream("src/io24/filter/Object.dat"));
		oos.writeObject(pe1);
		oos.writeObject(pe2);
		oos.writeObject(pe3);
		
		oos.close();
	}
}
