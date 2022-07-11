package com.example.websitedownloadapp.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "website")
public class Website {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String websiteName;
    private String downloadStartDateTime;
    private String downloadEndDateTime;
    private String totalElapsedTime;
    private String totalDownloadedKilobytes;
}
