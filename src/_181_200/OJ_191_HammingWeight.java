package _181_200;

public class OJ_191_HammingWeight {
	public int hammingWeight(int n) {
        int count = 0;
        for (int i=1; i<33; i++) {
            if ((n & (1 << i)) != 0) {
                count++;
            }
        }
        return count;
    }
}
