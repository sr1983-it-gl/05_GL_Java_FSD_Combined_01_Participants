package custom.exception;

import java.util.Calendar;

public class CustomerAccount {

	private String accountNo;

	private Calendar lastTransactionDate;
	
	public CustomerAccount(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Calendar getLastTransactionDate() {
		return lastTransactionDate;
	}

	public void setLastTransactionDate(Calendar lastTransactionDate) {
		this.lastTransactionDate = lastTransactionDate;
	}
}
