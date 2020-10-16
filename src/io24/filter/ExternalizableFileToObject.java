package io24.filter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExternalizableFileToObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois =
				new ObjectInputStream(
						new FileInputStream("src/io24/filter/Object.dat"));
		Object obj = ois.readObject();
		if(obj instanceof PersonExternalizable) {
			PersonExternalizable person1 = (PersonExternalizable)obj;
			System.out.println(person1);
		}
		PersonExternalizable person2 = (PersonExternalizable)ois.readObject();
		System.out.println(person2);
		PersonExternalizable person3 = (PersonExternalizable)ois.readObject();
		System.out.println(person3);
		ois.close();
	}
}
