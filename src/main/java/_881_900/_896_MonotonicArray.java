package _881_900;

public class _896_MonotonicArray {

    public boolean isMonotonic(int[] A) {
        if (A.length == 1) {
            return true;
        }
        int i=1;
        while(i<A.length) {
            if (A[i] != A[i-1]) break;
            else i++;
        }

        if (i<A.length) {
            if (A[i] >= A[i - 1]) {
                for (; i<A.length; i++) {
                    if (A[i]< A[i-1]) return false;
                }
            } else {
                for (; i < A.length; i++) {
                    if (A[i] > A[i - 1])
                        return false;
                }
            }
        }
        return true;
    }

}
