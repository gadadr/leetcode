package _821_840;

import org.junit.jupiter.api.Test;

public class _835_ImageOverlap {

    public int largestOverlap(int[][] A, int[][] B) {
        int[] A1D = new int[A.length*A.length];
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A[0].length; j++) {
                A1D[i*A.length+j] = A[i][j];
            }
        }

        int[] B1D = new int[B.length*B.length];
        for (int i=0; i<B.length; i++) {
            for (int j=0; j<B[0].length; j++) {
                B1D[i*B.length+j] = B[i][j];
            }
        }

        int ans = 0;
        for (int i=0; i<A1D.length; i++) {
            int count = 0;
            for (int j=0; j<=i; j++) {
                int x = A1D[A1D.length-i+j-1];
                if (x == 1 && x == B1D[j]) {
                    count++;
                }
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }

    @Test
    public void test() {
        int[][] A = new int[][]{{1,1,0},{0,1,0},{0,1,0}};
        int[][] B = new int[][]{{0,0,0},{0,1,1},{0,0,1}};

        int ans = largestOverlap(A, B);
    }

}
