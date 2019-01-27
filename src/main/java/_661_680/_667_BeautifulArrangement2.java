package _661_680;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class _667_BeautifulArrangement2 {

    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];

        for (int i=0, l=1, r = n; l<=r; i++) {
            if (k > 1) {
                if ((k & 1) == 1) {
                    ans[i] = l++;
                } else {
                    ans[i] = r--;
                }
                k--;
            } else {
                ans[i] = l++;
            }
        }
        return ans;
    }

    @Test
    public void test() {
        int[] ans = constructArray(3, 1);
        Assertions.assertArrayEquals(ans, new int[]{1, 3, 2});
    }

}
