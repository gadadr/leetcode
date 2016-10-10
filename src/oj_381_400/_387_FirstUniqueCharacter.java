package oj_381_400;

import java.util.LinkedHashMap;
import java.util.Map;

public class _387_FirstUniqueCharacter {
	public int firstUniqChar(String s) {
        int ans = -1;
        if (s != null) {
            Map<Character,Boolean> map = new LinkedHashMap<>();
            for (int i=0; i<s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), false);
                } else {
                    map.put(s.charAt(i), true);
                }
            }
            for (Map.Entry<Character,Boolean> entry : map.entrySet()) {
                if (entry.getValue() == true) {
                    for (int i=0; i<s.length(); i++) {
                        if (s.charAt(i) == entry.getKey()) {
                            return i;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
