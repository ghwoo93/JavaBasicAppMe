package interface18;

public class Triagle extends FigureDate implements Drawable,Figure{
	
	public Triagle(int width, int height) {
		super(width, height);
	}

	@Override
	public void area(String figureName) {
		System.out.println(figureName+"의 면적:"+(width*height*0.5));
	}
	@Override
	public void draw(String figureName) {
		System.out.println(figureName+"을 그리다");
	}
 
}
