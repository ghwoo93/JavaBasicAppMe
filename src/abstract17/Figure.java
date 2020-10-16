package abstract17;

public abstract class Figure {
	int width,height,radius;
	public Figure() {
		System.out.println("Figure의 기본 생성자");
	}
	public Figure(int width, int height, int radius) {
		this.width = width;
		this.height = height;
		this.radius = radius;
		System.out.println("Figure의 인자 생성자");
	}
	//도형의 면적을 구하는 추ㅏㅇ 메소드
	abstract void area(String figureName);
}
