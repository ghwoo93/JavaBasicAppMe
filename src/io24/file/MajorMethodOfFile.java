package io24.file;

import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;

public class MajorMethodOfFile {
	private static String getName(String path) {
//		int beginIndex=
//				path.indexOf("/") != -1? 
//						path.lastIndexOf("/")+1 : path.lastIndexOf("\\")+1;
//		return path.substring(beginIndex);
		String code = path.contains("/") ? "/" : "\\\\";
		String[] strArr = path.split(code);
		return strArr[strArr.length-1];
	}
	
	public static void main(String[] args) {
		String wExistFile = 
				"D:\\WGH\\Workspace\\JavaBasicAppMe\\src\\HelloWorld.java";
		String wNoExistFile =
				"D:\\WGH\\NOEXIST.TXT";
		String uRelativeDir = "src/io24/node";
		String uAbsoluteDir = "D:/WGH/NODIR";
		//1]File 객체 생성
		//1-1]파일에 대한 정보를 가진 File 생성
		File fwExistFile = new File(wExistFile);
		File fwNoExistFile = new File(wNoExistFile);
		//1-2]디렉토리에 대한 정보를 가진 File 객체
		File fuRelativeDir = new File(uRelativeDir);
		File fuAbsoluteDir = new File(uAbsoluteDir);
		//2]파일명 혹은 디렉토리명 얻기:String getName();
		System.out.println("fwExistFile의 파일명:"+fwExistFile.getName());
		System.out.println("fwNoExistFile의 파일명:"+fwNoExistFile.getName());
		System.out.println("fuRelativeDir의 디렉토리명:"+fuRelativeDir.getName());
		System.out.println("fuAbsoluteDir의 디렉토리명:"+fuAbsoluteDir.getName());
		System.out.println("[내가 만든 getName()메소드]");
		System.out.println("fwExistFile의 파일명:"+getName(wExistFile));
		System.out.println("fwNoExistFile의 파일명:"+getName(wNoExistFile));
		System.out.println("fuRelativeDir의 디렉토리명:"+getName(uRelativeDir));
		System.out.println("fuAbsoluteDir의 디렉토리명:"+getName(uAbsoluteDir));
		/*
		 * 
		 */
		System.out.println(fwExistFile.isFile());
		System.out.println(fwNoExistFile.isFile());
		System.out.println(fuRelativeDir.isDirectory());
		System.out.println(fuAbsoluteDir.isDirectory());
		
		if(fuRelativeDir.exists()) {
			if(fuRelativeDir.isFile())
				System.out.println("file");
			else
				System.out.println("directory");
		}
		System.out.println(
				fwExistFile.exists()?
						fwExistFile.isFile()?"file":"directory":"not exist");
		
		System.out.println("fwExistFile의 상대경로: "+fwExistFile.getPath());
		System.out.println("fwExistFile의 상대경로: "+fwNoExistFile.getPath());
		System.out.println("fwExistFile의 상대경로: "+fwExistFile.getAbsolutePath());
		System.out.println("fwExistFile의 상대경로: "+fwNoExistFile.getAbsolutePath());
		System.out.println("fuRelativeDir의 상대경로: "+fuRelativeDir.getPath());
		System.out.println("fuRelativeDir의 절대경로: "+fuRelativeDir.getAbsolutePath());
		System.out.println("fuAbsoluteDir의 상대경로: "+fuAbsoluteDir.getPath());
		System.out.println("fuAbsoluteDir의 절대경로: "+fuAbsoluteDir.getAbsolutePath());
		
		System.out.println(fwExistFile.length()+"byte");
		System.out.println(fwNoExistFile.length()+"byte");
		System.out.println(fuRelativeDir.length()+"byte");
		System.out.println(fuAbsoluteDir.length()+"byte");
		
		System.out.println(fwExistFile.getParent());
		System.out.println(fwNoExistFile.getParent());
		System.out.println(fuRelativeDir.getParent());
		System.out.println(fuAbsoluteDir.getParent());
		File fone = new File("file");
		System.out.println(fone.getParent());
		File ftwo = new File("parent","child");
		System.out.println(ftwo.getParent());
		ftwo=new File("parent/child");
		System.out.println(ftwo.getParent());
		System.out.println(fwNoExistFile.delete());
		File fexist = new File("D:/WGH/A.txt");
		System.out.println(fexist.delete());
		System.out.println(fuRelativeDir.delete());
		System.out.println(new File("D:/WGH/test"));
		
		File fmkdir = new File("src/io24/node/temp");
		System.out.println(fmkdir.mkdir());
		
		File fmkdirs = new File("src/io24/node/nodir/temp");
		System.out.println(fmkdirs.mkdir());
		System.out.println(fmkdirs.mkdirs());
		
		File fcan = new File("D:/WGH/CAN.txt");
		System.out.println(fcan.canRead()?"읽기 ㄱㄴ":"읽기 ㅂㄱㄴ");
		System.out.println(fcan.canWrite()?"쓰기 ㄱㄴ":"쓰기 ㅂㄱㄴ");
		System.out.println(fcan.canExecute()?"실행 ㄱㄴ":"실행 ㅂㄱㄴ");
		
		SimpleDateFormat dateFormat = 
				new SimpleDateFormat("yyyy-MM-dd E a h:mm");
		System.out.println("최근 수정된 시간:"+
								dateFormat.format(
										new Date(fcan.lastModified())));
		
		File fchagne = new File("D:/WGH/Change.txt");
		File fmove = new File("D:/WGH/Change2.txt");
		System.out.println(fchagne.renameTo(fmove));
		System.out.println(fmove.renameTo(new File("D:/WGH/BackupSpace/Change3.txt")));
		
		String[] names = fuRelativeDir.list();
		System.out.println("[파일 및 디렉토리명만 반환]");
		for (String string : names) System.out.println(string);
		System.out.println("[파일 객체 반환]");
		File[] files = fuRelativeDir.listFiles();
		for (File file:files) {
			System.out.println(
					"최근 수정된 시간:"
							+dateFormat.format(
									new Date(file.lastModified())));
			if(file.isFile())
				System.out.print("파일명: "+file.getName());
			else
				System.out.print("디렉토리명: "+file.getName());
			System.out.println();
		}
		
	}
}
