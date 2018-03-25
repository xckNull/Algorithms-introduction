package algorithms.introduction.sort.test;

import java.util.Arrays;

import org.junit.Test;

import algorithms.introduction.sort.SelectSort;

public class SelectSortTest {

	@Test
	public void testSelectSort() {
		int[] arr = { 8, 3, 2, 1, 7, 4, 6, 5 };
		SelectSort.selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
