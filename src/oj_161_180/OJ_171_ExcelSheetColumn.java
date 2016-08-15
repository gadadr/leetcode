package oj_161_180;

public class OJ_171_ExcelSheetColumn {
	public int titleToNumber(String s) {
		if (s == null) {
			return 0;
		}
		int ans = 0;
		int j = s.length()-1;
		for (int i=0; i<s.length(); i++) {
			ans = (int) (ans + (s.charAt(i)%64 * Math.pow(26, j--)));
		}
		return ans;
	}
}
