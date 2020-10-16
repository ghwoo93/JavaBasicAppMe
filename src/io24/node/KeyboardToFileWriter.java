package io24.node;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KeyboardToFileWriter {
	public static void main(String[] args) throws IOException {
		//1]바이트 기반 입력 스트림 생성
		InputStream is = System.in;
		//2]브릿지 스트림을 이용해서 바이트 기반 입력을 문자 기반으로 변환
		InputStreamReader isr = new InputStreamReader(is);
		//3]문자 기반의 출력 스트림 생성
		FileWriter fw = 
				new FileWriter(
						"src/io24/node/KeyboardWriter.txt");
		int data;
		/*
		//is로 읽고 fw로 출력-한글이 깨진다
		while((data=is.read())!=-1) {
			fw.write(data);
			fw.flush();
		}
		*/
		//4]isr로 읽어서 fw로 출력
		int totalChar=0;
		/*
		필터 효과 적용전]
		read()는 바이트 단위가 아니라 문자 단위로 읽는다
		고로 총 바이트수를 카운트로 알아내기 힘들다
		while((data=isr.read())!=-1) {
			totalChar++;
			fw.write(data);
			fw.flush();
		}
		*/
		//필터 효과 적용]
		char[] cbuf = new char[10];
		while((data=isr.read(cbuf))!=-1) {
			totalChar+=data;
			fw.write(cbuf,0,data);
			fw.flush();
		}
		//스트림 닫기
		fw.close();
	}
}
