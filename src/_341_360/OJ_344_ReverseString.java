package _341_360;

public class OJ_344_ReverseString {
	
	public String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		if (s != null) {
			int length = s.length();
			for (int i=1; i<=length; i++) {
				sb.append(s.charAt(length-i));
			}
		}
		return sb.toString();
    }
}
