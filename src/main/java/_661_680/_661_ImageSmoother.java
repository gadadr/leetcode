package _661_680;

import org.junit.jupiter.api.Test;

public class _661_ImageSmoother {

    public int[][] imageSmoother(int[][] M) {
        int[][] ans = new int[M.length][M[0].length];

        for (int i=0; i<M.length; i++) {
            for (int j=0; j<M[0].length; j++) {
                int count = 1;
                ans[i][j] = M[i][j];
                if (i > 0 && j > 0) {
                    ans[i][j] += M[i-1][j-1];
                    count++;
                }
                if (i > 0) {
                    ans[i][j] += M[i-1][j];
                    count++;
                }
                if (j > 0) {
                    ans[i][j] += M[i][j-1];
                    count++;
                }
                if (i < M.length-1 && j < M[0].length-1) {
                    ans[i][j] += M[i+1][j+1];
                    count++;
                }
                if (i < M.length-1) {
                    ans[i][j] += M[i+1][j];
                    count++;
                }
                if (j < M[0].length-1) {
                    ans[i][j] += M[i][j+1];
                    count++;
                }
                if (i > 0 && j < M[0].length-1) {
                    ans[i][j] += M[i-1][j+1];
                    count++;
                }
                if (i < M.length-1 && j > 0) {
                    ans[i][j] += M[i+1][j-1];
                    count++;
                }
                ans[i][j] /= count;
            }
        }
        return ans;
    }

    @Test
    public void test() {
        imageSmoother(new int[][]{{1,1,1}, {1,0,1}, {1,1,1}});
    }

}
