package algorithms.introduction.sort;

public class QuickSort {

	public static void quickSort(int[] arr, int left, int right) {
		if (left < right) {
			int index = partion(arr, left, right); //查找基准分割点
			quickSort(arr, left, index - 1); //左边序列递归排序
			quickSort(arr, index + 1, right); //右边序列递归排序
		}
	}

	public static int partion(int[] arr, int left, int right) {
		int pivot = arr[left]; //第一个作为基准点
		int i = left;
		int j = right;
		while (i < j) {
			while (pivot <= arr[j] && i < j) { //从右边查找小于基准的数据
				j--;
			}
			while (pivot >= arr[i] && i < j) { //从左边查找大于基准的数据
				i++;
			}
			if (i < j) { //左右交换
				swap(arr, i, j);
			}
		}
		arr[left] = arr[i]; //基准划分点
		arr[i] = pivot; 
		return i;
	}

	public static void swap(int[] arr, int left, int right) {
		int tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
	}

}
