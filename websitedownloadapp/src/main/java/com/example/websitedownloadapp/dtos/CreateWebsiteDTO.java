package com.example.websitedownloadapp.dtos;

import lombok.Data;

@Data
public class CreateWebsiteDTO {
    private String websiteName;
    private String downloadStartDateTime;
    private String downloadEndDateTime;
    private String totalElapsedTime;
    private String totalDownloadedKilobytes;

}
