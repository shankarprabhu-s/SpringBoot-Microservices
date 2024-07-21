package com.example.library_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.library_service.model.Library;

public interface LibraryRepository extends JpaRepository<Library, Long> {
    // Custom query methods if needed
}
