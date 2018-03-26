package algorithms.introduction.sort.test;

import java.util.Arrays;

import org.junit.Test;

import algorithms.introduction.sort.CountSort;

public class CountSortTest {

	@Test
	public void testCountSort() {
		int arr[] = { 7, 6, 8, 6, 2, 3, 7, 8, 1, 0 };
		CountSort.countSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
