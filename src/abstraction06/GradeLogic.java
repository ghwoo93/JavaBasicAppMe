package abstraction06;

import java.util.Scanner;

/*
 * 저장된 성적을 처리하는 로직을 추상화 하자
 * 멤버변수:학생수,GradeRecord타입의 배열(배열크기는 학생수 만큼)
 * 멤버메소드:
	 * 	학생수를 설정하는 메소드
	 * 	점수를 입력받고 총점 및 평균을 구하는 메소드
	 * 	등수를 구하는 메소드
	 * 	결과를 출력하는 메소드
 */
public class GradeLogic {
	//멤버변수
	int numberOfStudents;//학생수 저장용
	GradeRecord[] records;
	String[] titles= {"국어","영어","수학"};
	Scanner sc = new Scanner(System.in);
	
	void setNumberOfStudents() {
		System.out.println("학생수를 입력하세요");
		numberOfStudents = sc.nextInt();
		records = new GradeRecord[numberOfStudents];
		for(int i=0;i<records.length;i++) 
			records[i]=new GradeRecord();
		//스트림 있는 엔터값 읽어서 버리기
		sc.nextLine();
	}/////setNumberOfStudents
	
	//학생수만큼 이름 및 국영수 점수 입력받기
	void setNameNJumsu() {
		for(int i=0;i<numberOfStudents;i++) {
			System.out.printf("[%d번째 학생]%n",i+1);
			System.out.println("이름 입력");
			records[i].name = sc.nextLine();
			for(int j=0;j<GradeRecord.SUBJECTS;j++) {
				System.out.println(titles[j]+"점수입력");
				records[i].jumsu[j]=sc.nextInt();
				records[i].total+=records[i].jumsu[j];
			}
			records[i].avg=(double)records[i].total/GradeRecord.SUBJECTS;
			sc.nextLine();
		}
	}/////setNameNJumsu()
	
	//등수를 구하는 메소드
	void setRank() {
		for(int i=0;i<numberOfStudents-1;i++) {
			for(int j=i+1;j<numberOfStudents;j++) {
				if(records[i].avg < records[j].avg)
					records[i].rank++;
				else if(records[i].avg > records[j].avg)
					records[j].rank++;
			}
		}
	}/////setRank
	
	//등수정렬 메소드
	void sort() {
		for(int i=0;i<numberOfStudents-1;i++) {
			for(int j=i+1;j<numberOfStudents;j++) {
				if(records[i].rank > records[j].rank) {
					//record[i]의 주소를 대입
					GradeRecord temp=records[j];
					records[j]=records[i];
					records[i]=temp;
				}
			}
		}
	}/////sort
	
	//결과를 출력하는 메소드
	void print() {
		//출력 전 정렬하자
		sort();
		//학생수만큼 반복해서 출력
		System.out.println("==========================================");
		System.out.printf(
				"%-8s%-5s%-5s%-5s%-5s%-8s%s%n",
				"NAME","KOR","ENG","MATH","SUM","AVG","RANK");
		System.out.println("==========================================");
		for(int i=0;i<numberOfStudents;i++) {
			System.out.printf("%-10s",records[i].name);
			for(int j=0;j<GradeRecord.SUBJECTS;j++) {
				System.out.printf("%-5s",records[i].jumsu[j]);
			}
			System.out.printf(
					"%-5s%-8.2f%s%n",
					records[i].total,
					records[i].avg,
					records[i].rank);
		}
		System.out.println("==========================================");
	}/////print
	
	
}
