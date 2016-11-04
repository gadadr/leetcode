package _181_200;

public class OJ_198_HouseRobber {
	public int rob(int[] nums) {
        int ans = 0;
        switch (nums.length) {
        case 0 : break;
		case 1: ans = nums[0];
			break;
		case 2: ans = Math.max(nums[0], nums[1]);
			break;
		default:
			int[] arr = new int[nums.length];
			arr[0] = nums[0];
			arr[1] = Math.max(nums[0], nums[1]);
			for (int i=2; i<nums.length; i++) {
	        	if (arr[i-1] == arr[i-2]) {
	        		arr[i] = arr[i-1] + nums[i];
	        	} else {
	        		arr[i] = Math.max(arr[i-1], arr[i-2] + nums[i]);
	        	}
	        }
			ans = arr[arr.length-1];
			break;
		}
        return ans;
    }
}
