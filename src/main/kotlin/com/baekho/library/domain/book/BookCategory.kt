package com.baekho.library.domain.book

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.LocalDateTime
import java.util.*

@Entity
class BookCategory(
    @Id
    private val id: String = UUID.randomUUID().toString(),
    var name: String,
    var createdAt: LocalDateTime,
    var updatedAt: LocalDateTime,
    var deletedAt: LocalDateTime? = null,
) {

}