package encapsulation13;

public class Contact600 {
	//멤버변수
	SneezeCap sneeze = new SneezeCap();
	SniffleCap sniffle = new SniffleCap();
	SnivalCap snival = new SnivalCap();
	//멤버 메소드
	void take() {
		//복용순서가 중요하다
		//재채기 > 콧물 > 기침
		sneeze.take();
		snival.take();
		sniffle.take();
	}
}
