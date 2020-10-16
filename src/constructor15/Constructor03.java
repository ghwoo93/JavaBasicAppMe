package constructor15;
class Point{
private int x,y;
	
	public Point() {
		//this(); recursive invocation
		this(1,1);
		System.out.println("기본 생성자");
		//this();//생성자 안에서 첫번째 문장이어야됨
	}
	
	public Point(int x) {
		/*
		this.x=x;
		y=1;*/
		this(x,1);
		System.out.println("인자 생성자:x");
	}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("인자 생성자:x,y");
	}
	//멤버메소드
	void print() {
		System.out.println(String.format("X좌표:%s,Y좌표:%s", x,y));
	}
}
public class Constructor03 {
	public static void main(String[] args) {
		Point point1 = new Point();
		point1.print();
		Point point2 = new Point(10);
		point2.print();
		Point point3 = new Point(10,20);
		point3.print();
	}
}
