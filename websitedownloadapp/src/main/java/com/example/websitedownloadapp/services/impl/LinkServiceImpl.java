package com.example.websitedownloadapp.services.impl;

import com.example.websitedownloadapp.dtos.CreateLinkDTO;
import com.example.websitedownloadapp.models.Link;
import com.example.websitedownloadapp.repository.LinkRepository;
import com.example.websitedownloadapp.services.ILinkService;
import com.example.websitedownloadapp.services.IWebsiteService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkServiceImpl implements ILinkService {
    private final LinkRepository linkRepository;

    private final IWebsiteService websiteService;

    public LinkServiceImpl(LinkRepository linkRepository, IWebsiteService websiteService) {
        this.linkRepository = linkRepository;
        this.websiteService = websiteService;
    }


    @Override
    public List<Link> all() {
        return linkRepository.findAll();
    }


    @Override
    public Link create(CreateLinkDTO link) {
        Link linkInfo = new ModelMapper().map(link, Link.class);
        return linkRepository.save(linkInfo);
    }




}

