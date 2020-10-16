package io24.filter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedRWFileToMonitor {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(
						new FileReader(
								"src/io24/filter/BufferedRWKeyboardToFile.java"));
		
		PrintWriter pw = new PrintWriter(System.out, true);
		
		String data = null;
		int i=0;
		while((data=br.readLine())!=null) {
			++i;
			pw.println(String.format("%-5d%s",i,data.replace("java", "자바")));
		}
		pw.close();
	}
}
