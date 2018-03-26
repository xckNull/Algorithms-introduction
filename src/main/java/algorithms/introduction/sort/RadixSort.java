package algorithms.introduction.sort;

import java.util.Arrays;

/**
 * Radix Sort
 * @author xckNull
 *
 */
public class RadixSort {

	public static void radixSort(int[] arr, int radix, int d) {
		int[] tmp = new int[arr.length]; // 缓存数组
		int[] buckets = new int[radix]; // buckets用于记录待排序元素的信息,定义了radix个桶
		for (int i = 0, rate = 1; i < d; i++) {
			Arrays.fill(buckets, 0); // 重置count数组，开始统计下一个关键字
			tmp = Arrays.copyOf(arr, arr.length);
			// 以下是计数排序的实现
			for (int j = 0; j < arr.length; j++) {
				int subKey = (tmp[j] / rate) % radix;
				buckets[subKey]++;
			}
			for (int j = 1; j < radix; j++) {
				buckets[j] = buckets[j] + buckets[j - 1];
			}
			for (int m = arr.length - 1; m >= 0; m--) {
				int subKey = (tmp[m] / rate) % radix; // 计算桶的位置
				int position = buckets[subKey];
				arr[position - 1] = tmp[m];
				buckets[subKey] -= 1;
			}
			rate *= radix; // 从低位到高位
		}
	}
}
