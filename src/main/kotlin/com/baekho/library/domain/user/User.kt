package com.baekho.library.domain.user

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.LocalDateTime
import java.util.*

@Entity
class User(
    @Id
    private val id: String = UUID.randomUUID().toString(),
    var name: String,
    var email: String,
    var password: String,
    var role: String,
    var address: String,
    var createdAt: LocalDateTime,
    var updatedAt: LocalDateTime,
    var deletedAt: LocalDateTime? = null,
) {
}