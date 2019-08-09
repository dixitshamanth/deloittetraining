package exceptionhandling;

public class NegativeBillAmountException extends Exception {

	public NegativeBillAmountException(){
		
	}
	
	public NegativeBillAmountException(String message){
		super(message);
	}
}

