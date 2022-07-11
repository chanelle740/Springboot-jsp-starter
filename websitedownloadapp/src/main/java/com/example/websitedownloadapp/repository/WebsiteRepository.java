package com.example.websitedownloadapp.repository;

import com.example.websitedownloadapp.models.Website;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebsiteRepository extends JpaRepository<Website,Long> {
}
