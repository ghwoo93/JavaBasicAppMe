package io24.node;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageToImage {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			//2입력스트림생성
			fis = 
					new FileInputStream(
							"src/io24/node/이질화.bmp");
			//3출력스트림 생성
			fos = 
					new FileOutputStream(
							"src/io24/node/이질화Copy.bmp");
			//4fis로 읽고 fos로 출력
			int data;
			long startTime = System.currentTimeMillis();
//			while((data=fis.read())!=-1) {
//				fos.write(data);
//				fos.flush();
//			}
			byte[] b = new byte[1024];
			while((data=fis.read(b))!=-1) {
				fos.write(b, 0, data);
//				fos.flush();
			}
			long endTime = System.currentTimeMillis();
			System.out.println("이미지 복사 소요시간:"+(endTime-startTime)/1000.0);
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않아요:"+e.getMessage());
		} catch (IOException e) {
			System.out.println("파일 읽기시 오류:"+e.getMessage());
		} finally {
			
				try {
					if(fis!=null) fis.close();
					if(fis!=null) fos.close();
				} catch (IOException e) {
					System.out.println("스트림 닫기시 오류");
				}
		}
	}
}
