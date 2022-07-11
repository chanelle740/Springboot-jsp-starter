package com.example.websitedownloadapp.repository;

import com.example.websitedownloadapp.models.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link,Long> {
}
