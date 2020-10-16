package array04;

import java.util.Scanner;

public class ArrayExample {
	public static final int SUBJECTS=3;
	public static void main(String[] args) {
		/*
		 * 학생수를 사용자입력
		 * scanner
		 * 입력받은수만큼 국영수 총점 인트 배열 선언 메모리할당
		 * 학생 수만큼 각 학생의 국영수 점수를 입력받아
		 * 2에 생성한 배열에 저장해라
		 * 각학생의 국영수 점수 및 종점 그리고 평균을 출력하여라
		 */
		String[] subjects= {"국어","영어","수학"};
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요");
		int numberOfStudents = sc.nextInt();
		
		int[][] students = new int[numberOfStudents][SUBJECTS+1];
		
		for(int i=0;i<students.length;i++) {
			System.out.println(i+1+"번째 학생의 점수를 입력하세요");
			//총점 저장할 변수
			int tot=0;
			for(int k=0;k<SUBJECTS;k++) {
				System.out.println(subjects[k]+" 점수를 입력");
				students[i][k] = sc.nextInt();
				tot+=students[i][k];
			}
			students[i][SUBJECTS]=tot;
		}
		
		for(int i=0;i<numberOfStudents;i++) {
			System.out.println("========================================");
			System.out.println(i+1+"번째 학생 성적");
			System.out.println("========================================");
			System.out.printf("국어:%d,영어:%d,수학:%d,총점:%d,평균:%.2f%n",
					students[i][0],students[i][1],students[i][2],students[i][3],(double)students[i][3]/SUBJECTS);
		}
		
	}
}
