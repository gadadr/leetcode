package _861_880;

public class _861_ScoreAfterFlippingMatrix {

    public int matrixScore(int[][] A) {
        for (int i=0; i<A.length; i++) {
            if (A[i][0] == 0) {
                flip(A, i, 0);
            }
        }
        for (int i=1; i<A[0].length; i++) {
            if (zeroCount(A, i) > A.length/2) {
                flip(A, i, 1);
            }
        }

        return sum(A);
    }

    private void flip(int[][] A, int x, int direction) {
        if (direction == 0) {
            for (int i=0; i<A[x].length; i++) {
                A[x][i] ^= 1;
            }
        } else {
            for (int i=0; i<A.length; i++) {
                A[i][x] ^= 1;
            }
        }
    }

    private int zeroCount(int[][] A, int x) {
        int count = 0;
        for (int i=0; i<A.length; i++) {
            if (A[i][x]  == 0) {
                count++;
            }
        }
        return count;
    }

    private int sum(int[][] A) {
        int sum = 0;
        for (int i=0; i<A.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=0; j<A[i].length; j++) {
                sb.append(A[i][j]);
            }
            sum += Integer.parseInt(sb.toString(), 2);
        }
        return sum;
    }

}
