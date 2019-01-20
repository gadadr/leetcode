package _961_980;

import java.util.HashSet;
import java.util.Set;

public class _961_NRepeatedElementinSize2NArray {

    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        int i = 0;
        while(set.add(A[i])) {
            i++;
        }
        return A[i];
    }
}
