package com.walter.graphql.controller

import com.walter.graphql.record.Author
import com.walter.graphql.record.Book
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller

@Controller
class BookController {
    @QueryMapping
    fun bookById(@Argument id: String): Book {
        return Book.getById(id)!!
    }

    @SchemaMapping
    fun author(book: Book): Author {
        return Author.getById(book.authorId)!!
    }
}