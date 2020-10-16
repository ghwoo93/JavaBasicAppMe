
package stringclass11;

class AClass {
	
}
class BClass {
	
}

public class StringBasic {
	public static void main(String[] args) {
		/*
		 * 기본 자료형에서 ==은 실제 저장된 값비교
		 * 참조 자료형에서 ==는 주소 비교
		 * 단,같은 클래스 타입끼리만 비교가능하다
		 */
		int num1=10,num2=20;
		String strResult = num1==num2?"데이터가 같다":"데이터가 다르다";
		System.out.println(strResult);
		
		AClass ac = new AClass();
		BClass bc = new BClass();
		//strResult = ac==bc?"주소가 같다":"주소가 다르다"; 
		//참조형에서 다른 클래스 타입끼리는 비교 불가능
		//단,타입이 다르덜다ㅗ 두 클래스간의 상속관계가
		//존재하면 대입 및 형변환 가능
		//헤테로 지니어스??
		AClass ac2 = new AClass();
		strResult = ac==ac2?"주소가 같다":"주소가 다르다";
		System.out.println(strResult);
		System.out.println("ac="+ac+",ac2="+ac2);
		System.out.println("[주소 대입후]");
		ac = ac2;
		strResult = ac==ac2?"주소가 같다":"주소가 다르다";
		System.out.println(strResult);
		System.out.println("ac="+ac+",ac2="+ac2);
		//참조형의 비교시에는 
		//주소를 비교해서 참/거짓 반홚
		strResult = ac.equals(ac2)?"주소가 같다":"주소가 다르다";
		strResult = ac.equals(bc)?"주소가 같다":"주소가 다르다";
		System.out.println(strResult);
		System.out.println("ac:"+ac+",bc:"+bc.toString());
		
		String str1=new String("JAVA");
		String str2=new String("JAVA");
		System.out.println("[new 연산자 사용");
		System.out.println("==로 주소 비교:"+(str1==str2));
		//String클래스의equals()메소드(Object로부터 상속받은 메소드)
		//저장된 실제 문자열을 비교하도록 오버라이딩되있음
		//문자열 비교할때는 equals써라
		System.out.println("equals()로 주소 비교:"+str1.equals(str2));
		/*
		 * String클래스는 프로그래밍에서 기본 자료형ㅊ럼
		 * 워낙 많이 쓰기때문에
		 * new 연산자로 메모리를 할당 안하고
		 * 바로 = "문자열" 대입이 가능
		 */
		
		/*
		 * 스트링이 같은 값을 가지고 있으면 힙메모리에
		//스트링객체를 또 생성하지 않고
		//스텍에서 변수는 같은 주소를 참조하고 있다 
		 */
		String str3="WORLD";
		String str4="WORLD";
		System.out.println("[new 연산자 미사용");
		System.out.println("==로 주소 비교:"+(str3==str4));//true
		System.out.println("equals()로 주소 비교:"+str3.equals(str4));//true
		
		String str5="Hello";
		String str6="hELLO";
		//대소문자 비교
		System.out.println("==로 주소 비교:"+(str5==str6));
		System.out.println("equals()로 주소 비교:"+str5.equals(str6));
		//
		System.out.println("equalsIgnoreCase()로 주소 비교:"+str5.equalsIgnoreCase(str6));
		
		/*
		 * Wrapper클래스처럼
		 */
		String str7 = new String("자바");
		System.out.println("str7"+str7);
		System.out.println("str7.toString()"+str7.toString());
	}
}
