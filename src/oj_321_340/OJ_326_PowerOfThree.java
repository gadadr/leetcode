package oj_321_340;

public class OJ_326_PowerOfThree {
	public boolean isPowerOfThree(int n) {
        if (n > 0 && 1162261467 % n == 0) {
            return true;
        } else {
            return false;
        }
    }
}
