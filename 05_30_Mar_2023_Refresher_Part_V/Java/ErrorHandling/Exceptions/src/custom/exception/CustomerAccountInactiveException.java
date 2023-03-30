package custom.exception;

public class CustomerAccountInactiveException 
	extends RuntimeException{

	private String accountNo;
	private long forHowLongInDays;
	
	public CustomerAccountInactiveException(
		String accountNo, long forHowLongInDays, String message) {
		
		super(message);
		
		this.accountNo = accountNo;
		this.forHowLongInDays = forHowLongInDays;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public long getForHowLongInDays() {
		return forHowLongInDays;
	}
}
