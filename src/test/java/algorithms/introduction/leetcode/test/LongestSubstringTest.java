package algorithms.introduction.leetcode.test;

import org.junit.Test;

import algorithms.introduction.leetcode.LongestSubstring;

public class LongestSubstringTest {

	@Test
	public static void testLongestSubstring() {
		String s = "accbd";
		System.out.println(LongestSubstring.lengthOfLongestSubstring1(s));
		System.out.println(LongestSubstring.lengthOfLongestSubstring2(s));
		System.out.println(LongestSubstring.lengthOfLongestSubstring3(s));
	}
}
