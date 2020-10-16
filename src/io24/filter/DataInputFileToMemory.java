package io24.filter;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * 데이터 소스:파일
 * 		노드 스트림:FileInputStream
 * 데이터 목적지: 자바의 각 변수 - 메모리
 * 				모니터 - 노드스트림:System.out
 * 단 읽어올때는 저장된 자료형 순서대로 읽어 와야 한다
 */
public class DataInputFileToMemory {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = 
				new FileInputStream("src/io24/filter/javaType.dat");
		int data;
		/*
		while((data=fis.read())!=-1) {
			System.out.write(data));
			System.out.flush();
		}
		*/
		DataInputStream dis = new DataInputStream(fis);
		byte b = dis.readByte();
		System.out.println(b);
		byte[] barr = new byte[4];
		System.out.println("읽은 바이트 수:"+dis.read(barr));
		char ch = dis.readChar();
		System.out.println(ch);
		int n = dis.readInt();
		System.out.println(n);
		boolean bool = dis.readBoolean();
		System.out.println(bool);
		String str = dis.readUTF();
		System.out.println(str);
		//dis.readChar();//java.io.EOFException
		fis.close();
		dis.close();
	}
}
