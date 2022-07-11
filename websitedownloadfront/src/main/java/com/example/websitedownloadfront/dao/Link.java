package com.example.websitedownloadfront.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Link {
    private Long id;
    private String linkName;
    private String totalElapsedTime;
    private String totalDownloadedKilobytes;
    @JsonProperty("website_id")
    private String websiteId;

}
