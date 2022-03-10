package com.luffy.authorizeserver.presentation.oauth.dto

import com.luffy.authorizeserver.presentation.BaseDto

data class TokenRequestDto(
    val code: String,
    val clientId: String,
    val clientSecret: String,
    val redirectUri: String
) : BaseDto