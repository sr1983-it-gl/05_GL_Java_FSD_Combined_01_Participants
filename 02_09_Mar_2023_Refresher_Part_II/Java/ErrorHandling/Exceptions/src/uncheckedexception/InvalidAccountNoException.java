package uncheckedexception;

public class InvalidAccountNoException extends RuntimeException{


	private String accountNo;
	
	public InvalidAccountNoException(String accountNo, String message) {
		
		super(message);
		this.accountNo = accountNo;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
}
