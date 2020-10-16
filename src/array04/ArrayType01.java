package array04;

import java.util.Scanner;

public class ArrayType01 {
	public static void main(String[] args) {
		//1차원(선형) 배열
//		int[] arrNum;
//		arrNum = new int[5];
//		System.out.println(arrNum);
//		
//		System.out.println("배열 초기화 전");
//		for(int i=0;i<5;i++) {
//			System.out.printf("arrNum[%d]:%d%n",i,arrNum[i]);
//		}
//		
//		arrNum[0]=10;
//		arrNum[1]=20;
//		arrNum[2]=30;
//		arrNum[3]=10;
//		arrNum[4]=50;
//		System.out.println("배열 초기화 후");
//		for(int i=0;i<5;i++) {
//			System.out.printf("arrNum[%d]:%d%n",i,arrNum[i]);
//		}
//		
//		//arrNum[5]=60; 런타임에러 arrayindexoutofbound
//		System.out.println("배열의크기:"+arrNum.length);
//		for(int i=0;i<arrNum.length;i++) {
//			if(arrNum.length-1==i) 
//				System.out.printf("arrNum[%d]:%d%n",i,arrNum[i]);
//			else 
//				System.out.printf("arrNum[%d]:%d,",i,arrNum[i]);
//		}
//		
//		System.out.println("StringArray");
//		String strArray[] = new String[3];
//		System.out.println(strArray);
//		for(int i=0;i<strArray.length;i++) {
//			System.out.printf("%d인덱스방:%s%n",i,strArray[i]);
//		}
//		strArray[1]="소프트웨어";
//		strArray[0]="한국 ";
//		strArray[2]="인재 개발원";
//		for(int i=0;i<strArray.length;i++) {
//			System.out.printf("%d인덱스방:%s%n",i,strArray[i]);
//		}
//		
//		//배열 초기화자
//		double[] dbArr = new double[] {100,3.14,99.9};
//		for(int i=0;i<dbArr.length;i++) {
//			System.out.printf("%d인덱스방:%s%n",i,dbArr[i]);
//		}
//		
//		//boolean blArr[];
//		//blArr= {true,3>2,3>2&&5<3,false}; 배열 선언 후 초기화자로 초기화하면 안된다
//		boolean blArr[]={true,3>2,3>2&&5<3,false};
//		for(int i=0;i<blArr.length;i++) {
//			System.out.printf("%d인덱스방:%b%n",i,blArr[i]);
//		}
//		
//		/*
//		 * 
//		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("학생수를 입력하세요");
//		int numberOfStudents = sc.nextInt();
//		System.out.println("입력받은 학생수:"+numberOfStudents);
//		sc.nextLine();
//		String[] names = new String[numberOfStudents];
//		for(int i=0;i<numberOfStudents;i++) {
//			System.out.printf("%d번째 학생의 이름을 입력하시오%n",i+1);
//			names[i]=sc.nextLine();
//		}
//		for(int i=0;i<names.length;i++) {
//			System.out.printf("%d번째 학생의 이름:%s%n",i+1,names[i]);
//		}
//		
		int[] jumsu = {56,77,78,41,99,87,54,66,22,13,76,85,73,45};
		int sum=0;
		
		//int형배열jumsu에 저장된 첨수의 총합과 평균을 구해라 그리고 출력
		for(int i=0;i<jumsu.length;i++) {
			sum+=jumsu[i];
//			if(i==jumsu.length) System.out.printf("총합:%d%n평균:%s%n",sum,(sum/jumsu.length));
		}
		System.out.printf("총합:%d%n평균:%s%n",sum,(sum/jumsu.length));
		
		//점수배열에 저장된 값중 최대갑을 구하여라
		int max=0;
		for(int i=0;i<jumsu.length;i++) {
			if(jumsu[i]-max>0) max=jumsu[i];
		}
		System.out.println("최대값:"+max);
		
		//일차원 배열을 크기 순서대로 재 배치후 출력하자
		int temp=0;
		int[] rank = new int[jumsu.length];
		
		//i기준으로 생각
		for(int i=0;i<jumsu.length-1;i++) {
			for(int j=i+1;j<jumsu.length;j++) {
				if(jumsu[j]>jumsu[i]) {
					temp=jumsu[j];
					jumsu[j]=jumsu[i];
					jumsu[i]=temp;
				}
			}
		}
		
		for(int i=0;i<jumsu.length;i++) {
			System.out.print(jumsu[i]+" ");
		}
	}
}
