package oj_121_140;

public class _125_ValidPalindrome {
	public boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        while (i<j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                break;
            } else {
                i++;
                j--;
            }
        }
        if (i>=j) return true;
        else return false;
    }
}
