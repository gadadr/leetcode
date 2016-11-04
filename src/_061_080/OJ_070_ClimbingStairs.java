package _061_080;

import java.util.ArrayList;
import java.util.List;

public class OJ_070_ClimbingStairs {
	List<Integer> list = new ArrayList<>();

	public OJ_070_ClimbingStairs() {
        list.add(1);
        list.add(1);
    }

	public int climbStairs(int n) {
		for (int i = 2; i <= n; i++) {
			list.add(list.get(i - 1) + list.get(i - 2));
		}
		return list.get(n);
	}
}
