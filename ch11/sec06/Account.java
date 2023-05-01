package ch11.sec06;

public class Account {
	
	private long balance;
	
	public Account() {
		
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public void deposit(int money) {
		balance+=money;
	}
	public void withdraw(int money)throws InsufficientException {
		if(balance<money){
			throw new InsufficientException("잔고부족"+(money-balance)+"모자람");
			//throw로 예외를 발생시킨다 // 그후 생성자를 호출해서 this.message의 값을 위 스트링타입으로 대입시킨다 
		}
		balance-=money;
	}
	
	
}
