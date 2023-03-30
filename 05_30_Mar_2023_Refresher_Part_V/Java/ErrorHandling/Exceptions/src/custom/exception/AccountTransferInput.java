package custom.exception;

public class AccountTransferInput {

	private CustomerAccount sourceAccount;
	private CustomerAccount targetAccount;
	
	private Float amount;
	
	public AccountTransferInput() {
		
	}
	
	public CustomerAccount getSourceAccount() {
		return sourceAccount;
	}

	public void setSourceAccount(CustomerAccount sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public CustomerAccount getTargetAccount() {
		return targetAccount;
	}

	public void setTargetAccount(CustomerAccount targetAccount) {
		this.targetAccount = targetAccount;
	}

	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
}
