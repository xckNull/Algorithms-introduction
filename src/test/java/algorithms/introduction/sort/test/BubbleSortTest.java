package algorithms.introduction.sort.test;

import org.junit.Test;

import algorithms.introduction.sort.BubbleSort;

public class BubbleSortTest {

	@Test
	public void testBubbleSort() {
		int[] arr = { 6, 3, 8, 2, 9, 1 };
		int[] sortArr = BubbleSort.bubbleSort(arr);
		for (int i = 0; i < sortArr.length; i++) {
			System.out.print(sortArr[i]);
		}
	}
}
