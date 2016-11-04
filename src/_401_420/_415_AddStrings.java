package _401_420;

public class _415_AddStrings {
	public String addStrings(String num1, String num2) {
		StringBuilder sb = new StringBuilder();
		int i = num1.length()-1;
		int j = num2.length()-1;
		
		int count = 0;
		while (i>=0 || j>=0) {
			int x = 0, y = 0;
			if (i >= 0) {
				x = num1.charAt(i) - 48;
			}
			if (j >= 0) {
				y = num2.charAt(j) - 48;
			}
			
			int z = x + y + count;
			if (z > 9) {
				count = 1;
				z = z-10;
			} else {
				count = 0;
			}
			sb.append(z);
			i--;
			j--;
		}
		
		if (count > 0) {
			sb.append(1);
		}
		
		return sb.reverse().toString();
    }
}