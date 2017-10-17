package _521_540;

import java.util.*;

public class _535_TinyURL {

    public static Map<String,String> map;

    public static String pool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public _535_TinyURL() {
        if (map == null) {
            map = new HashMap();
        }
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {

        String shortURL;
        while (true) {
            shortURL = generateRandom();
            if (map.containsKey(generateRandom())) {
                continue;
            } else {
                break;
            }
        }

        map.put("http://tinyurl.com/" + shortURL, longUrl);

        return ("http://tinyurl.com/" + shortURL);
    }

    private String generateRandom() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i< 6; i++) {
            sb.append(pool.charAt(random.nextInt(62)));
        }

        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }

}
