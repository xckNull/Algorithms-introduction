package algorithms.introduction.leetcode.test;

import org.junit.Test;

import algorithms.introduction.leetcode.FindMedianSortedArrays;

public class FindMedianSortedArraysTest {
	@Test
	public void testFindMedianSortedArrays() {
		int[] nums1 = { 1, 3, 3 };
		int[] nums2 = {};
		System.out.println(FindMedianSortedArrays.findMedianSortedArrays2(nums1, nums2));
	}

}
