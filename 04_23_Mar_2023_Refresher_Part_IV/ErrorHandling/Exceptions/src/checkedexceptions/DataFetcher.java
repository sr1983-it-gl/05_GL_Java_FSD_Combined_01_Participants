package checkedexceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class DataFetcher {

	private boolean databaseAvailability = false;
	
	public String fetch(){
		
		
		boolean databaseFailure = false;
		
		try {
			String data = fetchFromDatabase();
			return data;
		}catch (SQLException exception) {
			System.out.println(exception.toString());
			databaseFailure = true;
		}
		
		
		boolean fileIOFailure = false;
		
		if (databaseFailure) {
			
			try {
				String data = fetchFromFile();
				return data;
			} catch (IOException e) {
				System.out.println(e.getMessage());
				fileIOFailure = true;
			}
		}
		
		if  (databaseFailure || fileIOFailure) {
			System.out.println("Database and File Sources not available");
			System.out.println("Sending default data");
		}		
		return "DEFAULT";
	}
	
	private String fetchFromDatabase() throws SQLException{
		
		if (!databaseAvailability) {
			
			
			throw new SQLException("Database not available");
		}else {

//			 Fetch Data from DB
//			DriverManager.getConnection(null)

			return "SOME_DATA_RETRIVED_FROM_DB";			
		}
	}
	
	private String fetchFromFile() throws IOException{
		
		StringBuilder contents  = new StringBuilder();
		
		File file = new File("./my-file.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(file);
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
		}finally {
			
			if (br != null) {
				br.close();
			}
		}
		
		
		return contents.toString();
	}
}
