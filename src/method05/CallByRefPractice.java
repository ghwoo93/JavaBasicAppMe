package method05;

public class CallByRefPractice {
	
//	String[] title = {"국어","영어","수학","총점","평균"};
	static void setTotalNAverage(double[][] scores) {
		for(int i=0;i<scores.length;i++) {
			//총점rngkrl
			for(int k=0;k<3;k++) {
				//총점
				scores[i][3]+=scores[i][k];
			}
			scores[i][4]= scores[i][3]/3.0;
		}
	}
	
	static void printScore(double[][] scores) {
		String[] title = {"국어","영어","수학","총점","평균"};
		for(int i=0;i<scores.length;i++) {
			System.out.printf("[%d번째 학생의 성적]",i+1);
			for(int k=0;k<scores[i].length;k++) {
				System.out.printf("%s:%.0f",title[k],scores[i][k]);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		double[][] scores = 
			{{100,100,100,0,0},{90,90,90,0,0},{95,95,95,0,0,}};  
		setTotalNAverage(scores);
		printScore(scores);
	}


}
