package com.eckyputrady.shorturl.url;

import lombok.*;

/**
 * Created by ecky on 07/06/16.
 */

@Data
@AllArgsConstructor
public class ShortenedUrl {
    private String id;
    private String longUrl;
    private Analytics analytics;

    @Data
    @AllArgsConstructor
    public static class Analytics {
        private AnalyticsData allTime;
    }

    @Data
    @AllArgsConstructor
    public static class AnalyticsData {
        private Long shortUrlClicks;
    }
}
