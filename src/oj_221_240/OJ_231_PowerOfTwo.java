package oj_221_240;

public class OJ_231_PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        if ((n & (n-1)) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
