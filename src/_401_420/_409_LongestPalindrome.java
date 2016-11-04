package _401_420;

public class _409_LongestPalindrome {
	public int longestPalindrome(String s) {
		int[] count = new int[256];
		for (char ch : s.toCharArray()) {
			count[ch]++;
		}
		int ans = 0;
		for (int i : count) {
			if (i%2 == 1) {
				ans += (i-1);
			} else {
				ans += i;
			}
		}
		for (int i : count) {
			if (i%2 == 1) {
				ans++;
				break;
			}
		}
		
		return ans;
	}
}
