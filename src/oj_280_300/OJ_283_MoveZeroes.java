package oj_280_300;

public class OJ_283_MoveZeroes {
	public void moveZeroes(int[] nums) {
		int lastZero = nums.length-1;
        for (int i=nums.length-1; i>=0; i--) {
        	if (nums[i] == 0 && i < lastZero) {
        		for (int j=i; j<lastZero; j++) {
        		    nums[j] = nums[j+1];
        		}
        		nums[lastZero] = 0;
        		lastZero--;
        	}
        }
    }
}
