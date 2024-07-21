package com.example.library_service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library_service.model.Library;
import com.example.library_service.repository.LibraryRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/libraries")
public class LibraryController {

    @Autowired
    private LibraryRepository libraryRepository;

    @PostMapping
    public ResponseEntity<Library> addLibrary(@Valid @RequestBody Library library) {
        Library savedLibrary = libraryRepository.save(library);
        return new ResponseEntity<>(savedLibrary, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Library>> getAllLibraries() {
        List<Library> libraries = libraryRepository.findAll();
        return new ResponseEntity<>(libraries, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Library> getLibraryById(@PathVariable Long id) {
        Optional<Library> library = libraryRepository.findById(id);
        return library.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/books/{bookId}")
    public ResponseEntity<List<Library>> getLibrariesByBookId(@PathVariable Long bookId) {
        return ResponseEntity.ok().build();
    }
}
