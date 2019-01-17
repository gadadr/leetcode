package _521_540;

import java.util.Arrays;

public class _540_SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        return Arrays.stream(nums)
                .reduce((a, b) -> a ^ b)
                .getAsInt();
    }
}
