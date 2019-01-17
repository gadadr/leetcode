package _461_480;

public class _476_NumberComplement {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                sb.append('0');
            } else sb.append('1');
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
