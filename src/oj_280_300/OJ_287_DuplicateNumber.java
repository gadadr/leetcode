package oj_280_300;

public class OJ_287_DuplicateNumber {
	public int findDuplicate(int[] nums) {
        if (nums[0] == nums[1]) return nums[0];
        
        int sum1 = ((nums.length-1) *nums.length)/2;
        
        int sum2 = 0;
        for (int i=0; i<nums.length; i++) {
            sum2+=nums[i];
        }
        if (sum2-sum1 != 0) {
            for (int i=0; i<nums.length; i++) {
                for (int j=i+1; j<nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        return nums[i];
                    }
                }
            }
        }
        return 0;
    }
}
