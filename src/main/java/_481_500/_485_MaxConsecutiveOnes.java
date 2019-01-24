package _481_500;

public class _485_MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        for (int i=0; i<nums.length; i++) {
            if ((nums[i]&1) == 1) {
                temp++;
            } else {
                max = Math.max(max, temp);
                temp = 0;
            }
        }
        max = Math.max(max, temp);
        return max;
    }

}
