package _881_900;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _890_FindAndReplacePattern {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            if (word.length() != pattern.length()) {
                continue;
            }

            Map<Character, Character> map = new HashMap<>();

            boolean b = true;
            for (int i=0; i<word.length(); i++) {
                if (map.get(word.charAt(i)) == null && !map.containsValue(pattern.charAt(i))) {
                    map.put(word.charAt(i), pattern.charAt(i));
                } else if (map.get(word.charAt(i)) == null || map.get(word.charAt(i)) != pattern.charAt(i)) {
                    b = false;
                    break;
                }
            }
            if (b) {
                ans.add(word);
            }
        }
        return ans;
    }

}
