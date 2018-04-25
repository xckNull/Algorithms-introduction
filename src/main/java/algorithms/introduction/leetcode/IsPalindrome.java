package algorithms.introduction.leetcode;

/**
 * leetcode
 * 
 * @author xck 回文数
 */
public class IsPalindrome {

	public static boolean isPalindrome1(int x) {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder = sBuilder.append(x).reverse();
		return String.valueOf(x).equals(sBuilder.toString());
	}

	public static boolean isPalindrome2(int x) {
		if (x < 0) {
			return false;
		}
		int result = 0;
		int tmp = x;
		while (tmp > 0) {
			result *= 10;
			result += tmp % 10;
			tmp = tmp / 10;
		}
		return result == x;
	}

}
