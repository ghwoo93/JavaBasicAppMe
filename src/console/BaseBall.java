package console;

public class BaseBall {
	//1.주어진 숫자사이를 랜덤하게 발생시킨 후 중복 되지 않게 배열에 저장하는 메소드
	public static void setRandomNumber(int[] computer, int start, int end) {
		//매개변수 computer 배열이 각 방끼리 중복값을 가졌는지 체크
		//하기 위한 바깥 for와 안쪽for를 돌린다
		for (int i = 0; i < computer.length; i++) {
			// for안에 중복되지 않을 때까지 랜덤하게 숫자를 발생시킴
			while (true) {
				//랜덤하게 숫자 발생 시키자
				int randomNumber = (int)(Math.random()*(end-start+1)+start);
				System.out.println("랜덤발생숫자:"+randomNumber);
				//랜덤하게 발생시킨 숫자의 중복 여부 체크를 위한 변수 선언
				boolean isDuplicated = false;
				//i와 앞의 자리 숫자를 비교하기위해서 j를 i-1로 두어서
				//현재 채워넣는 자리 숫자와 이전의 자리 숫자들이 중복되었는지 비교
				for (int j = 0; j <= i-1; j++) {
					if(randomNumber==computer[j]) {
						System.out.println(j+"번째 확인값:"+computer[j]);
						isDuplicated = true;
						break;
					}
				}
				//1.배열의 첫번째 방에 숫자를 무조건 집어넣는 용도
				//2.중복되지 않았을 때 배열의 방에 집어넣은 용도 
				if(!isDuplicated) {
					System.out.println(i+"번째 입력값:"+computer[i]);
					computer[i]=randomNumber;
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] computer = new int[3];
		//주어진 숫자사이를 랜덤하게 발생시킨 후 중복 되지 않게 배열에 저장하는 메소드
		setRandomNumber(computer,1,9);
	}


}
