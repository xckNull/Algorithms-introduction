package algorithms.introduction.sort.test;

import java.util.Arrays;

import org.junit.Test;

import algorithms.introduction.sort.MergeSort;

public class MergeSortTest {

	@Test
	public void testMergeSort() {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		MergeSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
