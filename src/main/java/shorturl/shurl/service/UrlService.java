package shorturl.shurl.service;

import shorturl.shurl.model.Url;

public interface UrlService {
    Url getShortUrl(Url longUrl);

    Url getFullUrl(String path);
}
