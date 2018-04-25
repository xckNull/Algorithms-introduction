package algorithms.introduction.leetcode.test;

import org.junit.Test;

import algorithms.introduction.leetcode.MyAtoi;

public class MyAtoiTest {
	@Test
	public void testMyAtoi(){
		String str = "2147483648";
		System.out.println(MyAtoi.myAtoi(str));
	}

}
