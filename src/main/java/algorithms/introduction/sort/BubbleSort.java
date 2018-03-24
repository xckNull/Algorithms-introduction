package algorithms.introduction.sort;

/**
 * Bubble sort
 * @author xckNull
 *
 */
public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		boolean flag = true;// 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已然完成。
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) { //后面i个数据已经排序好了
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = false;
				}
			}
			if (flag) { //后面不用再排序
				break;
			}
		}
		return arr;
	}
}
