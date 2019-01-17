package _781_800;

import java.util.Arrays;
import java.util.Comparator;

public class _791_CustomSortString {
    public String customSortString(String S, String T) {
        Character[] chars = T.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        Arrays.sort(chars, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                if (S.indexOf(o1) != -1 && S.indexOf(o2) != -1) {
                    return S.indexOf(o1) - S.indexOf(o2);
                } else {
                    return S.indexOf(o2) - S.indexOf(o1);
                }
            }

        });

        StringBuilder sb = new StringBuilder();
        for(Character ch : chars) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
