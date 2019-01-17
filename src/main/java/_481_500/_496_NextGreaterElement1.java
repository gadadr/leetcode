package _481_500;

public class _496_NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] elements = new int[nums1.length];
        for (int i=0; i<nums1.length; i++) {
            int greater = -1;
            for (int j=nums2.length-1; j>=0; j--) {
                if (nums2[j] == nums1[i]) {
                    break;
                } else if (nums2[j] > nums1[i]) {
                    greater = nums2[j];
                }
            }
            elements[i] = greater;
        }
        return elements;
    }
}
