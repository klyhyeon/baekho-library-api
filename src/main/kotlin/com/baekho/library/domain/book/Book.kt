package com.baekho.library.domain.book

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

@Entity
class Book(
    @Id
    private val id: String = UUID.randomUUID().toString(),
    var title: String,
    var author: String,
    var description: String,
    var price: Int,
    var quantity: Int,
    var publisher: String,
    var publishedDate: LocalDate,
    var createdAt: LocalDateTime,
    var updatedAt: LocalDateTime,
    var deletedAt: LocalDateTime? = null,
) {

    @OneToMany(mappedBy = "book")
    val bookImages: List<BookImage> = mutableListOf()

    companion object {
        fun of(): Book {
            return Book(
                title = "",
                author = "",
                description = "",
                price = 0,
                quantity = 0,
                publisher = "",
                publishedDate = LocalDate.now(),
                createdAt = LocalDateTime.now(),
                updatedAt = LocalDateTime.now(),
            )
        }
    }
}