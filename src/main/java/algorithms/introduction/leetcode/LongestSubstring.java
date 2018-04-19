package algorithms.introduction.leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * leetcode
 * @author xck
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 */
public class LongestSubstring {

	/**
	 * 暴力求解，时间复杂度O(N*N*N)
	 * @param s
	 * @return
	 */
	public static int lengthOfLongestSubstring1(String s) {
        int maxlength = 0;
        int strLength = s.length();
        for(int i=0;i<strLength;i++) {
        	StringBuilder sBuilder = new StringBuilder();
        	sBuilder.append(s.charAt(i));
        	for(int j=i+1;j<strLength;j++) {
        		if(sBuilder.indexOf(""+s.charAt(j))!=-1) {
        			break;
        		}else {
        			sBuilder.append(s.charAt(j));
        		}
        	}
        	maxlength = (maxlength>sBuilder.length())?maxlength:sBuilder.length();
        }
        return maxlength;
    }
	
	/**
	 * 用hashSet保存，查找更快，时间复杂度O(N)
	 * @param s
	 * @return
	 */
	public static int lengthOfLongestSubstring2(String s) {
        int maxlength = 0;
        int strLength = s.length();
        int left=0,right=0;
        HashSet<Character> hashSet = new HashSet<>();
        while (left<strLength&&right<strLength) {
			if(hashSet.contains(s.charAt(right))) {
				hashSet.remove(s.charAt(left));
				left++;
			}else {
				hashSet.add(s.charAt(right));
				right++;
				maxlength = Math.max(maxlength, right - left);
			}
		}
        return maxlength;
    }
	
	/**
	 * 不用每次一个一个的移动去遍历，可以找到第一个重复字符的下一个位置查找，时间复杂度O(N)
	 * @param s
	 * @return
	 */
	public static int lengthOfLongestSubstring3(String s) {
		int maxlength = 0;
		int strLength = s.length();
		HashMap<Character, Integer> hashMap = new HashMap<>();
		int left=0,right=0;
		while (left<strLength&&right<strLength) {
			if(hashMap.containsKey(s.charAt(right))) {
				left = Math.max(hashMap.get(s.charAt(right))+1, left);
			}
			hashMap.put(s.charAt(right), right);
			right++;
			maxlength = Math.max(maxlength, right - left);
		}
		return maxlength;
	}
	
}
