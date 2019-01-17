package _681_700;

import java.util.ArrayList;
import java.util.List;

public class _682_BaseballGame {

    public int calPoints(String[] ops) {
        List<Integer> scores = new ArrayList<>();
        for (int i=0; i<ops.length; i++) {
            if (Character.isDigit(ops[i].charAt(ops[i].length()-1))) {
                scores.add(Integer.valueOf(ops[i]));
            } else if (Character.isAlphabetic(ops[i].charAt(0)) && "C".equals(ops[i])) {
                scores.remove(scores.size()-1);
            } else if (Character.isAlphabetic(ops[i].charAt(0)) && "D".equals(ops[i])) {
                scores.add(scores.get(scores.size()-1)*2);
            } else {
                scores.add(scores.get(scores.size()-1) + scores.get(scores.size()-2));
            }
        }
        return scores.stream().mapToInt(Integer::intValue).sum();
    }
}
