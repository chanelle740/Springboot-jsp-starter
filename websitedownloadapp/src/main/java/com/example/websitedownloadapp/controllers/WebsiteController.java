package com.example.websitedownloadapp.controllers;

import com.example.websitedownloadapp.dtos.CreateWebsiteDTO;
import com.example.websitedownloadapp.services.IWebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/websites")
public class WebsiteController {
    private final IWebsiteService websiteService;

    @Autowired
    public WebsiteController(IWebsiteService websiteService) {
        this.websiteService = websiteService;
    }

    @GetMapping
    public ResponseEntity<?> all() {
        return ResponseEntity.ok(websiteService.all());
    }
    @PostMapping
    ResponseEntity<?> create(@Valid @RequestBody CreateWebsiteDTO website) {
        return ResponseEntity.ok(websiteService.create(website));
    }
}
