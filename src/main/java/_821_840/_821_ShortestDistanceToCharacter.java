package _821_840;

public class _821_ShortestDistanceToCharacter {

    public int[] shortestToChar(String S, char C) {
        int[] distances = new int[S.length()];
        for (int i=0; i< S.length(); i++) {
            int distance = 0;
            boolean found = false;
            while (!found) {
                if (i + distance < S.length()) {
                    if(S.charAt(i + distance) == C) {
                        distances[i] = distance;
                        found = true;
                    }
                }
                if (i - distance >= 0) {
                    if(S.charAt(i - distance) == C) {
                        distances[i] = distance;
                        found = true;
                    }
                }
                distance++;
            }
        }
        return distances;
    }
}
