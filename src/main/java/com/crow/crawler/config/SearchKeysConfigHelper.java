package com.crow.crawler.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saurabh on 13/7/18.
 */
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class SearchKeysConfigHelper {
    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    private List<String> keys=new ArrayList<>();



}
