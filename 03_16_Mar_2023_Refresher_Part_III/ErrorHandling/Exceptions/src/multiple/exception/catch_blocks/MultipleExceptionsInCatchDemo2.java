package multiple.exception.catch_blocks;

public class MultipleExceptionsInCatchDemo2 {

	public static void main(String[] args) {
		
		
		try {
			
			int[] numbers = {10, 32, 122, 90};
			String[] words = {"Good", "morning", "Everyone"};
			
			System.out.println(numbers.length);
			System.out.println(words.length);
			
		}catch (Exception | ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e ) {
			
			logError(e);
		}
	}
	
	static void logError(Exception e) {
		
		System.out.println(e.getMessage());
	}
}
