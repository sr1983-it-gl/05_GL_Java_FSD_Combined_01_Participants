import java.util.Scanner;

public class JavaApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		
		// Line 6
		// Segment 1
		int a = 10;
		System.out.println(a);
			
		// Segment 2
		try {
			int array[] = {1, 3, 10};
			int c = array[4];
			System.out.println(c);			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
//		}
		
		// Segment 3
		int b = 10;
		System.out.println(b * b);
		
		// Segment 4
		int z= 10 + 10;
		System.out.println(z);			
	}
}
