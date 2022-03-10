package com.luffy.authorizeserver.presentation.oauth.dto

import com.luffy.authorizeserver.presentation.BaseDto

data class TokenResponse(
    val accessToken: String,
    val expiresIn: Int,
    val refreshToken: String,
    val refreshTokenExpiresIn: String,
    val scope: String
) : BaseDto {
    private val tokenType: String = "bearer"
}
