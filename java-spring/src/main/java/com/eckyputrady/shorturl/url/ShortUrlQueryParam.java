package com.eckyputrady.shorturl.url;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by ecky on 07/06/16.
 */
@Data
@AllArgsConstructor
public class ShortUrlQueryParam {
    private String shortUrl;

    private Projection projection;
}
