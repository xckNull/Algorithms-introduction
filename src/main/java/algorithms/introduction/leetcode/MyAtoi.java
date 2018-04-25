package algorithms.introduction.leetcode;

/**
 * leetcode
 * 
 * @author xck 字符串转整数
 */
public class MyAtoi {

	public static int myAtoi(String str) {
		str = str.trim();
		int length = str.length();
		long result = 0;
		boolean ispos = true;
		for (int i = 0; i < length; i++) {
			if (i == 0 && (str.charAt(i) == '-' || str.charAt(i) == '+')) {
				ispos = str.charAt(i) == '-' ? false : ispos;
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				if (ispos) {
					if (result > Integer.MAX_VALUE) {
						return Integer.MAX_VALUE;
					}
				} else {
					if (-result < Integer.MIN_VALUE) {
						return Integer.MIN_VALUE;
					}
				}
				result *= 10;
				result += Integer.parseInt(str.charAt(i) + "");
			} else {
				break;
			}
		}
		if (ispos) {
			if (result > Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
		} else {
			if (-result < Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
		}

		return ispos ? (int) result : (int) -result;
	}

}
