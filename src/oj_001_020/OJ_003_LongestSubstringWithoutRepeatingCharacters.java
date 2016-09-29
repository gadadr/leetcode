package oj_001_020;

public class OJ_003_LongestSubstringWithoutRepeatingCharacters {
	
	public int lengthOfLongestSubstring(String s) {
	      
		int i=0,j=0,length=0,max=0;
		
		while (j<s.length()) {
			length++;
			for (int x=i;x<j;x++) {
				if (s.charAt(x) == s.charAt(j)) {
					length = j-x;
					i=x+1;
				}
			}
			max = (max>length) ? max:length;
			j++;
		}
		
        return max;
    }
	
}
