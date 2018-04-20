package algorithms.introduction.leetcode;

/**
 * leetcode
 * @author xck
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。
 * 请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。
 */
public class FindMedianSortedArrays {

	/**
	 * 归并排序
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {
		double result = 0.0;
		int index1 = 0;
		int index2 = 0;
		int index = 0;
		int[] nums = new int[nums1.length + nums2.length];
		if (nums1.length == 0 && nums2.length == 0) {
			return result;
		}
		if (nums1.length == 0) {
			return getResult(nums2);
		}
		if (nums2.length == 0) {
			return getResult(nums1);
		}
		while (index1 < nums1.length && index2 < nums2.length) {
			if (nums1[index1] < nums2[index2]) {
				nums[index] = nums1[index1];
				index1++;
			} else {
				nums[index] = nums2[index2];
				index2++;
			}
			index++;
		}
		while (index1 < nums1.length) {
			nums[index++] = nums1[index1++];
		}
		while (index2 < nums2.length) {
			nums[index++] = nums2[index2++];
		}
		if (nums.length % 2 == 0) {
			result = (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0;
		} else {
			result = nums[(nums.length) / 2];
		}
		return result;
	}

	public static double getResult(int[] nums2) {
		double result = 0.0;
		if (nums2.length % 2 == 0) {
			result = (nums2[nums2.length / 2] + nums2[nums2.length / 2 - 1]) / 2.0;
		} else {
			result = nums2[(nums2.length) / 2];
		}
		return result;
	}

	/**
	 * 二分查找
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
		int m = nums1.length, n = nums2.length;
		int k = (m + n) / 2;
		if ((m + n) % 2 == 0) {
			return (findKth(nums1, nums2, 0, 0, m, n, k) + findKth(nums1, nums2, 0, 0, m, n, k + 1)) / 2;
		} else {
			return findKth(nums1, nums2, 0, 0, m, n, k + 1);
		}

	}

	private static double findKth(int[] arr1, int[] arr2, int start1, int start2, int len1, int len2, int k) {
		// 保证arr1是较短的数组
		if (len1 > len2) {
			return findKth(arr2, arr1, start2, start1, len2, len1, k);
		}
		if (len1 == 0) {
			return arr2[start2 + k - 1];
		}
		if (k == 1) {
			return Math.min(arr1[start1], arr2[start2]);
		}
		int p1 = Math.min(k / 2, len1);
		int p2 = k - p1;
		if (arr1[start1 + p1 - 1] < arr2[start2 + p2 - 1]) {
			return findKth(arr1, arr2, start1 + p1, start2, len1 - p1, len2, k - p1);
		} else if (arr1[start1 + p1 - 1] > arr2[start2 + p2 - 1]) {
			return findKth(arr1, arr2, start1, start2 + p2, len1, len2 - p2, k - p2);
		} else {
			return arr1[start1 + p1 - 1];
		}
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 3, 3 };
		int[] nums2 = {};
		System.out.println(findMedianSortedArrays2(nums1, nums2));
	}
}
