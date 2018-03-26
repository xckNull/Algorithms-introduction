package algorithms.introduction.sort.test;

import java.util.Arrays;

import org.junit.Test;

import algorithms.introduction.sort.BinaryInsertSort;

public class BinarySortTest {

	@Test
	public void testBinarySort() {
		int[] arr = {3,5,1,6};
		BinaryInsertSort.binaryInsertSort(arr);
		System.out.print(Arrays.toString(arr));
	}
}
