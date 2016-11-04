package _321_340;

public class OJ_338_CountingBits {
	
	public int[] countBits(int num) {
		int[] ans = new int[num+1];
		for (int i=0; i<=num; i++) {
			String s = decToBin(i);
			int sum = 0;
			for (Character ch : s.toCharArray()) {
				if (ch == '1') sum++;
			}
			ans[i] = sum;
		}
		return ans;
    }
	
	private String decToBin(int x) {
		StringBuilder sb = new StringBuilder();
		int quotient = x;
		while (quotient > 0) {
			sb.append(quotient%2);
			quotient /= 2;
		}
		return sb.length() == 0 ? "0" : sb.reverse().toString();
	}
}
