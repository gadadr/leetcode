package _001_020;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OJ_013_RomanToInteger {
	
	private static Map<Character, Integer> values;
	
	private static final List<Character> ROMAN = Arrays.asList('I','V','X','L','C','D','M');
	
	public static void main(String[] args) {
		OJ_013_RomanToInteger romanToInteger = new OJ_013_RomanToInteger();
		romanToInteger.romanToInt("MCMXCVI");
	}
	
	public OJ_013_RomanToInteger() {
		values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
	}
	
	public int romanToInt(String s) {
		int ans = 0;
        for (int i=0; i<s.length(); i++) {
        	if (i != s.length()-1 && ROMAN.indexOf(s.charAt(i)) < ROMAN.indexOf(s.charAt(i+1))) {
        		ans += values.get(s.charAt(i+1)) - values.get(s.charAt(i));
        		i++;
        	} else {
        		ans += values.get(s.charAt(i));
        	}
        }
        return ans;
    }
}
