package algorithms.introduction.leetcode;

/**
 * leetcode
 * @author xck
 * 反转整数
 */
public class Reverse {

	/**
	 * 利用StringBuilder的reverse()方法，注意溢出问题
	 * @param x
	 * @return
	 */
	public static int reverse1(int x) {
		int tmp = Math.abs(x);
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(tmp);
        sBuilder = sBuilder.reverse();
        if(Long.parseLong(sBuilder.toString())>Integer.MAX_VALUE) {
        	return 0;
        }
        return x>0?Integer.parseInt(sBuilder.toString()):-Integer.parseInt(sBuilder.toString());
    }
	
	/**
	 * 计算出反转后的数字，注意溢出问题
	 * @param x
	 * @return
	 */
	public static int reverse2(int x) {
		int tmp = Math.abs(x);
		long reverse=0;
		while (tmp>0) {
			reverse=reverse*10 + tmp%10;
			if(reverse>Integer.MAX_VALUE) {
				return 0;
			}
			tmp=tmp/10;
		}
		return (int)(x>0?reverse:-reverse);
	}
	
}
