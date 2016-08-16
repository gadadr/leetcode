package oj_261_280;

public class OJ_268_MissingNumber {
	public int missingNumber(int[] nums) {
        int sum = nums.length*(nums.length+1)/2;
        for (int i=0; i<nums.length; i++) {
            sum -= nums[i];
        }
        return sum;
    }
}
