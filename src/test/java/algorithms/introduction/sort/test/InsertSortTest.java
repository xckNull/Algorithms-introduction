package algorithms.introduction.sort.test;
import org.junit.Test;

import algorithms.introduction.sort.InsertSort;

public class InsertSortTest {

	private InsertSort insertSort;
	
	@Test
	public void testInsertSort(){
		insertSort = new InsertSort();
		int[] arr = {3,4,1,6,8,2};
		int[] sortArr = insertSort.insertSort(arr);
		for(int i=0;i<sortArr.length;i++) {
			System.out.println(sortArr[i]);
		}
	}
}
