package uncheckedexception;

public class AccountTransfer {

	public boolean sourceAccountNoValidFlag = true;
	
	public void initiate(AccountTransferInput input) {

		if (input.getSourceAccountNo() == null ) {
		
			throw new IllegalArgumentException("Source Account No is NULL");
		}

		if (input.getTargetAccountNo() == null ) {
			
			throw new IllegalArgumentException("Target Account No is NULL");
		}		
		
		if (input.getAmount() == null || input.getAmount() == 0.0F) {

			throw new IllegalArgumentException("Transfer Amount is NULL / Zero");			
		}		
		
		
		if (!sourceAccountNoValidFlag) {
			
			throw new InvalidAccountNoException(
				input.getSourceAccountNo(), "Check the source account no");
		}
		
		System.out.println("Account Transfer Operation DONE !!!");
	}
}
