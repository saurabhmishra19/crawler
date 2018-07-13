package com.crow.crawler.dto;

import org.joda.time.DateTime;

/**
 * Created by saurabh on 13/7/18.
 */
public class BaseResponseDump {

    private String link;
    private String metaDetails;
    private DateTime dt;


    public BaseResponseDump() {
        this.dt = new DateTime();
    }

    public DateTime getDt() {
        return dt;
    }

    public void setDt(DateTime dt) {
        this.dt = dt;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMetaDetails() {
        return metaDetails;
    }

    public void setMetaDetails(String metaDetails) {
        this.metaDetails = metaDetails;
    }

    @Override
    public String toString() {
        return "BaseResponseDump{" +
                "link='" + link + '\'' +
                ", metaDetails='" + metaDetails + '\'' +
                ", dt=" + dt +
                '}';
    }
}
