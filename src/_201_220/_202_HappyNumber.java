package _201_220;

import java.util.HashSet;
import java.util.Set;

public class _202_HappyNumber {
	public boolean isHappy(int n) {
		Set<Integer> prev = new HashSet<>();
		String s = String.valueOf(n);
		while (true) {
			int sum = 0;
			for (int x : s.toCharArray()) {
				x -= 48;
				sum += Math.pow(x, 2);
			}
			if (sum == 1) {
				return true;
			} else if (prev.contains(sum)) {
				return false;
			} else {
				s = String.valueOf(sum);
				prev.add(sum);
			}
		}
	}
}
