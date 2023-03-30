package multiple.exception.catch_blocks;

public class MultipleExceptionsInCatchDemo {

	public static void main(String[] args) {
		
		
		try {
			
			int[] numbers = {10, 32, 122, 90};
			String[] words = {"Good", "morning", "Everyone"};
			
			System.out.println(numbers.length);
			System.out.println(words.length);
			
		}catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e ) {
			
			logError(e);
		}
		
		/*
		 * catch (ArrayException e){
		 * 		reportErrorMessage();
		 * }
		 * catch (StringIndex...Exception e){
		 * 		reportErrorMessage();
		 * }
		 * 
		 */
	}
	
	static void logError(Exception e) {
		
		System.out.println(e.getMessage());
	}
}
