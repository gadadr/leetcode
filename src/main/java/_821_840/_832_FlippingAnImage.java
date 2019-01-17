package _821_840;

public class _832_FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<Math.ceil((double) A.length/2); j++) {
                int temp = A[i][j];
                A[i][j] = A[i][A[0].length-1-j] == 0 ? 1 : 0;
                A[i][A[0].length-1-j] = temp == 0? 1: 0;
            }
        }
        return A;
    }
}
