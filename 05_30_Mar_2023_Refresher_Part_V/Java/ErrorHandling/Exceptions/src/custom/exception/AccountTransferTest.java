package custom.exception;

import java.util.Calendar;

public class AccountTransferTest {

	public static void main(String[] args) {
		
//		scenario1();
//		scenario2();
//		scenario3();
//		scenario4();
	
		scenario5();
	}
	
	static void scenario1() {
		
		AccountTransferInput input = new AccountTransferInput();
		
		AccountTransfer transfer = new AccountTransfer();
		transfer.initiate(input);
	}

	static void scenario2() {
		
		AccountTransferInput input = new AccountTransferInput();
		input.setSourceAccount(new CustomerAccount("12345"));
		input.setTargetAccount(new CustomerAccount("23456"));
		
		AccountTransfer transfer = new AccountTransfer();
		transfer.initiate(input);
	}

	static void scenario3() {
		
		AccountTransferInput input = new AccountTransferInput();
		input.setSourceAccount(new CustomerAccount("12345"));
		input.setTargetAccount(new CustomerAccount("23456"));
		input.setAmount(100.0F);
		
		AccountTransfer transfer = new AccountTransfer();
		transfer.initiate(input);
	}

	static void scenario4() {
		
		AccountTransferInput input = new AccountTransferInput();
		input.setSourceAccount(new CustomerAccount("12345"));
		input.setTargetAccount(new CustomerAccount("23456"));
		input.setAmount(100.0F);
		
		AccountTransfer transfer = new AccountTransfer();
		transfer.sourceAccountNoValidFlag = true;
		transfer.initiate(input);
	}

	static void scenario5() {
		
		AccountTransferInput input = new AccountTransferInput();

		CustomerAccount sourceAccount = new CustomerAccount("12345");
		
		Calendar lastTransactionDate = Calendar.getInstance();		
		lastTransactionDate.set(2022, 8, 01);		
		sourceAccount.setLastTransactionDate(lastTransactionDate);
				
		input.setSourceAccount(sourceAccount);
		input.setTargetAccount(new CustomerAccount("23456"));
		input.setAmount(100.0F);
		
		AccountTransfer transfer = new AccountTransfer();
		transfer.initiate(input);
	}
	
}
