package encapsulation13;

import java.util.Calendar;

public class EncapsulationDAO {
	//멤버변수
	private EncapsulationDTO capsule = new EncapsulationDTO();
	//멤버 메소드
	//-초기화
	public void initialize(
			String name,String accountNo,int balance) {
		capsule.setName(name);
		capsule.setAccountNo(accountNo);
		capsule.setBalance(balance);
	}
	public void deposit(int  money) {
		capsule.setBalance(capsule.getBalance()+money);
		System.out.println(money+"원이 입금되었어요");
	}
	public void withDraw(int money) {
		if(money>capsule.getBalance()) {
			System.out.println("잔액이 부족해요");
			return;
		}
		capsule.setBalance(capsule.getBalance()-money);
		System.out.println(money+"원이 출금되었어요.");
	}
	public void print() {
		System.out.println(String.format("[%s님의 계좌번호]%n계좌번호:%s%n잔액:%d",
				capsule.getName(),
				capsule.getAccountNo(),
				capsule.getBalance()));
	}
	
}
