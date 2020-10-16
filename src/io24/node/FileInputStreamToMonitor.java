package io24.node;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStreamToMonitor {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = 
				new FileInputStream(
						"src/io24/node/keyboard.txt");
		OutputStream out = System.out;
		FileOutputStream fos = 
				new FileOutputStream(
						"src/io24/node/keyboardCopy.txt");
		int data;
		while((data=fis.read())!=-1) {
			fos.write(data);
			fos.flush();
			out.write(data);
			out.flush();
		}
		fis.close();
		fos.close();
		
	}
}
