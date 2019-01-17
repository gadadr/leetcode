package _481_500;

import java.util.ArrayList;
import java.util.List;

public class _500_KeyboardRow {
    public String[] findWords(String[] words) {
        String l1 = "QWERTYUIOPqwertyuiop";
        String l2 = "ASDFGHJKLasdfghjkl";
        String l3 = "ZXCVBNMzxcvbnm";

        List<String> list = new ArrayList<>();
        for (String word : words) {
            char ch = word.charAt(0);
            String temp;
            if (l1.indexOf(ch) != -1) temp = l1;
            else if (l2.indexOf(ch) != -1) temp = l2;
            else temp = l3;
            boolean found = true;
            for (int i=1; i<word.length(); i++) {
                if (temp.indexOf(word.charAt(i)) == -1) {
                    found = false;
                    break;
                }
            }
            if (found) {
                list.add(word);
            }

        }

        return list.toArray(new String[list.size()]);
    }
}
