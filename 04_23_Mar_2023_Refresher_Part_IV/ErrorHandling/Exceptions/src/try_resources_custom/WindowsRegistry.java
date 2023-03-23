package try_resources_custom;

import java.util.HashMap;
import java.util.Map;

public class WindowsRegistry implements AutoCloseable{

	private static Map<String, String> MAP = 
		new HashMap<>();	
		
	public WindowsRegistry() {
		
		MAP.put("NO_OF_INSTALLED_SOFTWARES", "10");
		MAP.put("CURRENT_USER", "test_user");
	}
	
	public String retrieve(String key) {
		return MAP.get(key);
	}

	@Override
	public void close() {
		
		System.out.println("Disconnecting from Windows Registry...");		
	}
}
