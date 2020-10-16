package io24.filter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class BufferedRWFileToFile {
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(
								new FileInputStream(
										"src/io24/filter/BufferedInOutFileToFile.java")));
		PrintWriter pw =
				new PrintWriter(
						new FileWriter(
								"src/io24/filter/BufferedInOutFileToFile.txt"), true);
		String str=null;
		while((str=br.readLine())!=null) {
			pw.println(str);
		}
		br.close();
		pw.close();
	}
}
