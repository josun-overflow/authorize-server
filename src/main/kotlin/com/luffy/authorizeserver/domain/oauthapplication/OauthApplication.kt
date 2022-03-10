package com.luffy.authorizeserver.domain.oauthapplication

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class OauthApplication(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val oauthApplicationId: Long = 0,
    val applicationName: String,
    val clientId: String,
    val clientSecret: String,
    @Transient
    val redirectUri: MutableList<String> = mutableListOf()
)