package _441_460;

import java.util.ArrayList;
import java.util.List;

public class _442_FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            if (nums[(nums[i]-1)%nums.length] > nums.length) {
                duplicates.add((nums[i]-1)%nums.length+1);
            } else {
                nums[(nums[i]-1)%nums.length] += nums.length;
            }
        }
        return duplicates;
    }
}
