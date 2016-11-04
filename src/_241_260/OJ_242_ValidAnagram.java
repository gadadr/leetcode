package _241_260;

import java.util.ArrayList;
import java.util.List;

public class OJ_242_ValidAnagram {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		List<Character> chars = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			chars.add(s.charAt(i));
		}
		
		for (int i = 0; i < t.length(); i++) {
			if (chars.contains((Character)t.charAt(i))) {
				chars.remove((Character)t.charAt(i));
			} else {
				return false;
			}
		}
		return true;
	}
}
