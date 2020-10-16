package io24.filter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferinOutKeyboardToMonitor {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis =
				new BufferedInputStream(System.in);
		BufferedOutputStream bos = 
				new BufferedOutputStream(System.out);
		int data;
		while((data = bis.read())!=-1) {
			bos.write(data);
			bos.flush();
		}
	}
}
