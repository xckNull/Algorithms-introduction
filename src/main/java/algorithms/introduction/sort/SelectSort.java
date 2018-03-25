package algorithms.introduction.sort;

/**
 * Select Sort
 * @author xckNull
 *
 */
public class SelectSort {

	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) { //遍历查询最小值的index
					index = j;
				}
			}
			if (i != index) { //如果i与index不同，需要交换i与index的值
				swap(arr, i, index);
			}
		}
	}

	public static void swap(int[] arr, int i, int index) {
		int tmp = 0;
		tmp = arr[i];
		arr[i] = arr[index];
		arr[index] = tmp;
	}
	
}
