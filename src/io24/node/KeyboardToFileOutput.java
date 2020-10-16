package io24.node;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class KeyboardToFileOutput {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
//		FileOutputStream fos = 
//				new FileOutputStream(
//						"D:\\WGH\\Workspace\\JavaBasicAppMe\\src\\io24\\node\\Keyboard.txt");
//		FileOutputStream fos = 
//				new FileOutputStream(
//						"D:/WGH/Workspace/JavaBasicAppMe/src/io24/node/Keyboard.txt");
		FileOutputStream fos = 
				new FileOutputStream(
						"src/io24/node/Keyboard.txt");
		PrintStream ps = System.out;
		
		int ascii;
		while((ascii=is.read())!=-1) {
			fos.write(ascii);
			fos.flush();
			ps.write(ascii);
			ps.flush();
		}
		fos.close();
	}
}
