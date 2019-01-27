package _961_980;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class _969_PancakeSorting {

    public List<Integer> pancakeSort(int[] A) {
        int n = A.length;
        List<Integer> ans = new ArrayList<>();

        while (n>0) {
            int maxIndex = findMaxIntIndex(A, n);
            if (maxIndex == n-1) {
                n--;
            } else {
                if (maxIndex == 0) {
                    flip(A, n-1);
                    ans.add(n);
                } else {
                    flip(A, maxIndex);
                    ans.add(maxIndex+1);
                }
            }
        }
        return ans;
    }

    private int findMaxIntIndex(int[] A, int n) {
        int max = 0;
        for (int i=1; i<n; i++) {
            if (A[i] > A[max]) max = i;
        }
        return max;
    }

    private void flip(int[] A, int n) {
        for (int i=0; i<n; i++, n--) {
            int temp = A[i];
            A[i] = A[n];
            A[n] = temp;
        }
    }

    @Test
    public void test() {
        List<Integer> ans = pancakeSort(new int[]{3,2,4,1});
    }

}
