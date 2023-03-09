package v_correct;

import debugger.DataStructureUtils;

public class BinarySearchTest {

	public static void main(String[] args) {
		
		scenario1();
//		middleElementOddArrayTest();
		
//		evenArraySearchTest();
//		oddArraySearchTest();
		
//		noSearchValueTest();
	}
	
	private static void scenario1() {
		
		
		int array[] = { 9, 18, 24, 27, 35, 38, 46, 56 };
		DataStructureUtils.print(array);

		BinarySearch search = new BinarySearch(array);
		
		int middleElement = search.search(56);
		
		System.out.println(String.format("Middle Element is %d", middleElement));				
	}

	private static void middleElementOddArrayTest() {
				
//		int array[] = DataStructureUtils.generateRandomSortedArray(7);
//		DataStructureUtils.print(array);
//
//		BinarySearch search = new BinarySearch(array);
//		
//		int middleElement = search.findMiddleElement();
//		
//		System.out.println(String.format("Middle Element is %d", middleElement));				
	}


	private static void evenArraySearchTest() {
		
		int array[] = DataStructureUtils.generateRandomSortedArray(7);
		DataStructureUtils.print(array);

		BinarySearch search = new BinarySearch(array);
		
		int searchElement = DataStructureUtils.pickRandomNumber(array);
		int positionIndex = search.search(searchElement);
		
		System.out.println(String.format(
			"Element %d present at index %d", searchElement, positionIndex));				
	}
	

	private static void oddArraySearchTest() {
		
		int array[] = DataStructureUtils.generateRandomSortedArray(8);
		DataStructureUtils.print(array);

		BinarySearch search = new BinarySearch(array);
		
		int searchElement = DataStructureUtils.pickRandomNumber(array);
		int positionIndex = search.search(searchElement);
		
		System.out.println(String.format(
			"Element %d present at index %d", searchElement, positionIndex));				
	}

	private static void noSearchValueTest() {
		
		int array[] = DataStructureUtils.generateRandomSortedArray(8);
		DataStructureUtils.print(array);

		BinarySearch search = new BinarySearch(array);
		
		int searchElement = 99999;
		int positionIndex = search.search(searchElement);
		
		System.out.println(String.format(
			"Element %d present at index %d", searchElement, positionIndex));				
	}
	
}
