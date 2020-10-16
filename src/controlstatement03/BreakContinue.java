package controlstatement03;

public class BreakContinue {
	public static void main(String[] args) {
		int i=0;
		
		while(i<10000000) {
			i++;
			System.out.printf("[i가%d일때]%n",i);
			System.out.println("continue문 이전");
			if(i%2==0) continue;
			System.out.println("continue문 이후");
			System.out.println("break문 이전");
			if(i==3)break;
			System.out.println("break문 이후");
		}
		
		//break; break cannot be used outside of a loop or a switch
		//continue; continue cannot be used outside of a loop
		
		outer : for(i=0;i<10;i++) {
			for(int k=0;k<10;k++) {
				System.out.println("HELLO : k="+k+"i="+i);
				break outer;
			}
		}
	}
}
