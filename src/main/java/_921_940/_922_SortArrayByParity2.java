package _921_940;

public class _922_SortArrayByParity2 {

    public int[] sortArrayByParityII(int[] A) {
        int j=1;
        for (int i=0; i<A.length; i+=2) {
            if ((A[i] & 1) == 1) {
                for (; ; j+=2) {
                    if ((A[j] & 1) == 0) {
                        A[i] ^= A[j];
                        A[j] ^= A[i];
                        A[i] ^= A[j];
                        break;
                    }
                }
            }
        }
        return A;
    }

}
