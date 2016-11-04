package _021_040;

public class _027_RemoveElement {
	public int removeElement(int[] nums, int val) {
		int j = nums.length;
		for (int i=0 ; i<j; i++) {
			if (nums[i] == val) {
				while (nums[j-1] == val) {
				    j--;
					if (i==j) {
						return j;
					}
				}
    			nums[i] = nums[j-1];
    			j--;
			}
		}
		return j;
	}
}
