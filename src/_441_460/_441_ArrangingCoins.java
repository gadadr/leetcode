package _441_460;

public class _441_ArrangingCoins {
	public int arrangeCoins(int n) {
        int i = 1;
        for (; n-i >= 0; i++) {
            n-=i;
        }
        return i-1;
    }
}
