package algorithms.introduction.sort.test;

import java.util.Arrays;

import org.junit.Test;

import algorithms.introduction.sort.BucketSort;

public class BucketSortTest {

	@Test
	public void testBucketSort() {
		int[] arr = { 88, 31, 1, 50 };
		BucketSort.bucketSort(arr);
		System.out.print(Arrays.toString(arr));
	}
}
