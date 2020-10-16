package io24.filter;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 데이터 소스 : 자바의 각 잘형에 저장된 값(메모리-변수)
 * 데이터 목적지 : 파일
 * 		노드 스트림:
 */
public class DataOutputMemoryToFile {
	public static void main(String[] args) throws IOException {
		//1]데이터 소스 준비-입력 스트림 불필요
		byte b = 100;
		byte[] bArray = {97,98,99,100};
		char ch = '가';
		int num = 256;
		boolean bool = false;
		String object = "안녕 자바! Hello Java! 1234567890";
		//2]
		DataOutputStream dos = 
				new DataOutputStream(
						new FileOutputStream("src/io24/filter/javaType.dat"));
		//3]
		dos.writeByte(b);
		dos.write(bArray);
		dos.writeChar(ch);
		dos.writeInt(num);
		dos.writeBoolean(bool);
		dos.writeUTF(object);
	
		//4]
		dos.close();
	}
}
