package _441_460;

public class _461_HammingDistance {

    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int distance = 0;
        while (z > 0) {
            if (z % 2 == 1) {
                distance++;
            }
            z = z >>> 1;
        }
        return distance;
    }
}
