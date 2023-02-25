package com.android.activity01_a

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

fun main() {
    logger.trace { "This is trace log" }
    logger.debug { "This is a debug log" }
    logger.info { "This is an info log" }
    logger.warn { "This is a warn log" }
    logger.error { "This is an error log" }
}