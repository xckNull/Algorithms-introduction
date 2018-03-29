package algorithms.introduction.sort.test;

import java.util.Arrays;

import org.junit.Test;

import algorithms.introduction.sort.HeapSort;

public class HeapSortTest {

	@Test
	public void testHeapSort() {
		int[] arr = { 49, 38, 65, 97, 76, 13, 27, 49 };
		HeapSort.heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
