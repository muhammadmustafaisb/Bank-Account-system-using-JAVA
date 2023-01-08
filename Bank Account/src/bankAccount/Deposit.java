package bankAccount;

public class Deposit {
	
	
	

	public void deposit(double deposit1, Bankaccount bankaccount) {
        
		
		double a = bankaccount.accountBalance + deposit1;
		
		System.out.println("New Balance of account after Deposit " +a);
		
	}
	
	public void withdraw(double withdraw1, Bankaccount bankaccount) {
	
		double b = bankaccount.accountBalance - withdraw1;
	
		
		if(withdraw1 >= bankaccount.accountBalance){
			
			System.out.println("Your Balance is unsuffient");
			
			
		}
		
		else {System.out.println("New Balance of account after withdraw " +b );}
		
			
		}
	
	public void getBalance(Bankaccount bankaccount) {
		
		System.out.println("Your Current Account Balance is " +bankaccount.accountBalance );
		
	}

}
