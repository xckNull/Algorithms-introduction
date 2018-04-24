package algorithms.introduction.leetcode.test;

import org.junit.Test;

import algorithms.introduction.leetcode.Convert;

public class ConvertTest {
	
	@Test
	public void testConvert() {
		String s = "PAYPALISHIRING";
		System.out.println(Convert.convert(s,3));
		System.out.println(Convert.convert(s,4));
	}

}
