package _521_540;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class _535_LongestPalindromicSubstring {
    private static Map<String, String> codes = new HashMap<>();
    private static final String url = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        Random random = new Random();
        String code = random.ints(6)
                .map(i -> i%26 + 97)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        codes.put(url+code, longUrl);
        return url+code;
    }


    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return codes.get(shortUrl);
    }

    @Test
    public void test() {
        encode("https://leetcode.com/problems/design-tinyurl");
    }
}
