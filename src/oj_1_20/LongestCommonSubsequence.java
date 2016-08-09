package oj_1_20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestCommonSubsequence {
	
	private static List<Integer> ans = new ArrayList<>();
	
	public static void main(String[] args) {
		System.out.println("Ans : " + commonSubSequence("AGGTAB", "GXTXAYB"));
	}
	
	private static void commonSubSequence(List<Integer> mapList, int x) {
		if (ans.get(x+1)  == -1) {
			commonSubSequence(mapList, x+1);
		} 
		if (mapList.get(x) != -1) {
			for (int temp=x; temp <mapList.size(); temp ++) {
				if (mapList.get(temp) > mapList.get(x)) {
					ans.add(x, ans.get(temp)+1);
					ans.remove(x+1);
					break;
				}
			}
		}
	}
	
	private static Integer commonSubSequence(String c1, String c2) {
		
		Map<Character, Integer> map = new HashMap<>();
		int i=0;
		for (char ch : c1.toCharArray()) {
			map.put(ch, i++);
		}
		
		List<Integer> mapList = new ArrayList<>();
		for (char ch : c2.toCharArray()) {
			Integer temp = map.get(ch);
			if (temp != null) {
				mapList.add(temp);
			} else {
				mapList.add(-1);
			}
		}
		
		for (int x=0; x<mapList.size()-1; x++) {
			ans.add(-1);
		}
		ans.add(1);
		
		commonSubSequence(mapList, 0);
		
		int max = 0;
		for (Integer temp : ans) {
			max = Math.max(max, temp);
		}
		return max;
	}

}
