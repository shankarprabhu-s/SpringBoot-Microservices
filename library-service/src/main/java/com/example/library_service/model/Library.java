package com.example.library_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Library {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String libraryName;

    @NotEmpty
    private String libraryCity;

    // Getters and Setters
    
    // Constructors
    public Library() {}

    public Library(Long id, String libraryName, String libraryCity) {
        this.id = id;
        this.libraryName = libraryName;
        this.libraryCity = libraryCity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryCity() {
        return libraryCity;
    }

    public void setLibraryCity(String libraryCity) {
        this.libraryCity = libraryCity;
    }
}
