

public class Test {
	public static void main(String[] args) throws InsufficientFundsException {
		
		Account tester = new Account(1122, 20000.00, .045); 
		
		tester.withdraw(2500);
		tester.deposit(3000);
		
		String balance = Double.toString(tester.getBalance());
		String monthlyIR = Double.toString(tester.getMonthlyInterestRate());
		String accountdate = tester.getDate().toString();
		
		System.out.printf("Balance: %s, Monthly IR: %s, Date: %s", balance, monthlyIR, accountdate);
		
		try
	      {
	         tester.withdraw(999999999.00);
	      }catch(InsufficientFundsException ex)
	      {
	         System.out.println("\nThis account is short $" + ex.getDifference());
	      }
	}
}
