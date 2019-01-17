package _821_840;

public class _824_GoatLatin {
    public String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder(S);
        int words = 0;
        String vowels = "aeiouAEIOU";
        for (int i=0; i<sb.length(); i++) {
            words++;
            StringBuilder ma = new StringBuilder("ma");
            if (vowels.indexOf(sb.charAt(i)) == -1) {
                ma.insert(0, sb.charAt(i));
                sb.deleteCharAt(i);
            }
            for (int j=0; j<words; j++) {
                ma.append('a');
            }
            while(i < sb.length() && sb.charAt(i) != ' ') {
                i++;
            }
            sb.insert(i, ma);
            i += ma.length();
        }
        return sb.toString();
    }
}
