package _281_300;

public class _283_MoveZeroes {

    public void moveZeroes(int[] nums) {
        int i=0;
        for (; i<nums.length; i++) {
            if (nums[i] == 0) break;
        }

        for (int j=i+1; j<nums.length; j++) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
            }
        }
        for (; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
    
}
