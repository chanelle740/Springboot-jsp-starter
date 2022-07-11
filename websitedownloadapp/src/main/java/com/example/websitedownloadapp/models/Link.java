package com.example.websitedownloadapp.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "link")
public class Link {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String linkName;

    @ManyToOne
    Website website;

    private String totalElapsedTime;
    private String totalDownloadedKilobytes;


}
