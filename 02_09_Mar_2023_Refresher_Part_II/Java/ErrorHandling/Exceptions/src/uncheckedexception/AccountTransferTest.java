package uncheckedexception;

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
		input.setSourceAccountNo("12345");
		input.setTargetAccountNo("23456");
		
		AccountTransfer transfer = new AccountTransfer();
		transfer.initiate(input);
	}

	static void scenario3() {
		
		AccountTransferInput input = new AccountTransferInput();
		input.setSourceAccountNo("12345");
		input.setTargetAccountNo("23456");
		input.setAmount(100.0F);
		
		AccountTransfer transfer = new AccountTransfer();
		transfer.initiate(input);
	}

	static void scenario4() {
		
		AccountTransferInput input = new AccountTransferInput();
		input.setSourceAccountNo("12345");
		input.setTargetAccountNo("23456");
		input.setAmount(100.0F);
		
		AccountTransfer transfer = new AccountTransfer();
		transfer.sourceAccountNoValidFlag = true;
		transfer.initiate(input);
	}

	static void scenario5() {
		
		AccountTransferInput input = new AccountTransferInput();
		input.setSourceAccountNo("12345");
		input.setTargetAccountNo("23456");
		input.setAmount(100.0F);
		
		AccountTransfer transfer = new AccountTransfer();
		transfer.sourceAccountNoValidFlag = false;
		transfer.initiate(input);
	}
	
}
