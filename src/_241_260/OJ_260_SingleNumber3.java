package _241_260;

public class OJ_260_SingleNumber3 {
	public static int[] singleNumber(int[] nums) {
        int x = 0;
        for (int i=0; i<nums.length; i++) {
            x ^= nums[i];
        }
        
        int setBit = x & ~(x-1);
        
        int[] ans = new int[2];
        for (int i=0; i<nums.length; i++) {
            if ((nums[i] & setBit) == 0) {
                ans[0] ^= nums[i];
            } else {
                ans[1] ^= nums[i];
            }
        }
        return ans;
    }
}
