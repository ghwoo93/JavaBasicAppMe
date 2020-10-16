package abstraction06;

public class GradeApp {
	public static void main(String[] args) {
		GradeLogic logic = new GradeLogic();
		logic.setNumberOfStudents();
//		이름 및 ㅈㅁ수를 입력받고 총점 및 펴육ㄴ을 구하는 메소드 호출
		logic.setNameNJumsu();
		logic.setRank();
		logic.print();
		System.out.println(logic);
		
	}
}
