package ch11.sec06;

public class AccountExample {
	public static void main(String[] args) {
		Account account=new Account();	
		account.deposit(10000);
		System.out.println("예금액:"+account.getBalance());
		try {
			account.withdraw(30000);
		}catch(InsufficientException e) {
			//get명령어로 아까 대입시켜둔 메세지를 string타입으로 저장시킨후 출력한다 
			String message=e.getMessage();
			System.out.println(message);
		}
	}
}
