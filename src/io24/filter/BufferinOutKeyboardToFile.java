package io24.filter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferinOutKeyboardToFile {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = 
				new BufferedInputStream(System.in);
		BufferedOutputStream bos =
				new BufferedOutputStream(
						new FileOutputStream(
								"src/io24/filter/KeyboardBuffered.txt"));
		int data;
		while((data=bis.read())!=-1) {
			bos.write(data);
			bos.flush();
		}
		bos.close();
	}
}
