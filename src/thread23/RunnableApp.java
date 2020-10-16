package thread23;

class Command{
	void longedMethod() {
		for(int i=0;i<=10;i++) {
			System.out.println(
					String.format(
							"실행중인 스레드명:%s,i=%s", 
							Thread.currentThread().getName(),i));
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Solidier extends Command implements Runnable{

	@Override
	public void run() {
		longedMethod();
	}
	
}

public class RunnableApp {
	public static void main(String[] args) {
		Solidier solidier = new Solidier();
		//solidier.start();
		System.out.println(solidier instanceof Solidier);
		System.out.println(solidier instanceof Command);
		System.out.println(solidier instanceof Runnable);
		//System.out.println(solidier instanceof Thread);
		Thread th1 = new Thread(solidier);
		th1.setName("첫번째 스뤠드");
		th1.start();
		
		Thread th2 = new Thread(solidier,"두번째 스뤠드");
		th2.start();
	}
}
