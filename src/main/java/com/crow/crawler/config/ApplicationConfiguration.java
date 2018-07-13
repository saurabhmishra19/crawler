package com.crow.crawler.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by saurabh on 13/7/18.
 */

@Configuration
@PropertySource("classpath:source-sites.properties")
public class ApplicationConfiguration {

    @Value("${site}")
    private String url;
    @Value("${wikilink}")
    private String wikilink;
    @Bean
    public WebDriver buildSeleniumWebDriver() {

        System.out.println(url);
        System.out.println(wikilink);

        System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("/usr/bin/google-chrome");
        chromeOptions.addArguments("--headless");

        WebDriver driver=null; //= new ChromeDriver(chromeOptions);
        // driver.navigate().to("https://the-internet.herokuapp.com/login");

        return driver;

    }

}
