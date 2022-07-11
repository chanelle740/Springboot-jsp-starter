package com.example.websitedownloadapp.controllers;


import com.example.websitedownloadapp.dtos.CreateLinkDTO;
import com.example.websitedownloadapp.services.ILinkService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/links")
public class LinkController {
    private final ILinkService linkService;

    public LinkController(ILinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping("")
    public ResponseEntity<?> all() {
        return ResponseEntity.ok(linkService.all());
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody CreateLinkDTO link) {
        return ResponseEntity.ok(linkService.create(link));
    }

}
