package _201_220;

import java.util.HashSet;
import java.util.Set;

public class _217_ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
