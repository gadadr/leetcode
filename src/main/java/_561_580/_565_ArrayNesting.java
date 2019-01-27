package _561_580;

public class _565_ArrayNesting {

    public int arrayNesting(int[] nums) {
        int ans = 0;
        boolean[] tracker = new boolean[nums.length];
        for (int i=0; i<nums.length; i++) {
            int j = i, count = 0;
            while(!tracker[nums[j]]) {
                tracker[nums[j]] = true;
                j = nums[j];
                count++;
            }

            ans = Math.max(ans, count);
            if (ans > nums.length/2) break;
        }
        return ans;
    }

}
