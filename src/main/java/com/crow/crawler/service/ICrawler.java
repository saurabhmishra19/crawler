package com.crow.crawler.service;

import java.net.URL;
import java.util.List;

/**
 * Created by saurabh on 13/7/18.
 *
 */
public interface ICrawler {

    public void crawl(URL url, List<String> keywords);


}
