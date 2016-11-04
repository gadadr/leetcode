package _341_360;

import java.util.HashSet;
import java.util.Set;

public class OJ_349_IntersectionTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		for (int i=0; i<nums1.length; i++) {
			set.add(nums1[i]);
		}
		Set<Integer> ans = new HashSet<>();
		for (int i=0; i<nums2.length; i++) {
			if (set.contains(nums2[i])) {
				ans.add(nums2[i]);
			}
		}
		
		int[] fin = new int[ans.size()];
		int x=0;
		for (Integer integer : ans) {
			fin[x++] = integer;
		}
		return fin;
	}
}
