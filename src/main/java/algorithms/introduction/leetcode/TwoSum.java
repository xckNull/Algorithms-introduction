package algorithms.introduction.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * leetcode
 * @author xck
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 */
public class TwoSum {

	/**
	 * 直接暴力遍历
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum1(int[] nums, int target) {
		int[] label = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			int tmp = target - nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (tmp == nums[j]) {
					label[0] = i;
					label[1] = j;
				}
			}
		}
		return label;
	}

	/**
	 * 先排序，然后两个指针，分别从头和从尾查询
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum2(int[] nums, int target) {
		int[] label = new int[2];
		int[] tmpArr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			tmpArr[i] = nums[i];
		}
		Arrays.sort(nums);
		int i = 0;
		int j = nums.length - 1;
		while (i < j) {
			if (nums[i] + nums[j] == target) {
				label[0] = nums[i];
				label[1] = nums[j];
				break;
			} else if (nums[i] + nums[j] > target) {
				j--;
			} else {
				i++;
			}
		}
		for (int k = 0; k < tmpArr.length; k++) {
			if (tmpArr[k] == label[0]) {
				label[0] = k;
			}
			if (tmpArr[k] == label[1]) {
				label[1] = k;
			}
		}
		return label;
	}

	/**
	 * 用hashMap存储，之后直接提取查询
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum3(int[] nums, int target) {
		int[] label = new int[2];
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			hashMap.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			if (hashMap.containsKey(target - nums[i]) && hashMap.get(target - nums[i]) != i) {
				label[0] = i;
				label[1] = hashMap.get(target - nums[i]);
				break;
			}
		}
		return label;
	}

}
