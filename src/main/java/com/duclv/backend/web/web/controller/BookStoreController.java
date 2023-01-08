package com.duclv.backend.web.web.controller;

import com.duclv.backend.web.web.dto.AuthorResponse;
import com.duclv.backend.web.web.service.BookStoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book_store/v1")
@RequiredArgsConstructor
public class BookStoreController {

    private final BookStoreService bookStoreService;

    @GetMapping("/find-author/{book_id}")
    public ResponseEntity<AuthorResponse> getAuthorByBookId(@PathVariable("book_id") int bookId) {

        AuthorResponse authorResponse = bookStoreService.getAuthorByBookId(bookId);
        return ResponseEntity.ok().body(authorResponse);
    }
}
