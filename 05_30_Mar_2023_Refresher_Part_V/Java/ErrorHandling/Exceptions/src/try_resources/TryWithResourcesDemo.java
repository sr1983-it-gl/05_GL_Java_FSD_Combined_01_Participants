package try_resources;

import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {

	public static void main(String[] args) {
		
		try {
			fetchFromFile();			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static String fetchFromFile() throws IOException{
		
		StringBuilder contents  = new StringBuilder();
		
		File file = new File("./my-file.txt");
		
		BufferedReader br = null;
		
		try (FileReader fr = new FileReader(file); ) {
			
			br = new BufferedReader(fr);
			
			while (true) {
				
				String line = br.readLine();
				if (line == null) {
					break;
				}
				
				contents.append(line);
				contents.append(System.getProperty("line.separator"));
			}
		}catch (IOException e) {
			throw e;
		}
		
//		fr.close()
		
		return contents.toString();
	}
	
}
