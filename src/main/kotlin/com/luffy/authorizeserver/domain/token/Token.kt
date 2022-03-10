package com.luffy.authorizeserver.domain.token

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Token(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val tokenId: Long = 0,
    val token: String
)