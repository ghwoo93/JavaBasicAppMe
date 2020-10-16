package abstract17;

public class FigureApp {
	public static void main(String[] args) {
		//Figure f = new Figure(); 추상 클래스라 인스턴스화 안됨
		Figure f = new Rectangle(100, 100);
		f.area("사각형");
		f = new Triagle(100, 100);
		f.area("삼각형");
		f = new Circle(100);
		f.area("원");
		
		Rectangle rect = new Rectangle(100, 100);
		rect.area("사각형");
		
		//rect = new Circle(100); 상속관계가 존재하지 않아서
		//System.out.println(rect instanceof Circle);
	}
}
