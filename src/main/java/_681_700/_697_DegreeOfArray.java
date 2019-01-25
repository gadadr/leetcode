package _681_700;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class _697_DegreeOfArray {

    public int findShortestSubArray(int[] nums) {
        Map<Integer, List<Integer>> listMap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (listMap.containsKey(nums[i])) {
                listMap.get(nums[i]).add(i);
            } else {
                listMap.put(nums[i], new ArrayList<>(Arrays.asList(i)));
            }
        }

        int count = 0;
        int length = Integer.MAX_VALUE;
        for (List<Integer> value : listMap.values()) {
            int tempLength = value.get(value.size()-1) - value.get(0);
            if (value.size() > count) {
                length = tempLength;
                count = value.size();
            } else if (value.size() == count && tempLength < length) {
                length = tempLength;
            }
        }

        return length+1;
    }

    @Test
    public void test() {
        int ans = findShortestSubArray(new int[]{1,2,2,3,1,4,2});
        Assertions.assertEquals(ans, 2);
    }

}
