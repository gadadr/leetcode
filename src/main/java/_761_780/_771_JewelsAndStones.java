package _761_780;

public class _771_JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        for (char j : J.toCharArray()) {
            S = S.replaceAll(String.valueOf(j), "#");
        }

        int count = 0;
        for (char s : S.toCharArray()) {
            if (s == '#') ++count;
        }
        return count;
    }
}
