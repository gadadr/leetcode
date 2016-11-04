package _341_360;

public class OJ_357_UniqueDigitCount {
	public int countNumbersWithUniqueDigits(int n) {
		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		}
        int ans = 1;
        int mulitplier = 9;
        n = Math.min(n, 10);
        for (int i=1; i<=n; i++) {
        	ans += mulitplier;
        	mulitplier *= 10-i;
        }
        return ans;
    }
}
