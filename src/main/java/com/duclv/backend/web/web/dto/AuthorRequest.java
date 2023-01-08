package com.duclv.backend.web.web.dto;

import vn.duclv.generated.bookstore.GetAuthorByBookIdRequest;

public class AuthorRequest {

    public static GetAuthorByBookIdRequest generateAuthorByBookIdRequest(int bookId){
        return GetAuthorByBookIdRequest
                .newBuilder()
                .setBookId(bookId)
                .build();
    }
}
