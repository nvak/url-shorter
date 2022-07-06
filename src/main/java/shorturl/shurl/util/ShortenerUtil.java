package shorturl.shurl.util;

import shorturl.shurl.model.Url;

public class ShortenerUtil {
    private static final char[] map =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

    public static Url toShortUrl(Url url) {
        StringBuilder stringBuilder = new StringBuilder();
        while (stringBuilder.length() != 8) {
            stringBuilder.append(map[(int) (map.length - Math.random() * map.length)]);
        }
        url.setShortUrl("http://localhost:8080/" + stringBuilder);
        return url;
    }
}
