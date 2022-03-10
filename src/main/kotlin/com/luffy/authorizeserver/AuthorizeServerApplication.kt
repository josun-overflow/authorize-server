package com.luffy.authorizeserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AuthorizeServerApplication

fun main(args: Array<String>) {
    runApplication<AuthorizeServerApplication>(*args)
}
