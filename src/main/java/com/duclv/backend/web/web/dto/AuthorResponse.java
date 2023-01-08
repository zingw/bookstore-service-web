package com.duclv.backend.web.web.dto;

import lombok.Data;
import vn.duclv.generated.bookstore.Author;

import java.util.List;

@Data
public class AuthorResponse {

    private int authorId;
    private String firstName;
    private String lastName;
    private String gender;
    private List<Integer> bookId;

    public AuthorResponse (Author author){
        this.authorId = author.getAuthorId();
        this.firstName = author.getFirstName();
        this.lastName = author.getLastName();
        this.gender = author.getGender();
        this.bookId = author.getBookIdList();
    }
}
