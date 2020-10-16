package io24.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WindowExplorer {
	public static void main(String[] args) {
		File file = new File("src/io24/node");
		System.out.println("======================================================================");
		System.out.println(String.format("%-58s%-38s%-18s%s", "이름","수정한 날짜","유형","크기"));
		System.out.println("======================================================================");
		
		//사전 객체 생성
		File[] fList = file.listFiles();
		StringBuffer fbuf = new StringBuffer();
		StringBuffer dbuf = new StringBuffer();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E a h:mm");
		
		for (File f : fList) {//버퍼 입력
			String date = sdf.format(new Date(f.lastModified()));
			String name = f.getName();
			if(!f.isFile()) {//디렉토리
				dbuf.append(String.format("%-31s", name));
				dbuf.append(String.format("%-19s",date));
				dbuf.append(String.format("%7s","파일 폴더"));
				dbuf.append("\r\n");
			}else {//폴더
				fbuf.append(String.format("%-31s", name));
				fbuf.append(String.format("%-23s",date));
				fbuf.append(String.format("%-15s",name.substring(name.indexOf(".")+1)+"파일"));
				fbuf.append(String.format("%s",(int)Math.ceil(f.length()/1024.0)+"KB"));
				fbuf.append("\r\n");
			}
		}
		
		//버퍼 출력
		System.out.print(dbuf);
		System.out.println(fbuf);
	}
}
