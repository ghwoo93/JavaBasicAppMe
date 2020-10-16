package exception21;

import java.util.Scanner;

public class ExceptionCatchApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[2];
		try {
			System.out.println("arr[0]방에 입력할 숫자?");
			arr[0] = Integer.parseInt(sc.nextLine());
			System.out.println("arr[1]방에 입력할 숫자?");
			arr[1] = sc.nextInt();
			System.out.println("두 숫자 나누기:"+(arr[0]/arr[1]));
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입려하세요");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어요");
		}catch (Exception e) {
			System.out.println("예외가 발생했어요");
		}
	}
}
