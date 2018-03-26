package algorithms.introduction.sort;

public class ShellSort {

	public static void shellSort(int[] arr) {
		int delta = arr.length / 2; // 每一步步长为数组长度除以2，也有按其他步长的
		while (delta >= 1) {
			for (int i = 0; i < delta; i++) {// 每组起始位置
				for (int j = i + delta; j < arr.length; j += delta) {// 以下代码是插入排序的代码
					int target = arr[j];
					int k = j;
					while (k > 0 && arr[k - delta] > target) {
						arr[k] = arr[k - delta];
						k -= delta;
					}
					arr[k] = target;
				}
			}
			delta = delta / 2; // 每次除以2，最终到步长为1终止
		}
	}
}
