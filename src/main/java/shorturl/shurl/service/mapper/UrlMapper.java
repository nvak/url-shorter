package shorturl.shurl.service.mapper;

import org.springframework.stereotype.Component;
import shorturl.shurl.dto.UrlRequestDto;
import shorturl.shurl.dto.UrlResponseDto;
import shorturl.shurl.model.Url;

@Component
public class UrlMapper {
    public UrlResponseDto toShortUrlDto(Url shortUrl){
        UrlResponseDto responseDto = new UrlResponseDto();
        responseDto.setUrl(shortUrl.getShortUrl());
        return responseDto;
    }

    public Url toModel (UrlRequestDto requestDto){
        Url longUrl = new Url();
        longUrl.setLongUrl(requestDto.getLongUrl());
        return longUrl;
    }

    public UrlResponseDto toLongUrlDto(Url longUrl){
        UrlResponseDto responseDto = new UrlResponseDto();
        responseDto.setUrl(longUrl.getLongUrl());
        return responseDto;
    }
}
