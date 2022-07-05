package shorturl.shurl.service;

import org.springframework.stereotype.Service;
import shorturl.shurl.model.Url;
import shorturl.shurl.repository.UrlRepository;

@Service
public class UrlServiceImpl implements UrlService{
    private final UrlRepository repository;

    public UrlServiceImpl(UrlRepository repository) {
        this.repository = repository;
    }

    @Override
    public Url saveAndShortUrl(Url longUrl) {

        return repository.save(longUrl);
    }

    @Override
    public Url encodeUrl(String shortUrl) {
        return repository.getByShortUrl(shortUrl);
    }
}
