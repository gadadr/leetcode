package oj_381_400;

public class _384_ShuffleArray {
	static int i=0;
    private int[] nums;
    public _384_ShuffleArray(int[] nums) {
        this.nums = nums;
    }
    
    public int[] foo() {
        int[] ans = new int[nums.length];
        for (int j=0; j<nums.length; j++) {
            ans[j] = nums[(j+i)%nums.length];
        }
        return ans;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        i=0;
        return this.nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        i++;
        return foo();
    }
}
