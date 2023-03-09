package checkedexceptions;

public class DataFetcherTest {

	public static void main(String[] args) {
		
		DataFetcher fetcher = new DataFetcher();
		
		String data = fetcher.fetch();
	
		System.out.println(data);
	}
}
