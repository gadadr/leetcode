package _841_860;

public class _852_PeakIndexInAMountainArray {

    public int peakIndexInMountainArray(int[] A) {
        int ans = 0;
        for (int i=1; i<A.length; i++) {
            if (A[i-1] < A[i]) {
                continue;
            } else {
                ans = i-1;
                break;
            }
        }
        return ans;
    }
}
