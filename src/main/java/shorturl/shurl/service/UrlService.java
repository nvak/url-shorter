package shorturl.shurl.service;

import shorturl.shurl.model.Url;

public interface UrlService {
    Url saveAndShortUrl(Url longUrl);

    Url encodeUrl(String shortUrl);
}
