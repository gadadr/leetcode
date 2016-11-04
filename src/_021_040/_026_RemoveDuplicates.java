package _021_040;

public class _026_RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		int i=0;
		for (int j=1; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			} 
		}
		return nums.length == 0 ? i : i+1;
    }
}
