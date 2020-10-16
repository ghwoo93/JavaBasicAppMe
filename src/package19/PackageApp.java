//패키지 선언문
package package19;
//import 선언문
import java.lang.String;//의미없다
import java.util.Date;

public class PackageApp {
	public static void main(String[] args) {
		Date utilDate = new Date();
		System.out.println(utilDate);
		
		java.sql.Date sqlData = new java.sql.Date(utilDate.getTime());
		System.out.println(sqlData);
	}
}
