package _321_340;

public class _338_CountingBits {
    public int[] countBits(int num) {
        int[] bits = new int[num+1];
        int power = 0;
        for(int i=1; i<=num; i++) {
            if (Math.pow(2, power) != i) {
                bits[i] = bits[i - (int) Math.pow(2, power-1)] + 1;
            } else {
                bits[i] = 1;
                power++;
            }
        }
        return bits;
    }
}
