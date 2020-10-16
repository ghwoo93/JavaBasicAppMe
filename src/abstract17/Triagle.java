package abstract17;

public class Triagle extends Figure {
	
	public Triagle(int width, int height) {
		super(width,height,-1);
		System.out.println("Triagle의 인자 생성자");
	}
	@Override
	void area(String figureName) {
		System.out.println(figureName+"의 면적:"+(width*height*0.5));

	}

}
