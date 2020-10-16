package wrapperclass10;
//auto-boxing <> autounboxing
/*
 * 
 */
public class WrapperClass01 {
	public static void main(String[] args) {
		int num1=200;
		int num2=20;
		int result=num1+num2;
		System.out.println(result);
		//오버라이딩
		Integer num1Obj= new Integer(10);
		System.out.println(num1Obj);
		Integer num2Obj= new Integer(20);
		//자바에서는 주소연산이 안되는데
		//되는 이유는 오버라이딩 되서 
		//jdk 1.4이전 버전에서는 안됬다
		System.out.println(num1Obj+num2Obj);
		result = num1Obj.intValue()+num2Obj.intValue();
		System.out.println("result="+result);
		
		//num1. 기본자료형은 멤버가 없다
		Integer num1Object = new Integer(num1);//jdk1.4이전 버전에서
		System.out.println("num1(int)을 byte형 값으로 변경:"+num1Object.byteValue());
		System.out.println((byte)num1);
		System.out.println("num1을 이진수로 변경:"+Integer.toBinaryString(num1));
		System.out.println("num1Object:"+num1Object);
		System.out.println("num1Object.toString():"+num1Object.toString());
		
		/*jdk 5.0 이후의 코딩 형태	*/
		//기본자료형과 참조형과는 대입연산을 할수 없는데 오토박싱언박싱이 할수있게 해줌 
		num1Obj = num1;
		int num3 = num1Obj;
		num1Obj=100;
		//그래서 보통 상수는  공개해야하고 ???해야해서 static final
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println("num1을 8진수 문자열로 변경:"+Integer.toOctalString(num1));
		System.out.println("num1을 16진수 문자열로 변경:"+Integer.toHexString(num1));
		
		/*
		 * 자바의 모든 클래스들은 Object라는
		 * 최상위 클래스로부터 상속받는다
		 * Object의 toString()메소드를
		 * 오버라이딩하여 인스턴스 변수를 출력시
		 * 주소가 아니라
		 * 실제 저장된 값이 반환되도록 오버라이딩 되었다
		 */
		Integer remodel = new Integer(99);
		System.out.println("remodel="+remodel);
		System.out.println("remodel.getClass().getName()="+remodel.getClass().getName());
		System.out.println("remodel.toString()="+remodel.toString());
		System.out.println("remodel.toString()반환값의 클래스명="+remodel.toString().getClass().getName());
		System.out.println("remodel="+remodel.hashCode());
		/*
		 * 
		 */
		WrapperClass01 wc = new WrapperClass01();
		System.out.println("wc="+wc);
		System.out.println("wc.toStirng()="+wc.toString());
		System.out.println("wc.hashCode()="+wc.hashCode());
		System.out.println(Integer.toHexString(wc.hashCode()));
		
		
	}
}
