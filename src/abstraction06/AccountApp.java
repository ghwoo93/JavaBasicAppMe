package abstraction06;

class Account{
	//멤버변수
	String name;
	String accountNo;
	int balance;
	//멤버메소드
	//입금하다
	void deposit(int money) {
		balance+=money;
		System.out.println(money+"가 입금되었습니다.");
	}
	void withdraw(int money) {
		if(balance<money) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		balance-=money;
		System.out.println(money+"가 출금되었습니다.");
	}
	//통장정보 출력용
	void printAccount() {
		System.out.printf("[%s님의 계좌정보]%n",name);
		System.out.printf("계좌번호:%s%n",accountNo);
		System.out.printf("잔액:%d%n",balance);
	}
}


public class AccountApp {
	public static void main(String[] args) {
		Account ac1 = new Account();
		System.out.println("[멤버 변수 초기화 전]");
		ac1.printAccount();
		ac1.accountNo="123-4567";
		ac1.name="가길동";
		ac1.balance=1000;
		ac1.printAccount();
		ac1.withdraw(15000);
		ac1.withdraw(500);
		//통장정리
		ac1.printAccount();
		ac1.deposit(10000);
		ac1.printAccount();
		
		Account ac2 = new Account();
		ac2.accountNo="567-1234";
		ac2.balance=10000;
		ac2.name="나길동";
		ac2.printAccount();
	}
}
