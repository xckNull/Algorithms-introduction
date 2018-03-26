package algorithms.introduction.sort.test;

import java.util.Arrays;

import org.junit.Test;

import algorithms.introduction.sort.RadixSort;

public class RadixSortTest {

	@Test
	public void testRadixSort() {
		int[] arr = new int[] { 1100, 192, 221, 12, 23 };
		RadixSort.radixSort(arr, 10, 4);
		System.out.print(Arrays.toString(arr));
	}
}
