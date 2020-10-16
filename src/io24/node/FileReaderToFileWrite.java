package io24.node;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderToFileWrite {
	public static void main(String[] args) throws IOException {
		FileReader fr = 
				new FileReader(
						"src/io24/node/FileInputStreamToMonitor.java");
		FileWriter fw = 
				new FileWriter(
						"src/io24/node/FileInputStreamToMonitor.txt");
		int data;
		char[] cbuf = new char[100];
		while((data=fr.read(cbuf))!=-1) {
			fw.write(cbuf);
			fw.flush();
			fw.append("*");
			fw.flush();
		}
		fw.close();
	}
}
