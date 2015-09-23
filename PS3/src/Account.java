import java.util.Date;

public class Account {

	private int id;
	
	private double balance;
	
	private double annualInterestRate;
	
	private Date dateCreated;
	
	public Account(){
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
        this.dateCreated = new Date();
	}
	
	public Account( int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = new Date();
	}
	
	public int getID(){
		return id;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public Date getDate(){
		return dateCreated;
	}
	
	public void setID(int id){
		this.id=id;
	}
	
	public void setBalance(double balance){
		this.balance=balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
	
   public double getMonthlyInterestRate(){
	   return annualInterestRate/12;
   }
   
   public void withdraw(double x) throws InsufficientFundsException{
	   
	   if(balance >= x){
	   balance = balance - x;
	   }else{
		   double difference = x - balance;
		   throw new InsufficientFundsException(difference);
	   }
	   
   }
    
   public void deposit(double x){
	   balance = balance + x;
   }
    
}
