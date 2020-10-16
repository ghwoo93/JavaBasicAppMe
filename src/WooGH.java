import java.lang.String;
import java.lang.System;
import java.util.Date;
import java.text.SimpleDateFormat;

public class WooGH {
	public static void main(String args[]){

		/*
		System.out.println("한국 소프트웨어");
		System.out.println("인재 개발원");
		System.out.println("가산 디지털 단지에 위치");
		*/
		Date today = new Date();
		System.out.println(today);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
		System.out.println(dateFormat.format(today));

	}

}