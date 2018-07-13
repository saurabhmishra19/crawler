package com.crow.crawler.Crawler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
public class CrawlerApplication {
    @Value("site")
    private String url;
    @Value("wikilink")
    private String wikilink;
    @Scheduled(fixedRate = 2000)
    public void appRunner() {
        System.out.println("running application site: "+url+" wiki "+wikilink);
    }

}
