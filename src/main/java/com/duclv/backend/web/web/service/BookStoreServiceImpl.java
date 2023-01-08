package com.duclv.backend.web.web.service;

import com.duclv.backend.web.web.dto.AuthorRequest;
import com.duclv.backend.web.web.dto.AuthorResponse;
import io.grpc.Channel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.duclv.generated.bookstore.BookStoreGrpc;
import vn.duclv.generated.bookstore.GetAuthorByBookIdRequest;

@Service
@RequiredArgsConstructor
public class BookStoreServiceImpl implements BookStoreService {

    private final Channel bookstoreChannel;

    @Override
    public AuthorResponse getAuthorByBookId(int bookId) {

        BookStoreGrpc.BookStoreBlockingStub stub = BookStoreGrpc.newBlockingStub(bookstoreChannel);
        GetAuthorByBookIdRequest request = AuthorRequest.generateAuthorByBookIdRequest(bookId);
        return new AuthorResponse(stub.getAuthorByBookId(request));
    }
}
