package thread23;

class ThreadStop extends Thread{
	//플래그 변수 이용시 아래 멤버 추가 - 비 추천
	boolean isFlag;
	
	
	@Override
	public void run() {
		//플래그 변수 사용시(비추천)
		//while 무한 루프에서 빠져나오더라도
		//작동중이던 동작이 안멈추고 계속 할 수 있기 때문
		/*
		int i=0;
		while(!isFlag) {
			for(i=0;i<=10;i++) {
				System.out.println(i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		*/
		//interrupt()메소드 호출(추천)
		int i=0;
		try {
			while(true) {
				System.out.println("i="+ ++i);
				sleep(200);
			}
		} catch (InterruptedException e) {
			System.out.println("interrupt()메소드 호출");
		} finally {
			System.out.println("스레드 중지");
		}
	}
}

public class ThreadStopApp {
	public static void main(String[] args) {
		ThreadStop thread = new ThreadStop();
		thread.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		thread.isFlag = true;
//		if(조건) {
			if(thread.isAlive()) thread.interrupt();
//		}
	}
}
