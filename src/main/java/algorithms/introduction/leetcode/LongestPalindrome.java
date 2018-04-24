package algorithms.introduction.leetcode;

/**
 * leetCode
 * @author xck
 * 最长回文子串
 */
public class LongestPalindrome {

	private static int max = 0;
	private static String res = "";

	public static String longestPalindrome1(String s) {
		for (int size = s.length(); size > 0; size--) {
			for (int low = 0, high = low + size - 1; high < s.length(); low++, high++) {
				if (shrinkCheckPalindrome(s, low, high)) {
					return s.substring(low, high + 1);
				}
			}
		}
		return s.substring(0, 1);
	}

	public static boolean shrinkCheckPalindrome(String s, int low, int high) {
		while (low <= high) {
			if (s.charAt(low) == s.charAt(high)) {
				low++;
				high--;
			} else {
				return false;
			}
		}
		return true;
	}

	public static String longestPalindrome2(String s) {

		if (s.length() == 1) {
			return s;
		}
		for (int i = 0; i < s.length() - 1; i++) {
			checkPalindrome(s, i, i);
			checkPalindrome(s, i, i + 1);
		}
		return res;
	}

	public static void checkPalindrome(String s, int low, int high) {
		while (low >= 0 && high < s.length()) {
			if (s.charAt(low) == s.charAt(high)) {
				if (high - low + 1 > max) {
					max = high - low + 1;
					res = s.substring(low, high + 1);
				}
				low--;
				high++;
			} else {
				return;
			}
		}
	}

	public static String longestPalindrome3(String s) {
		int len = s.length();
		if (s == null || len == 0) {
			return s;
		}
		String res = "";
		int max = 0;
		// 创建一个行列均为字符串长度的二维数组，创建时默认初始化为false
		boolean[][] dp = new boolean[len][len];
		for (int j = 0; j < len; j++) {
			for (int i = 0; i <= j; i++) {
				// 这里只考虑了i<=j的情况，因为i>j时均为false
				// 当i==j,j-i==1,j-i==2时，只要满足s.charAt(i) == s.charAt(j)就是回文字符串
				// 如果不是这样，还要判断当前回文字符串的子串是不是回文字符串，即dp[i + 1][j - 1])，这就是动
				// 态规划思想
				dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1]);
				if (dp[i][j]) {// 如果是回文字符串
					if (j - i + 1 > max) {// 并且比之前的回文字符串要长，更新字符串长度，记录字符串
						max = j - i + 1;
						res = s.substring(i, j + 1);
					}
				}
			}
		}
		return res;
	}

	public static String longestPalindrome4(String s) {
		// -----------------------------------
		// 转换字符串
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("#");
		for (int i = 0; i < s.length(); i++) {
			stringBuilder.append(s.charAt(i));
			stringBuilder.append("#");
		}
		// -----------------------------------
		int rightIndex = 0;
		int centerIndex = 0;
		// 求len中的最大
		int answer = 0;
		// answer最大时的中心
		int index = 0;
		int len[] = new int[stringBuilder.length()];
		for (int i = 1; i < stringBuilder.length(); i++) {
			// 当rightIndex > i，那么我们就在rightIndex - i 与len[2 * centerIndex - i](len[j])，取得最小值
			// 因为当i + len[j] < rightIndex时，我们就把len[i]更新为len[j]
			// 但是如果i + len[j] >= rightIndex时，我们暂且将len[i]定更新为rightIndex - i,超出的部分需要我们一个一个的匹配
			if (rightIndex > i) {
				len[i] = Math.min(rightIndex - i, len[2 * centerIndex - i]);
			} else {
				len[i] = 1;
			}
			// 一个一个匹配
			// 要么是超出的部分，要么是i > rightIndex
			while (i - len[i] >= 0 && i + len[i] < stringBuilder.length()
					&& stringBuilder.charAt(i - len[i]) == stringBuilder.charAt(i + len[i])) {
				len[i]++;
			}
			// 当 len[i] + i > rightIndex,我们需要更新centerIndex和rightIndex
			// 至于为什么会这样做，理解一下rightIndex和centerIndex的含义
			if (len[i] + i > rightIndex) {
				rightIndex = len[i] + i;
				centerIndex = i;
			}
			if (len[i] > answer) {
				answer = len[i];
				index = i;
			}
		}
		// 截取字符串
		// 为什么index - answer + 1,因为len[i] - 1才是原来的回文字符串长度，而answer记录的是len中最大值
		return stringBuilder.substring(index - answer + 1, index + answer).replace("#", "");

	}

}
