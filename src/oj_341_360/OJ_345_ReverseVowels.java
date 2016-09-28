package oj_341_360;

public class OJ_345_ReverseVowels {
	public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        
        int i=0;
        int j=arr.length-1;
        while (i<j) {
        	if (!isVowel(arr[i])) {
        		i++; 
        		continue;
        	} else if (!isVowel(arr[j])) {
        		j--; 
        		continue;
        	} else {
        		char temp = arr[i];
        		arr[i] = arr[j];
        		arr[j] = temp;
        		i++;
        		j--;
        	}
        }
        return new String(arr);
    }
	
	private boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}
}