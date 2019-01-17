package _541_560;

public class _557_ReverseWordsInString3 {
    public String reverseWords(String s) {
         String[] words = s.split(" ");
         StringBuilder sb = new StringBuilder(new StringBuilder(words[0]).reverse());
         for (int i=1; i<words.length; i++) {
             sb.append(" " + new StringBuilder(words[i]).reverse());
         }
         return sb.toString();
    }
}
