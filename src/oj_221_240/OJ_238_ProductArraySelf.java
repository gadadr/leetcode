package oj_221_240;

public class OJ_238_ProductArraySelf {
	
	public static void main(String[] args) {
		OJ_238_ProductArraySelf self = new OJ_238_ProductArraySelf();
		int[] ans = self.productExceptSelf(new int[]{2,4,-2,1,2,-1,4,1,3,-3,-1,2,1,2,1,-3,1,-1,1,3,3,-2,-2,3,-3,-1,1,-2,-4,-2});
		System.out.println();
	}
	
	public int[] productExceptSelf(int[] nums) {
		int[] t1 = new int[nums.length];
		int[] t2 = new int[nums.length];
		
		t1[0] = 1;
		t2[nums.length-1] = 1;
		
		for (int i=0; i<nums.length-1; i++) {
			t1[i+1] = t1[i] * nums[i];
		}
		
		for (int i=nums.length-1; i>0; i--) {
			t2[i-1] = t2[i] * nums[i];
		}
		
		int[] ans = new int[nums.length];
		for (int i=nums.length-1; i>=0; i--) {
			ans[i] = t1[i] * t2[i];
		}
		return ans;
	}
}
