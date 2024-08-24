package com.raks.BookstoreAPI.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BookDTO {
    @JsonProperty("book_id")
    private Long id;

    private String title;

    private String author;

    private Double price;

    @JsonProperty("isbn_code")
    private String isbn;
}
