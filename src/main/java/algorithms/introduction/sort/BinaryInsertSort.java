package algorithms.introduction.sort;

/**
 * BinaryInsert Sort
 * @author xckNull
 *
 */
public class BinaryInsertSort {
	
	public static void binaryInsertSort(int[] str) {
		for (int i = 1; i < str.length; i++) {
			if (str[i] < str[i - 1]) {
				int temp = str[i]; // 定义temp存储所要插入的数
				int left = 0; // 最左边的数，从str[0]开始
				int right = i - 1; // 最右边位，所要插入那个数的前一位
				while (left <= right) {
					int mid = (left + right) / 2; // mid中间位
					if (str[mid] < temp) { // 中间位与str[i]比较
						left = left + 1;
					} else { // 通过if语句找到应该插入的位置str[left]
						right = right - 1;
					}
				}
				for (int j = i; j > left; j--) { // 将str[left]->str[i-1]的数都往后移一位
					str[j] = str[j - 1];
				}
				str[left] = temp; // 最后将str[i]插入str[left]
			}
		}
	}
}
