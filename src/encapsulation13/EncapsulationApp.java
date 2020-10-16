package encapsulation13;
/*
 * 
 */
public class EncapsulationApp {
	public static void main(String[] args) {
		EncapsulationDAO cap = new EncapsulationDAO();
		cap.initialize("가길동", "123-567", 1000);
		cap.print();
		cap.withDraw(1500);
		cap.withDraw(500);
		cap.deposit(10000);
		cap.print();
	}
}
