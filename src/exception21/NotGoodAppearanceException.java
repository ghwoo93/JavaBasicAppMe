package exception21;

public class NotGoodAppearanceException extends Exception{
	public NotGoodAppearanceException() {
		super("복장 불량은 입장 불가");
	}
	
	public NotGoodAppearanceException(String message) {
		super(message);
	}
	
	
}
