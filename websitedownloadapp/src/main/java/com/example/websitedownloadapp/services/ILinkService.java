package com.example.websitedownloadapp.services;

import com.example.websitedownloadapp.dtos.CreateLinkDTO;
import com.example.websitedownloadapp.models.Link;

import java.util.List;

public interface ILinkService {
    List<Link> all();

    Link create(CreateLinkDTO link);


}
