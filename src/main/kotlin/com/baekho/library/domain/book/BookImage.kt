package com.baekho.library.domain.book

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.*

@Entity
class BookImage(
    @Id
    private val id: String = UUID.randomUUID().toString(),
    val url: String,
    val createdAt: LocalDateTime,
) {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    val book: Book = Book.of()
}