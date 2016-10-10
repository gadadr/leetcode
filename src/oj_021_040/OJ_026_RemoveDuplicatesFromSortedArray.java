package oj_021_040;

public class OJ_026_RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		int i=0, j=1;
		while (j <= nums.length) {
			while (j<nums.length && nums[i] == nums[j]) {
				j++;
			} 
			i++;
			if (j<nums.length && i != j) {
				nums[i] = nums[j];
			} else {
				i++;
				j++;
			}
		}
		return i;
	}
}
