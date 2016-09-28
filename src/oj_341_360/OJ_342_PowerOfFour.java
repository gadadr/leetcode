package oj_341_360;

public class OJ_342_PowerOfFour {
	public static boolean isPowerOfFour(int num) {
		if (num <= 0 || (num & (num-1)) != 0) {
			return false;
		}
		int i = 0;
		for (; i<33; i++) {
			int x = 1 << i;
			if ((num ^ x) == 0) {
				break;
			}
		}
		if (i%2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		isPowerOfFour(16);
	}
}
