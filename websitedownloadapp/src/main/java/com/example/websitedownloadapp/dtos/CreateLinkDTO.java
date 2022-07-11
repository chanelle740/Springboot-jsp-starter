package com.example.websitedownloadapp.dtos;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreateLinkDTO {
    private String linkName;
    @JsonProperty("website_id")
    private Long websiteId;
    private String totalElapsedTime;
    private String totalDownloadedKilobytes;
}
