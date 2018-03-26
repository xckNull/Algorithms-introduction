package algorithms.introduction.sort;

import java.util.Arrays;

/**
 * Count Sort
 * @author xckNull
 *
 */
public class CountSort {
	
	public static void countSort(int[] array) {
		int max = getMax(array); // 获取数组的最大值，数组所有值都在0 - max之间
		int[] countArray = new int[max + 1]; // 创建一个max+1大小的数组用于表示从0 - max所有数字的重复次数
		int[] resultArray = new int[array.length];
		resultArray = Arrays.copyOf(array, array.length);// 用于存储排好序的数组
		for (int i = 0; i < array.length; i++) { // 循环array数组
			countArray[array[i]] += 1; // 因为countArray的下标代表array中的数字，而值代表array中元素的出现次数，所以countArray[array[i]]++
		}
		for (int i = 1; i < countArray.length; i++) {
			countArray[i] += countArray[i - 1]; // 将countArray中的每一个元素变成与前一个元素相加的和
		}
		for (int i = 0; i < resultArray.length; i++) {
			int position = countArray[resultArray[i]]; //找出要排序的位置
			array[position-1] = resultArray[i]; //位置减一
			countArray[resultArray[i]] -= 1; // 统计数要减一
		}
	}

	private static int getMax(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				throw new RuntimeException("数组中有数小于0");
			}
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
}
