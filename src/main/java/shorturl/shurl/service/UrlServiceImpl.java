package shorturl.shurl.service;

import org.springframework.stereotype.Service;
import shorturl.shurl.model.Url;
import shorturl.shurl.repository.UrlRepository;
import shorturl.shurl.util.ShortenerUtil;
import shorturl.shurl.util.UrlValidator;

@Service
public class UrlServiceImpl implements UrlService {
    private final UrlRepository repository;

    public UrlServiceImpl(UrlRepository repository) {
        this.repository = repository;
    }

    @Override
    public Url getShortUrl(Url longUrl) {
        if (!UrlValidator.validate(longUrl)) {
            longUrl.setShortUrl("Invalid url");
            return longUrl;
        }
        Url url = checkUrlInBase(longUrl);
        if (url == null) {
            url = repository.save(ShortenerUtil.toShortUrl(longUrl));
        }
        return url;
    }

    @Override
    public Url getFullUrl(String path) {
        return repository.getByShortUrl("http://localhost:8080/" + path);
    }

    private Url checkUrlInBase(Url longUrl) {
        return repository.getByLongUrl(longUrl.getLongUrl());
    }

}
