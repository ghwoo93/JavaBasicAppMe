package thread23;

class MethodSyncClass{
	int seed;
	public MethodSyncClass(int seed) {
		this.seed=seed;
	}
	synchronized void increase(int inc) {
		for(int i=0;i<=10;i++) {
			seed+=inc;
			System.out.println(
					String.format(
							"[스레드 명:%s,데이터:%s,i=%s]", 
							Thread.currentThread().getName(),seed,i));
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MethodSyncThread extends Thread{
	MethodSyncClass msc;
	int inc;
	
	public MethodSyncThread(
			MethodSyncClass msc, int inc, String threadName) {
		super(threadName);
		this.msc = msc;
		this.inc = inc;
	}

	@Override
	public void run() {
		msc.increase(inc);
	}
}

public class MethodSyncronized {
	
	public static void main(String[] args) {
		MethodSyncClass msc = new MethodSyncClass(10);
		MethodSyncThread mst1 = new MethodSyncThread(msc, 2, "1st");
		mst1.start();
		MethodSyncThread mst2 = new MethodSyncThread(msc, 5, "2nd");
		mst2.start();
	}
}
