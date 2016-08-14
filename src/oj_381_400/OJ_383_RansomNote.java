package oj_381_400;

import java.util.HashMap;
import java.util.Map;

public class OJ_383_RansomNote {
	
	public boolean canConstruct(String ransomNote, String magazine) {
		char[] mag = magazine.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i=0; i<mag.length; i++) {
			if (map.containsKey(mag[i])) {
				map.put(mag[i], map.get(mag[i]) + 1);
			} else {
				map.put(mag[i], 1);
			}
		}
		
		char[] ran = ransomNote.toCharArray();
		for (int i=0; i<ran.length; i++) {
			if (map.containsKey(ran[i]) && map.get(ran[i])>0) {
				map.put(ran[i], map.get(ran[i]) - 1);
			} else {
				return false;
			}
		}
		return true;
	}
}
