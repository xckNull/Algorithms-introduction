package algorithms.introduction.sort.test;

import java.util.Arrays;

import org.junit.Test;

import algorithms.introduction.sort.ShellSort;

public class ShellSortTest {
	@Test
	public void testShellSort() {
		int[] arr = { 25, 11, 45, 26, 12, 78 };
		ShellSort.shellSort(arr);
		System.out.print(Arrays.toString(arr));
	}

}
