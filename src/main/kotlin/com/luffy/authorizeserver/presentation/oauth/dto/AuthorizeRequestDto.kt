package com.luffy.authorizeserver.presentation.oauth.dto

import java.beans.ConstructorProperties

data class AuthorizeRequestDto @ConstructorProperties("state", "client_id", "redirect_uri") constructor(
    val state: String,
    val clientId: String,
    val redirectUri: String
)