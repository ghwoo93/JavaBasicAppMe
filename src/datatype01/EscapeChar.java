package datatype01;

public class EscapeChar {

	public static void main(String[] args) {
		System.out.println("Hit Homerun");
		System.out.println("Hi\tHomerun");
		
		//1]\n:줄바꿈
		System.out.print("Welcome to JAVA!\n");
		System.out.print("Hi JAVA!\n");
		System.out.print("\nLet's Do it.\n\t\t\t\t\t\t\t Go Fighting!\n");
		System.out.println("My Nickname is Superman\rXX");
		
		System.out.println("국어t영어t수학");
		System.out.println("국어\t영어\t수학");
		
		System.out.println("나의 닉네임은 '스보'입니다");
		System.out.println("나의 닉네임은 \'스보\'입니다");
		
//		System.out.println("나의 닉네임은 "스보"입니다");
		System.out.println("나의 닉네임은 \"스보\"입니다");
		
		System.out.println("D:\\nDrive\\table");
		
		/*
	  	Format String:출력형식을 지정하기 위한 형식 문자열		
		%s나 %d등의 변환 지시어(Conversion Specifier)를
		사용해서 원하는 출력 형식을 만들 수있다.
		※변환지시어를 쓸 수는 메소드가 정해져 있다
		*/
		
		/*
		주요 변환 지시어]
		 %d :정수값 출력시(byte/short/int/long)
		 %f :실수값 출력시(float/double)
		 %c:한 문자 출력시(char)	
		 %b:boolean형 출력시			
		 %s:문자열 출력시	
		 %n:줄바꿈 (\r\n도 가능)			 
		 %%: %리터럴을 의미
		 */
		int kor = 99,eng=80,math=96;
		double avg = (kor +eng+math)/3.0;
		System.out.print("[형식 문자열 미 사용]");
		System.out.println("국어:"+kor+",영어:"+eng+",수학:"+math+",평균:"+avg);
		//printf("형식문자열",값들을 콤마로 구분해서 나열)
		//단,printf는 줄바꿈 기능이 없다.
		System.out.println("[형식 문자열 사용]");
		System.out.printf("국어:%d,영어:%d,수학:%d,평균:%f%n",kor,eng,math,avg);
		System.out.println("Is line change?");
		System.out.printf("국어:%d\t영어:%d\t수학:%d\t평균:%f\r\n",kor,eng,math,avg);
		System.out.println("Is line change?");
		
		/*
		 * 형식문자열에서 데이터 출력시 자릿수 지정
		 * 양수일때 오른쪽부터 음수일때 왼쪽부터 자릿수를 지정한다.
		 */
		System.out.println("[출력 자리수 미 지정]");
		System.out.printf("국어:%3d,영어:%d,수학:%d,평균:%f%n",kor,eng,math,avg);
		System.out.println("[출력 자리수 지정(양수)]");
		System.out.printf("국어:%4d,영어:%4d,수학:%4d,평균:%7.2f%n",kor,eng,math,avg);
		System.out.println("[출력 자리수 지정(음수)]");
		System.out.printf("국어:%-4d,영어:%-4d,수학:%-4d,평균:%.2f%n",kor,eng,math,avg);
		
		/*
		 * 기타]
		 * 모든 값을 %s로 출력해도 된다
		 */
		System.out.printf("%c %b %.2f %s%n",'가',false,3.14578,"문자열");
		System.out.println("==========================");
		System.out.printf("%25s%n","자바반성적표");
		System.out.println("==========================");
		System.out.printf("%-10s%-12s%s%n","KOREA","ENGLISH","MATH");
		System.out.println("==========================");
		System.out.printf("%-10s%-12s%s%n",100,99,78);
		System.out.printf("%-10s%-12s%s%n",kor,eng,math);
		
	}

}
