package com.ahmaddudayef.belajarspringlogging

import mu.KotlinLogging
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestPropertySource

private val logger = KotlinLogging.logger {}

@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
class LoggingTest {

    @Test
    fun testLongLogging() {
        for (i in 0 until 1000) {
            logger.warn("Hello World {}", i)
        }
    }

    @Test
    fun testLog() {
        logger.info("Belajar Kotlin")
        logger.warn("Belajar Spring")
        logger.error("Belajar Bersama Programmer Zaman Now")
    }
}