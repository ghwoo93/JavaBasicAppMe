package innerclass22;
//내부 정적 클래스
//빌더패턴(클래스 설계시

//인자가 많은 객체를 생성할 때 유리
//객체 생성과 관련된 디자인 패턴

class Member{
	//멤버변수는 private로
	//필수항목
	private String id;
	private String name;
	//선택 항목
	private String tel;
	private String addr;
	
	//내부 정적 클래스 타입(Builder)을 인자로 받는 생성자 정의
	public Member(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.tel = builder.tel;
		this.addr = builder.addr;
	}
	
	@Override
	public String toString() {
		return String.format(
				"[아이디:%s, 이름:%s, 번호:%s, 주소:%s]", id,name,tel,addr);
	}
	
	//내부 정적 클래스
	static class Builder{
		//외부 클래스와 똑같은 멤버변수를 갖는다
		//필수항목
		private String id;
		private String name;
		//선택 항목
		private String tel;
		private String addr;
		//내부 클래스 인자생성자(필수 항목만 받는)
		public Builder(String id,String name){
			this.id=id;
			this.name=name;
		}
		//멤버변수(선택항목)를 초기화하는 세터를 만든다
		//반환타입은 Builder타입으로
		public Builder setTel(String tel) {
			this.tel = tel;
			return this;
		}
		
		public Builder setAddr(String addr) {
			this.addr = addr;
			return this;
		}
		
		//외부 클래스 타입을 반환하는 메소드
		//빌드를 많이 쓴다
		public Member build() {
			return new Member(this);
		}
	}
}

public class InnerStaticBuilderApp {
	public static void main(String[] args) {
		Member member1 = new Member.Builder("KIM", "김길동").build();
		System.out.println(member1);
		
		Member member2 = 
				new Member.Builder(
						"LEE", "이길동").setTel(
								"010-1234-5678").build();
		System.out.println(member2);
		
		Member member3 = 
				new Member.Builder(
						"PARK", "박길동")
						.setTel("017-1234-5678")
						.setAddr("가산동").build();
		System.out.println(member3);
	}
}
