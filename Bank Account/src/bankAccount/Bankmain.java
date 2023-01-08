package bankAccount;

public class Bankmain {

	public static void main(String[] args) {
		
		Bankaccount abc = new Bankaccount("42201999", "Muhammad Mustafa", 45000);
		Deposit abcd = new Deposit();
		abcd.deposit(1000,abc);
		abcd.withdraw(100,abc);
		abcd.getBalance(abc);
		
		
		
	}

}
