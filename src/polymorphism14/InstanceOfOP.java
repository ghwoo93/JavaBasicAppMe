package polymorphism14;
class Super{
	
}
class Normal extends Super{
	
}
public class InstanceOfOP {
	public static void main(String[] args) {
		String string = new String("JAVA");
		StringBuffer buffer = new StringBuffer("JAVA");
		//상속관계 미 존재시 대입 연산도 불가
//		string = buffer;
//		buffer = string;
		System.out.println(
				string instanceof String?
						"string은 String타입이다":"string은 String타입이 아니다");
		System.out.println(
				string instanceof Object?
						"string은 Object타입이다":"string은 Object타입이 아니다");
		System.out.println(
				buffer instanceof StringBuffer?
						"buffer은 StringBuffer타입이다":
							"buffer은 StringBuffer타입이 아니다");
		System.out.println(
				buffer instanceof Object?
						"buffer은 Object타입이다":
							"buffer은 Object타입이 아니다");
		
		Object object = new Object();
		object =  new String();
		
//		String strObj = (String)object;//실행오류
		System.out.println(object instanceof String);
		if(object instanceof String) {
			String strObj = (String)object;
			System.out.println("형변환 일어남");
		}
		object = new String();
		String strObj = (String)object;
		System.out.println("object instanceof String: "+(object instanceof String));
		Super s = new Super();
		System.out.println(s instanceof Super);
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Normal);
		
		s = new Normal();
		System.out.println(s instanceof Super);
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Normal);
		Normal n = (Normal)s;
	}
}
