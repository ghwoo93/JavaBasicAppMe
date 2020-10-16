package io24.filter;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class BufferedRWKeyboardToMonitor {
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(
										System.in));
		BufferedWriter bw =
				new BufferedWriter(
						new OutputStreamWriter(
										System.out));
		String data;
		/*
		while((data=br.readLine())!=null) {
			/*
			bw.write(data+"\r\n");
			bw.flush();
			bw.write(data);
			bw.newLine();
			bw.flush();
		}
		*/
		PrintWriter pw = new PrintWriter(System.out,true);
		while((data=br.readLine())!=null) {
			pw.println(data);
		}
		
	}
}
