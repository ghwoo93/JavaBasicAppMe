package encapsulation13;

public class ColdPatient {
	/*캡슐화 전
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
	}*/
	//캡슐화 후
	//멤버변수
	Contact600 contact600 = new Contact600();
	void take() {
		contact600.take();
	}
}
