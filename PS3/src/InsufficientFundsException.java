
public class InsufficientFundsException extends Exception{
	
	private double x;
	
	public InsufficientFundsException(double x){
		this.x  = x;
	}

	 public double getDifference()
	   {
	      return x;
	   }
	 }
