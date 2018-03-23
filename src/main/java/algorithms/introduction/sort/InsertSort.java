package algorithms.introduction.sort;

/**
 * insert sort
 * @author xckNull
 *
 */
public class InsertSort {

	public int[] insertSort(int[] arr) {
		for(int i=1; i<arr.length; i++) { //默认arr[0]已经排好序
			int target = arr[i]; //等待要排序的数据
			int j = i;
			while (j > 0 && arr[j-1] > target) { //循环遍历arr[0,1...,j-1]与target大小，数组右移
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = target; //插入位置
		}
		return arr;
	}
	
}
