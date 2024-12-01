package com.baekho.library.domain

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.testcontainers.service.connection.ServiceConnection
import org.testcontainers.containers.MySQLContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers

@Testcontainers
@SpringBootTest
class MyIntegrationTests {

    @Test
    fun myTest() {
        println("d")
        // ...
    }

    companion object {

        @Container
        @ServiceConnection
        @JvmStatic
        val mysqlContainer = MySQLContainer("mysql:8.0.36");

    }

}