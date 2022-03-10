package com.luffy.authorizeserver.domain.token

import org.springframework.data.jpa.repository.JpaRepository

interface TokenRepository : JpaRepository<Token, Long> {
}