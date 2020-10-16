package io24.filter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferinOutFileToMonitor {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = 
				new BufferedInputStream(
						new FileInputStream(
								"src/io24/filter/KeyboardBuffered.txt"));
		BufferedOutputStream bos = 
				new BufferedOutputStream(System.out);
		int data;
		while((data=bis.read())!=-1) {
			bos.write(data);
			bos.flush();
		}
		bis.close();
	}
}
