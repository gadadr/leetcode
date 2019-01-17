package _801_820;

import java.util.HashSet;
import java.util.Set;

public class _804_UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = new String[] {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder morse = new StringBuilder();
            for (int i=0; i<word.length(); i++) {
                morse.append(morseCode[word.charAt(i)-97]);
            }
            set.add(morse.toString());
        }
        return set.size();
    }
}
