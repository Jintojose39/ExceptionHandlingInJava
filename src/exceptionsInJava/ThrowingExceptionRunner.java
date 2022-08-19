package exceptionsInJava;


class Amount{
	private String currency;
	private int amount;
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	//public void add(Amount that) throws Exception 
		public void add(Amount that) throws CurrenciesDonotMatchException {	
		if(!this.currency.equals(that.currency)) {
			
			//here we throw the Exception
			//throw new RuntimeException("Currencies not matched");
			
			//throw new Exception("Currencies not matched"+" "+this.currency+"*"+that.currency);
			
			//to  create customized exception we create our own exception 
			//throw new CurrenciesDonotMatchException();
			throw new CurrenciesDonotMatchException("Currencies not matched"+" "+this.currency+"*"+that.currency);
			
		}
		this.amount=this.amount+that.amount;
	}
	
	
	
	public String toString() {
		return amount+" "+currency;
		
	}
	
	
}

class CurrenciesDonotMatchException extends Exception{
	
	public CurrenciesDonotMatchException(String msg) {
		
		//here we use super so we call it method of parent class from sub class.
		super(msg);
	}
	
	
	
	
}



public class ThrowingExceptionRunner {

	public static void main(String[] args) throws   CurrenciesDonotMatchException {
		
		Amount amount1=new Amount("USD",10);
		Amount amount2=new Amount("EUR",20);
		
		amount1.add(amount2);
		
		System.out.println(amount1);
	

	}

}
