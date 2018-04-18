package algorithms.introduction.sort.test;

import java.util.Arrays;

import org.junit.Test;

import algorithms.introduction.leetcode.TwoSum;

public class TwoSumTest {

	@Test
	public void testTwoSum() {
		int[] nums = { 3, 2, 4 };
		int target = 6;
		int[] label = TwoSum.twoSum2(nums, target);
		System.out.println(Arrays.toString(label));
	}
}
