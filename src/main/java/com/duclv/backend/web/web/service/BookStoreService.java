package com.duclv.backend.web.web.service;

import com.duclv.backend.web.web.dto.AuthorResponse;
import vn.duclv.generated.bookstore.Author;

public interface BookStoreService {
    AuthorResponse getAuthorByBookId(int bookId);
}
