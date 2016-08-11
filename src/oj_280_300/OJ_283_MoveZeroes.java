package oj_280_300;

public class OJ_283_MoveZeroes {
	public void moveZeroes(int[] nums) {
        for (int i=nums.length-1; i>=0; i--) {
        	if (nums[i] == 0) {
        		int j = i;
        		while (j<nums.length-1 && nums[j] == 0) {
        			nums[j] = nums[j+1];
        			nums[j+1] = 0;
        			j++;
        		}
        	}
        }
    }
}
