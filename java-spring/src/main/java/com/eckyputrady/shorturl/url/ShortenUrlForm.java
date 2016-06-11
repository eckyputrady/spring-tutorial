package com.eckyputrady.shorturl.url;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by ecky on 07/06/16.
 */
@Data
@AllArgsConstructor
public class ShortenUrlForm {
    private String longUrl;
}
