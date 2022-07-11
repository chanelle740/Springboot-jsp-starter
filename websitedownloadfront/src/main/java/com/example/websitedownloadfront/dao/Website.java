package com.example.websitedownloadfront.dao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Website {
    private Long id;
    private String websiteName;
    private String downloadStartDateTime;
    private String downloadEndDateTime;
    private String totalElapsedTime;
    private String totalDownloadedKilobytes;

}
