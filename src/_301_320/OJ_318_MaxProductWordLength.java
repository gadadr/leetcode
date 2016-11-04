package _301_320;

public class OJ_318_MaxProductWordLength {

	public int maxProduct(String[] words) {
        int max = 0;
        for (int i=0; i<words.length; i++) {
            for (int j=i+1; j<words.length; j++) {
                if (words[i].length() * words[j].length() > max) {
                    if (!containsCommon(words[i], words[j])) {
                        max = words[i].length() * words[j].length();
                    }
                }
            }
        }
        return max;
    }
    
    private boolean containsCommon(String s1, String s2) {
        for (char ch : s1.toCharArray()) {
            if (s2.indexOf(ch) > -1) {
                return true;
            }
        }
        return false;
    }
    
}
