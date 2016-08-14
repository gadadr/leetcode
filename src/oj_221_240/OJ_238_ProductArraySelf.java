package oj_221_240;

public class OJ_238_ProductArraySelf {
	
	public static void main(String[] args) {
		OJ_238_ProductArraySelf self = new OJ_238_ProductArraySelf();
		int[] ans = self.productExceptSelf(new int[]{2,4,-2,1,2,-1,4,1,3,-3,-1,2,1,2,1,-3,1,-1,1,3,3,-2,-2,3,-3,-1,1,-2,-4,-2});
		System.out.println();
	}
	
	public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int prod = 1;
        int zeroes = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                prod *= nums[i];
            } else {
                zeroes++;
                if (zeroes>1) {
                    return ans;
                }
            }
        }
      
        if (zeroes == 1) {
            for (int i=0; i<nums.length; i++) {
                if (nums[i] == 0) {
                    ans[i] = prod;
                    return ans;
                }
            }
        }
        
        for (int i=0; i<nums.length; i++) {
            ans[i] = nums[i] == 1 ? prod : product(prod, nums[i]);
        }
        return ans;
    }
    
    private int product(int div, int sor) {
        int quo = 1;
        int temp = sor;
        boolean keepMultiplying = true;
        while (true) {
            temp = sor*quo;
            if (Math.abs(temp) < Math.abs(div) && keepMultiplying) {
            	quo*=2;
            } else if (Math.abs(temp) < Math.abs(div) && !keepMultiplying) {
            	quo++;
            } else if (Math.abs(temp) > Math.abs(div)) {
            	quo/=2;
            	temp/=2;
            	keepMultiplying = false;
            } else {
            	break;
            }
        }
        if ((div<0 && sor<0) || (div>0 && sor>0)) {
            return quo;
        } else {
            return -quo;
        }
    }
}
