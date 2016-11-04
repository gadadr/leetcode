package _061_080;

public class OJ_066_PlusOne {
	public int[] plusOne(int[] digits) {
        for (int i=digits.length-1; i>=0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        int[] ans = new int[digits.length+1];
        ans[0] = 1;
        for (int i=1; i<ans.length; i++) {
            ans[i] = digits[i-1];
        }
        return ans;
    }
}
