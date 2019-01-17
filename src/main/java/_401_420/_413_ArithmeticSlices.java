package _401_420;

public class _413_ArithmeticSlices {
    public static int numberOfArithmeticSlices(int[] A) {
        if (A.length < 3) {
            return 0;
        }

        int diff = 0;
        int count = 0;
        int slices = 0;
        for (int i=0; i<A.length-2; i++) {
            for (int j=i; j<A.length-1; j++) {
                if (i == j) {
                    diff = A[j+1] - A[j];
                    count = 1;
                } else {
                    if (A[j+1] - A[j] == diff) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
            slices += Math.max(0, count-1);
        }
        return slices;
    }
}
