package _161_180;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class _167_TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {
        int i=0, j=numbers.length-1;
        while (i<j) {
            int sum = numbers[i] + numbers[j];
            if(sum == target) {
                return new int[]{i+1, j+1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }

    public int[] twoSum2(int[] numbers, int target) {
        for (int i=0; i<numbers.length; i++) {
            int j = binarySearch(numbers, 0, numbers.length, target-numbers[i]);
            if (j != -1) {
                return new int[]{i+1, j+1};
            }
        }
        return new int[0];
    }

    private int binarySearch(int[] numbers, int start, int end, int target) {
        if (start >= end) {
            return -1;
        }

        int mid = (end + start)/2;
        if (numbers[mid] == target) {
            return mid;
        } else if (numbers[mid] > target) {
            return binarySearch(numbers, start, mid, target);
        } else {
            return binarySearch(numbers, mid+1, end, target);
        }
    }

    @Test
    public void test() {
        int i1 = binarySearch(new int[]{1, 2, 3, 4, 5}, 0, 5, 3);
        Assertions.assertEquals(i1, 2);

        int i2 = binarySearch(new int[]{1, 2, 3, 4, 5}, 0, 5, 6);
        Assertions.assertEquals(i2, -1);
    }

    @Test
    public void test2() {
        int[] ans =twoSum2(new int[]{2,3,4}, 6);
        Assertions.assertArrayEquals(ans, new int[]{1,2});
    }
}
