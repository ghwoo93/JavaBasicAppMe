package polymorphism14;
class MyClass{
	//멤버변수
	int data;
	//인자 생성자
	public MyClass(int data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return String.valueOf(data);
	}
	@Override
	public int hashCode() {
		return data;
	}
	@Override
	public boolean equals(Object obj) {
		//형변환 가능한지 여부를 체크한 다음에 코드를 진행하자
		if(obj instanceof MyClass) {
			MyClass mc = (MyClass)obj;
			if(mc.data == this.data)return true;
			else return false;
		}
		return false;//타입이 mc가 아닌 경우
	}
}
class Point{
	int x,y;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}


	//문1] x=10 y=20처럼 반환하도록 toString()메소드 오버라이드
	@Override
	public String toString() {
		return 
			this.getClass().getDeclaredFields()[0].getName()+":"+String.valueOf(x)+" "+
				this.getClass().getDeclaredFields()[1].getName()+":"+String.valueOf(y);
	}
	
	//문2] 저장된 x좌표와 y좌표가 같은지 비교 equals() 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point p = (Point)obj;
			if(this.x==p.x&&this.y==p.y) return true;
			else return false;
		}
		return false;
	}
	
}
public class ObjectClass {
	public static void main(String[] args) {
		MyClass mc1 = new MyClass(10);
		MyClass mc2 = new MyClass(100);
		System.out.println("[두 객체의 toString()호출]");
		System.out.println(mc1.toString());
		System.out.println(
				mc1.getClass().getName()
					+'@'+Integer.toHexString(mc1.hashCode()));
		System.out.println(mc2.toString());
		System.out.println(
				mc2.getClass().getName()
					+'@'+Integer.toHexString(mc2.hashCode()));
		System.out.println("[두 객체의 equals()메소드로 주소 비교]");
		System.out.println(mc1.equals(mc2)?"같다":"다르다");
		
		Point point1 = new Point(10,100);
		Point point2 = new Point(10,20);
		System.out.println("[toString()호출]");
		System.out.println(point1);
		System.out.println(point2);
		System.out.println("[equals()호출]");
		System.out.println(point1.equals(point2));
	}
}
