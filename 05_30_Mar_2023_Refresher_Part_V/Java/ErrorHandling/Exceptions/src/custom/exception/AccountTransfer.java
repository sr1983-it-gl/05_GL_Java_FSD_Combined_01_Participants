package custom.exception;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class AccountTransfer {

	public boolean sourceAccountNoValidFlag = true;
	
	public void initiate(AccountTransferInput input) {

		CustomerAccount source = input.getSourceAccount();
		CustomerAccount target = input.getTargetAccount();
		
		if (source.getAccountNo() == null ) {
		
			throw new IllegalArgumentException("Source Account No is NULL");
		}

		if (target.getAccountNo() == null ) {
			
			throw new IllegalArgumentException("Target Account No is NULL");
		}		
		
		if (input.getAmount() == null || input.getAmount() == 0.0F) {

			throw new IllegalArgumentException("Transfer Amount is NULL / Zero");			
		}		
		
		Calendar lastTransactionDate 
			= input.getSourceAccount().getLastTransactionDate();
		
		long time1 = lastTransactionDate.getTime().getTime();
		long time2 = Calendar.getInstance().getTimeInMillis();
		
		long diffInMilliSeconds = (time2 - time1);
		long diffInDays = TimeUnit.DAYS.convert(diffInMilliSeconds, TimeUnit.MILLISECONDS);
		
		System.out.println("Diff in days -> " + diffInDays);
		
		if (diffInDays >= 200) {
		
			throw new CustomerAccountInactiveException(
					input.getSourceAccount().getAccountNo(), diffInDays, 
						"Customer account inactive for so long !!!");
		}
		
				
		System.out.println("Account Transfer Operation DONE !!!");
	}
	
	
}
