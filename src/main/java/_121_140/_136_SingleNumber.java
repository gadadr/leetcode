package _121_140;

import java.util.Arrays;

public class _136_SingleNumber {
    public int singleNumber(int[] nums) {
        return Arrays.stream(nums)
                .reduce((left, right) -> left ^ right)
                .getAsInt();
    }
}
