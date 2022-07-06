package shorturl.shurl.util;

import shorturl.shurl.model.Url;

public class UrlValidator {
    public static boolean validate(Url url) {
        String cleanUrl = url.getLongUrl().trim();
        String pattern = "^(http:\\/\\/www\\.|https:\\/\\/www\\.|http:\\/\\/|https:\\/\\/)?"
                + "[a-z0-9]+([\\-\\.]{1}[a-z0-9]+)*\\.[a-z]{2,5}(:[0-9]{1,5})?(\\/.*)?$";
        return !cleanUrl.equals("") && cleanUrl.matches(pattern);
    }
}
