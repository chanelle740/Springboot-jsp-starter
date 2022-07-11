package com.example.websitedownloadapp.services.impl;

import com.example.websitedownloadapp.dtos.CreateWebsiteDTO;
import com.example.websitedownloadapp.models.Website;
import com.example.websitedownloadapp.repository.WebsiteRepository;
import com.example.websitedownloadapp.services.IWebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.modelmapper.ModelMapper;

import java.util.List;

@Service
public class WebsiteServiceImpl implements IWebsiteService {

    private final WebsiteRepository websiteRepository;

    @Autowired
    public WebsiteServiceImpl(WebsiteRepository websiteRepository) {
        this.websiteRepository = websiteRepository;
    }


    @Override
    public List<Website> all() {
        return websiteRepository.findAll();
    }

    @Override
    public Website create(CreateWebsiteDTO website) {
        Website websiteInfo = new ModelMapper().map(website, Website.class);
        return websiteRepository.save(websiteInfo);
    }

    @Override
    public Website findById(Long webId) {
        return websiteRepository.findById(webId).orElseThrow(() -> new RuntimeException("Website not found"));
    }
}
