package _901_920;

public class _905_SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int even=-1, odd=-1;
        for (int i=0; i<A.length; i++) {
            if (A[i] % 2 == 1 && odd == even) {
                odd = i;
            } else if (A[i] % 2 == 0 && odd != even) {
                int temp = A[odd];
                A[odd] = A[i];
                A[i] = temp;
                even = odd;
                i = odd;
            }
        }
        return A;
    }
}
