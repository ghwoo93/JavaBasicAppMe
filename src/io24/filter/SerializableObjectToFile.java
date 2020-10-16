package io24.filter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableObjectToFile {
	public static void main(String[] args) throws IOException {
		PersonSerializable ps1 = new PersonSerializable("기길동", 10, "백호동");
		PersonSerializable ps2 = new PersonSerializable("니길동", 100, "천호동");
		PersonSerializable ps3 = new PersonSerializable("디길동", 1000, "만호동");
		
		ObjectOutputStream oos = 
				new ObjectOutputStream(
						new FileOutputStream("src/io24/filter/Object.txt"));
		oos.writeObject(ps1);
		oos.writeObject(ps2);
		oos.writeObject(ps3);
		
		oos.close();
	}
}
