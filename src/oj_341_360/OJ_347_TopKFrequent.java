package oj_341_360;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class OJ_347_TopKFrequent {
	
	public static void main(String[] args) {
		topKFrequent(new int[]{1,2}, 2);
	}
	
	public static List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> count = new HashMap<>();
		for (int i=0; i<nums.length; i++) {
			if (count.containsKey(nums[i])) {
				count.put(nums[i], count.get(nums[i])+1);
			} else {
				count.put(nums[i], 1);
			}
		}
		
		Set<Map.Entry<Integer, Integer>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				if (o2.getValue()-o1.getValue() != 0) {
					return o2.getValue()-o1.getValue();
				} else {
					return -1;
				}
			}
		});
		set.addAll(count.entrySet());
		
		List<Integer> ans = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : set) {
			if (k > 0) {
				ans.add(entry.getKey());
				k--;
			} else {
				break;
			}
		}
		return ans;
	}
}
