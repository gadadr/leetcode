package _441_460;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _448_FindAllNumbersDisappeared {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != -1) {
                int temp = nums[nums[i]-1];
                int index = nums[i]-1;
                while (temp != -1) {
                    nums[index] = -1;
                    index = temp-1;
                    temp = nums[temp-1];
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != -1) {
                ans.add(i+1);
            }
        }
        return ans;
    }

    @Test
    public void test() {
        List<Integer> ans = findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
        Assertions.assertIterableEquals(Arrays.asList(5, 6), ans);
    }

}
