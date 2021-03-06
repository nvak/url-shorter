package shorturl.shurl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;
import shorturl.shurl.dto.UrlRequestDto;
import shorturl.shurl.dto.UrlResponseDto;
import shorturl.shurl.service.UrlService;
import shorturl.shurl.service.mapper.UrlMapper;

@RestController
@RequestMapping("/")
public class UrlController {
    private final UrlService urlService;
    private final UrlMapper mapper;

    public UrlController(UrlService urlService, UrlMapper mapper) {
        this.urlService = urlService;
        this.mapper = mapper;
    }

    @PostMapping
    public UrlResponseDto getUrl(@RequestBody UrlRequestDto request) {
        return mapper.toShortUrlDto(urlService.getShortUrl(mapper.toModel(request)));
    }

    @GetMapping("/{request}")
    public RedirectView returnFullUrl(@PathVariable String request) {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(urlService.getFullUrl(request).getLongUrl());
        return redirectView;
    }
}
