package shorturl.shurl.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shorturl.shurl.model.Url;

@Repository
public interface UrlRepository extends JpaRepository<Url, Long> {
    Optional<Url> getByShortUrl(String shortUrl);

    Url getByLongUrl(String longUrl);
}
