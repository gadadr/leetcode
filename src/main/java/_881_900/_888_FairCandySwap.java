package _881_900;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _888_FairCandySwap {

    public int[] fairCandySwap(int[] A, int[] B) {
        int sumDiff = Arrays.stream(B).sum() - Arrays.stream(A).sum();
        Set<Integer> setB = new HashSet();
        Arrays.stream(B).forEach(setB::add);

        for (int i=0; i<A.length; i++) {
            int diff = (sumDiff + A[i] + A[i])/2;
            if (setB.contains(diff)) {
                return new int[]{A[i], diff};
            }
        }
        return new int[0];
    }

    @Test
    public void testFairCandySwap() {
        int[] ans = fairCandySwap(new int[]{1, 1}, new int[]{2,2});
        Assertions.assertArrayEquals(new int[]{1, 2}, ans);
    }

}
