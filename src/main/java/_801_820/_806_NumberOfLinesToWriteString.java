package _801_820;

public class _806_NumberOfLinesToWriteString {

    public int[] numberOfLines(int[] widths, String S) {
        int lines = 0;
        int sum = 0;
        for (char ch : S.toCharArray()) {
            int temp = widths[ch-97];
            if (sum + temp > 100) {
                lines++;
                sum = 0;
            }
            sum += temp;
        }
        if (sum > 0) lines++;
        return new int[]{lines, sum};
    }
}
