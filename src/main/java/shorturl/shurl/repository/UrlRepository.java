package shorturl.shurl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shorturl.shurl.model.Url;

@Repository
public interface UrlRepository extends JpaRepository<Url,Long> {
    Url getByShortUrl(String shortUrl);
    Url getByLongUrl(String longUrl);
}
