package abstraction06;
/*
 * 학생
 * 이름/국영수점수/총점/평균/등수 저장하는 클래스
 
 * 성적 정보를 저장하는 자료구조를 추상화하자
 */
public class GradeRecord {
	//멤버상수
	public static final int SUBJECTS=3;
	//멤버변수
	String name;//이름
	int[] jumsu = new int[SUBJECTS];
	int total;
	double avg;
	int rank=1;
	
}
