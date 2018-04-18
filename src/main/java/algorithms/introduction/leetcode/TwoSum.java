package algorithms.introduction.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum1(int[] nums, int target) {
		int[] label = new int[2];
		for(int i=0;i<nums.length-1;i++) {
			int tmp = target - nums[i];
			for(int j=i+1;j<nums.length;j++) {
				if(tmp == nums[j]) {
					label[0] = i;
					label[1] = j;
				}
			}
		}
		return label;
	}
	
	public static int[] twoSum2(int[] nums, int target) {
		int[] label = new int[2];
		int[] tmpArr = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			tmpArr[i]=nums[i];
		}
		Arrays.sort(nums);
		int i=0;
		int j=nums.length-1;
		while (i<j) {
			if(nums[i]+nums[j]==target) {
				label[0] = nums[i];
				label[1] = nums[j];
				break;
			}else if(nums[i]+nums[j]>target){
				j--;
			}else {
				i++;
			}
		}
		for(int k=0;k<tmpArr.length;k++) {
			if(tmpArr[k]==label[0]) {
				label[0]=k;
			}
			if(tmpArr[k]==label[1]) {
				label[1]=k;
			}
		}
		return label;
	}
	
	public static int[] twoSum3(int[] nums, int target) {
		int[] label = new int[2];
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			hashMap.put(nums[i], i);
		}
		for(int i=0;i<nums.length;i++) {
			if(hashMap.containsKey(target-nums[i])&&hashMap.get(target-nums[i])!=i) {
				label[0] = i;
				label[1] = hashMap.get(target-nums[i]);
				break;
			}
		}
		return label;
	}
	
	public static void main(String[] args) {
		int[] nums= {3,2,4};
		int target=6;
		int[] label = TwoSum.twoSum2(nums, target);
		System.out.println(Arrays.toString(label));
	}
}
