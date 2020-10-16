package method05;

import java.io.IOException;
import java.util.Scanner;

public class MethodShape02 {
	/*
	 * 메소드 형식2:매개변수는 없고 반환 값이 있는 경우
	 */
	
	//메소드 정의
	static int noParamYesReturn() {
		int sum=0;
		for(int i=1;i<=10;i++) sum+=i;
		//return; 반환값이 보이드가 아닌경우 리턴타입으로 반환해야한다
		return sum;
	}
	/*
	 * 사용자로부터 국영수
	 * 점수를 입력받아
	 * 평균을 구해서 학점을 반환하는 메소드 정의
	 */
	static String getGrade() {
		Scanner sc = new Scanner(System.in);
		String[] subjects = {"국어","영어","수학"};
		int[] jumsu = new int[subjects.length];
		int tot=0;
		for(int i=0;i<jumsu.length;i++) {
			System.out.println(subjects[i]+"점수 입력?");
			jumsu[i]=sc.nextInt();
			tot+=jumsu[i];
		}
//		switch(tot/30) {
//		case 10:
//		case 9: return "A학점";
//		case 8: return "B학점";
//		case 7: return "C학점";
//		case 6: return "D학점";
//		default: return "F학점";
//		//예외인 경우도 있기때문에 디폴트값을 주고 스위치 쓸 때는 조심해야한다
//		}
		String rt_value;
		switch(tot/30) {
		case 10:
		case 9: rt_value="A학점";break;
		case 8: rt_value="B학점";break;
		case 7: rt_value="C학점";break;
		case 6: rt_value="D학점";break;
		default: rt_value="F학점";break;
		//예외인 경우도 있기때문에 디폴트값을 주고 스위치 쓸 때는 조심해야한다
		}
		return rt_value;
	}
	
	/*
	 * 메소드 숫자두개(스캐너)와
	 * 산술연산자(read())
	 * 메소드안에서 출력
	 * 산술연산자 기호를 반환하는 메소드를 정의해라
	 * 메인메소드에서 호출하여
	 * 사용자가 입력한 연산자를 출력하여라
	 */
	public static char cal() throws IOException {
		Scanner sc = new Scanner(System.in);
		char sign = (char)System.in.read();
		int fnum = sc.nextInt();
		int snum = sc.nextInt();
		switch(sign) {
			case '+':
				System.out.println(fnum+snum);
				break;
			case '-':
				System.out.println(fnum-snum);
				break;
			case '*':
				System.out.println(fnum*snum);
				break;
			case '/':
				System.out.println(fnum/snum);
				break;
			case '%':
				System.out.println(fnum%snum);
				break;
		}
		return sign;
	}
	
	
	public static void main(String[] args) throws IOException {
		//메서드 호출
		//1반환값을 변수에 저장
//		int value = noParamYesReturn();
//		System.out.println("1부터 10까지 누적합:"+value);
//		//2변수미사용 반환값을 바로 출력
//		System.out.println("1부터 10까지 누적합:"+noParamYesReturn());
//		
//		System.out.println("당신의 학점은 "+getGrade());
		
		System.out.println("부호는 "+cal());
	}

}
