package algorithms.introduction.sort.test;

import java.util.Arrays;

import org.junit.Test;

import algorithms.introduction.sort.QuickSort;

public class QuickSortTest {

	@Test
	public void testQuickSort() {
		int[] arr= {49,38,65,97,76,13,27};
		QuickSort.quickSort(arr,0,arr.length-1);
		System.out.print(Arrays.toString(arr));
	}
}
