package oj_161_180;

public class OJ_169_MajorityElement {
	public int majorityElement(int[] nums) {
        int maj = nums[0];
        int count = 1;
        for (int i=1; i<nums.length; i++) {
            if (maj == nums[i]) {
                count++;
            } else {
                if (count>1) {
                    count--;
                } else {
                    maj=nums[i];
                }
            }
        }
        return maj;
    }
}
