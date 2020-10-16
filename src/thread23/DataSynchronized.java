package thread23;
//동기화 블락을 이용한 데이타 동기화

class DataSyncClass{
	//여러 스레드가 공유하는 메모리
	int shareData;
	//인자 생성자
	public DataSyncClass(int shareData) {
		this.shareData = shareData;
	}
}
class DataSyncThread extends Thread{
	DataSyncClass dsc;
	int inc;
	
	public DataSyncThread(DataSyncClass dsc, int inc,String threadName) {
		super(threadName);
		this.dsc = dsc;
		this.inc = inc;
	}
	
	void increase() {
		for(int i=0;i<=10;i++) {
			dsc.shareData+=inc;
			System.out.println(
					String.format(
							"[스레드명:%s,공유데이터:%s]", 
							getName(),dsc.shareData));
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		//데이터 동기화 전
		increase();
		//동기화 후
		/*
		synchronized(dsc) {
			increase();
		}
		*/
	}
}
public class DataSynchronized {
	public static void main(String[] args) throws InterruptedException {
		DataSyncClass dsc = new DataSyncClass(10);
		DataSyncThread dst1 = new DataSyncThread(dsc, 2, "1st");
		DataSyncThread dst2 = new DataSyncThread(dsc, 5, "2nd");
//		DataSyncThread dst3 = new DataSyncThread(dsc, 5, "3rd");
		
		dst1.start();
		dst1.join();
		dst2.start();
//		dst3.start();
	}
}
