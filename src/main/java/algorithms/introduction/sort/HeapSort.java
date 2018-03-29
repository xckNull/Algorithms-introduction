package algorithms.introduction.sort;

/**
 * Heap Sort
 * @author xckNull
 *
 */
public class HeapSort {

	public static void heapSort(int[] arr) {
		int l = arr.length;
		for (int i = 0; i < l - 1; i++) {// 循环调用建立堆函数建立堆
			buildHeap(arr, l - 1 - i);// 调用建立堆函数
			swap(arr, 0, l - 1 - i);// 堆建立好后，交换根节点和堆的最后一个节点，每一次堆构建都会选出最大值
		}
	}

	public static void buildHeap(int[] a, int lastIndex) {
		for (int j = (lastIndex - 1) / 2; j >= 0; j--) {// 从lastIndex节点（最后一个节点）的父节点开始循环
			int k = j;// k保存正在判断的节点
			// 如果当前k节点的子节点存在，一个堆调整之后有可能影响其他堆，所以还有遍历子节点的堆
			while (2 * k + 1 <= lastIndex) {
				int biggerIndex = 2 * k + 1;// k节点的左子节点索引
				if (biggerIndex < lastIndex) {// 表示k节点存在右节点
					if (a[biggerIndex] < a[biggerIndex + 1]) {// 与右节点比较
						biggerIndex++;// biggerIndex总是记录较大子节点的索引
					}
				}
				if (a[k] < a[biggerIndex]) {// 如果k节点的值小于较大子节点的值，则交换它们的值，并将biggerIndex赋值给k，开始下一次循环
					swap(a, k, biggerIndex);// 保证k节点的值大于其子节点的值
					k = biggerIndex; // 关键赋值，进行下一次的遍历比较
				} else {
					break;
				}
			}
		}

	}

	public static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
