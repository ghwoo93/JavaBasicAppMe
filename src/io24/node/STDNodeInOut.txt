package io24.node;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class STDNodeInOut {
	public static void main(String[] args) throws IOException {
		//1] 바이트 기반의 입력용 노트 스트림 생성(키보드와 직접 연결 가능한 노트 스트림)
		InputStream is = System.in;
		//2]
		PrintStream ps = System.out;
		//3]is로 읽고 ps로 출력
//		int ascii = is.read();
//		ps.println("입력문자:"+ascii);
//		ps.write(ascii);
//		ps.flush();
//		ps.close();
//		ps.println("프로그램 끝");
		
		int ascii;
		
//		while((ascii=is.read())!=-1) {
//			ps.write(ascii);
//			ps.flush();
//			ps.print(((char)ascii));
//		}
		/*
		 * 사용자가 입력한 문자열을 변수에 그대로 저장
		 * 즉 read()메소드로 Scanner클래스의
		 * nextLine()메소드 기능 구현하기
		 */
//		System.out.println("문자열을 입력하세요");
//		StringBuffer sb = new StringBuffer();
//		while((ascii=is.read())!=13) {
//			sb.append((char)ascii);
//		}
//		ps.println("입력한 문자열:"+sb);
		int totByte=0,repeatCount=0;
		String inputString="";
		/*
		while((ascii=is.read())!=13) {
			totByte++;
			repeatCount++;
			inputString+=(char)ascii;
		}
		*/
		byte[] b = new byte[3];
		boolean isEnter = false;
		while((ascii=is.read(b))!=-1) {
			totByte+=ascii;
			repeatCount++;
			for(int i=0;i<ascii;i++) {
				if(b[i]!=13&&b[i]!=10) {
					inputString+=(char)b[i];
				}else if(b[i]==10) {
					isEnter=true;
					break;
				}
			}
			if(isEnter) break;
		}
		System.out.println(
				String.format(
						"총바이트:%s,반복횟수:%s,입력문자열:%s", 
						totByte-2,repeatCount,inputString));
		
		
	}
}
