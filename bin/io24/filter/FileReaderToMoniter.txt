package io24.node;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileReaderToMoniter {
	public static void main(String[] args) throws IOException {
		FileReader fr = 
				new FileReader(
						"src/io24/node/KeyboardWriter.txt");
		OutputStreamWriter osw = 
				new OutputStreamWriter(System.out);
		int data;
		/*
		while((data=fr.read())!=-1) {
			osw.write(data);
			osw.flush();
			System.out.print("/");
		}
		*/
		char[] cbuf = new char[40];
		int repeatCount=0,totalChar=0;
		while((data=fr.read(cbuf))!=-1) {
			repeatCount++;
			totalChar+=data;
			osw.write(cbuf, 0, data);
			osw.flush();
		}
		System.out.println(
				"읽은 문자수:"+totalChar+",반복횟수:"+repeatCount);
		osw.close();
	}
}
