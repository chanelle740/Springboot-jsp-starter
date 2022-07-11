package com.example.websitedownloadapp.services;

import com.example.websitedownloadapp.dtos.CreateWebsiteDTO;
import com.example.websitedownloadapp.models.Link;
import com.example.websitedownloadapp.models.Website;

import java.util.List;

public interface IWebsiteService {
    List<Website> all();
    Website create(CreateWebsiteDTO website);
    Website findById(Long webId);
}
