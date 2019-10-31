package _201_220;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class _216_CombinationSum3 {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), k, n, 0);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> ints, int k, int n, int i) {
        if (ints.stream().reduce(0, (a, b) -> a+b) == n && ints.size() == k) {
            ans.add(new ArrayList<>(ints));
        }
        if (i > n || ints.size() > k) {
            return;
        }

        for (; i<10; i++) {
            ints.add(i);
            backtrack(ans, ints, k, n, i+1);
        }
    }

    @Test
    public void test() {
        combinationSum3(3, 7);
    }

}
