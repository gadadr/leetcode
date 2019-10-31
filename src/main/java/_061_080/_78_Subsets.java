package _061_080;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class _78_Subsets {

    /**
     * The credit fos this solution goes to https://leetcode.com/sikp/
     *
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int n : nums){
            int size = result.size();
            for(int i=0; i<size; i++){
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(n);
                result.add(subset);
            }
        }
        return result;
    }

    /**
     * Classic solution using bits to decide if a number should be included.
     *
     */
    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int permutations = (int) Math.pow(2, nums.length);

        for (int i=0; i<=permutations; i++) {
            for (int j=0; j<nums.length; j++) {
                List<Integer> temp = new ArrayList<>();
                if (((i >> j) & 1) == 1) {
                    temp.add(nums[j]);
                }
                res.add(temp);
            }
        }

        return res;
    }

    @Test
    public void test() {
        List<List<Integer>> result = subsets2(new int[]{1,2,3,4});
    }

}
