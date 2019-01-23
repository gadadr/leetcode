package _961_980;

import java.util.Arrays;

public class _976_LargestPerimeterTriangle {

    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i=A.length-1; i>=2; i--) {
            int x = A[i]+A[i-1]+A[i-2];
            if (x-A[i] > A[i]) {
                return x;
            }
        }
        return 0;
    }

}
