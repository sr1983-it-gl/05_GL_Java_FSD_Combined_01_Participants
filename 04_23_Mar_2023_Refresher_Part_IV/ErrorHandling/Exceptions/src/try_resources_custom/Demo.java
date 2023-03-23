package try_resources_custom;

public class Demo {

	public static void main(String[] args) {
		
		
		try (WindowsRegistry registry = new WindowsRegistry()){
			
			String value = registry.retrieve("CURRENT_USER");
			
			System.out.println("Current user is " + value);
		}
	}
}
