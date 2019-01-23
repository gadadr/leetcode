package _961_980;

import java.util.Arrays;

public class _977_SquaresOfSortedArray {

    public int[] sortedSquares(int[] A) {
        for (int i=0; i<A.length; i++) {
            A[i] = (int) Math.pow(A[i], 2);
        }

        Arrays.sort(A);
        return A;
    }

}
