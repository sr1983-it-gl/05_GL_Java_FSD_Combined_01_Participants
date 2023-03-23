package v_correct;


public class BinarySearch {

	private int[] array;
	private int searchValue;
	
	public BinarySearch(int[] array) {
		this.array = array;
	}
	
	public int search(int searchValue) {
		
		this.searchValue = searchValue;
		
		int result = startSearch();
		
		return result;
	}
	
	public int startSearch() {
		
		int startIndex = 0;
		int endIndex = array.length - 1;
		
		while (startIndex <= endIndex) {

			int middleElementIndex = (startIndex + endIndex) / 2;
			int middleElementValue = array[middleElementIndex];

			if (middleElementValue == searchValue) {
				return middleElementIndex;
			}else {
				
				if (searchValue > middleElementValue) {
					
					// Present on the right side
					startIndex = middleElementIndex + 1;
				}else if (searchValue < middleElementValue) {
					
					// Present on the left side
					endIndex = middleElementIndex - 1;
				}
			}
			
		}
		
		return -1;
		
	}
	
	public int[] findMiddleElementDetails() {
		
		int resultArray[] = new int[2];
		
		int middleIndex = 0;
		
		if (array.length %2 == 0) {
			middleIndex = (array.length / 2) - 1;
		}else {
			middleIndex = array.length / 2;			
		}
		
		resultArray[0] = middleIndex;
		resultArray[1] = array[middleIndex];		
		return resultArray;
	}
}
