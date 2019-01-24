package _161_180;

public class _169_MajorityElement {

    public int majorityElement(int[] nums) {
        int count = 1;
        int majority = nums[0];

        for (int i=1; i<nums.length; i++) {
            if (nums[i] == majority) {
                count++;
            } else if (count == 1) {
                majority = nums[i];
            } else {
                count--;
            }
        }
        return majority;
    }

}
