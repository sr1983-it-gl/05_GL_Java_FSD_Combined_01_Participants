package common;

import v_correct.BinarySearch;
import v_incorrect.BinarySearchIncorrect1;
import v_incorrect.BinarySearchIncorrect2;

public class BinarySearchTest {

	public static void main(String[] args) {
		
//		scenario1();

//		scenarioError1();
		scenarioError2();
	}
	
	private static void scenario1() {
		
		
		int array[] = { 9, 18, 24, 27, 35, 38, 46, 56 };
		DataStructureUtils.print(array);

		BinarySearch search = new BinarySearch(array);
		
		int searchElement = 100;
		int searchElementIndex = search.search(searchElement);
		
		System.out.println(String.format(
			"Element %d is present at index %d", searchElement, searchElementIndex));				
	}


	private static void scenarioError1() {
		
		
		int array[] = { 9, 18, 24, 27, 35, 38, 46, 56 };
		DataStructureUtils.print(array);

		BinarySearchIncorrect1 search = new BinarySearchIncorrect1(array);
		
		int searchElement = 38;
		int searchElementIndex = search.search(searchElement);
		
		System.out.println(String.format(
			"Element %d is at present index %d", searchElement, searchElementIndex));				
	}	
	
	private static void scenarioError2() {
		
		
		int array[] = { 9, 18, 24, 27, 35, 38, 46, 56 };
		DataStructureUtils.print(array);

		BinarySearchIncorrect2 search = new BinarySearchIncorrect2(array);
		
		// 24 -> Results are incorrect
		// 18, 27, 38, 46, 35, 56, 9, 24 -> Results are correct
		int searchElement = 56;
		int searchElementIndex = search.search(searchElement);
		
		System.out.println(String.format(
			"Element %d is at present index %d", searchElement, searchElementIndex));				
	}		
}
