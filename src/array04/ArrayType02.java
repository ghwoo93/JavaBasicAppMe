package array04;

public class ArrayType02 {
	public static void main(String[] args) {
		//2차원 배열:평면
		
		int[][] arrNum;//int arrNum [][];
		
		arrNum = new int[2][3];
		System.out.println(arrNum);
		System.out.println("[초기화 전]");
		for(int i=0;i<2;i++) {
			for(int k=0;k<3;k++) {
				System.out.printf("arrNum[%d][%d]:%-3d",i,k,arrNum[i][k]);
			}
			System.out.println();
		}
		
		arrNum[0][0]=1;
		arrNum[0][1]=2;
		arrNum[0][2]=3;
		arrNum[1][0]=4;
		arrNum[1][1]=5;
		arrNum[1][2]=6;
		
		for(int i=0;i<2;i++) {
			for(int k=0;k<3;k++) {
				System.out.printf("arrNum[%d][%d]:%-3d",i,k,arrNum[i][k]);
			}
			System.out.println();
		}
		System.out.println("행의수:"+arrNum.length);
		System.out.println("0행의 열의수:"+arrNum[0].length);
		System.out.println("1행의 열의수:"+arrNum[1].length);
		
		//열의 크기를 동적으로 할당
		//열을 동적으로 할당하기 위해 열의 수 미지정
		int dynamic[][]=new int[2][];
		dynamic[0]=new int[3];//0행의 열의 수를 3개로 할당하고
		//그 주소를 dynamic[0]에 저장
		System.out.println("0행의주소:"+dynamic[0]+" 0행의열의수:"+dynamic[0].length);
		dynamic[1]=new int[1];
		System.out.println("0행의주소:"+dynamic[1]+" 0행의열의수:"+dynamic[1].length);
		for(int i=0;i<dynamic.length;i++) {
			for(int k=0;k<dynamic[i].length;k++) {
				System.out.printf("dynamic[%d][%d]:%-3d",i,k,dynamic[i][k]);
			}
			System.out.println();
		}
		//초기화
		System.out.println("초기화 후");
		for(int i=0;i<dynamic.length;i++) {
			for(int k=0;k<dynamic[i].length;k++) {
				dynamic[i][k] = i+k;
				System.out.printf("dynamic[%d][%d]:%-3d",i,k,dynamic[i][k]);
			}
			System.out.println();
		}
		//2차원 배열 선언과 동시에 초기화
		int[][] arrInit = {{1,2},{1,2,3,},{1}};
		System.out.println("초기화자 사용");
		for(int i=0;i<arrInit.length;i++) {
			for(int k=0;k<arrInit[i].length;k++) {
				System.out.printf("(%d행,%d열: %-2d)",i,k,arrInit[i][k]);
			}
			System.out.println();
		}
		
		/*
		 * 1 9 9 9 9
		 * 9 1 9 9 9 
		 * 9 9 1 9 9
		 * 9 9 9 1 9
		 */
		//2차원배열 선언시, 선언과 동시에 메모리를 할당해라
		int[][] square =new int[4][5];
		
		//위의 값을 1번에서 선언한 배열에 저장해라
		for(int i=0;i<square.length;i++) {
			for(int j=0;j<square[i].length;j++) {
				if(i==j) square[i][j]=1;
				else square[i][j]=9;
			}
		}
		
		//2차원배열에 저장된 값을 위 모양대로 출력하여라
		for(int i=0;i<square.length;i++) {
			for(int j=0;j<square[i].length;j++) {
				System.out.printf("%-2d",square[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
}
