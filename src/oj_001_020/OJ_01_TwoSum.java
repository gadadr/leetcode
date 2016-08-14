package oj_001_020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OJ_01_TwoSum {
	
	public int[] twoSum(final int[] nums, int target) {
	       
        List<Integer> ids = new ArrayList<>();
        for (int i=0;i<nums.length;i++) {
            ids.add(i);
        }
        
        Collections.sort(ids,new Comparator<Integer>() {
            @Override
			public int compare(Integer o1, Integer o2) {
                if (nums[o1] > nums[o2]) {
                    return 1;
                } else if (nums[o1] < nums[o2]) {
                    return -1;
                } else {
                    return 0;
                }              
            }
        });
        
        int i = 0;
        int j = nums.length-1;
        
        while (i<j) {
            if (nums[ids.get(i)] + nums[ids.get(j)] > target) {
                j--;
            } else if (nums[ids.get(i)] + nums[ids.get(j)] < target) {
                i++;
            } else {
                int[] ans = {ids.get(i),ids.get(j)};
                return ans;
            }
        }
        return null;
       
    }
    
}
