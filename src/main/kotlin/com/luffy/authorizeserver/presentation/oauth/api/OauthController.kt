package com.luffy.authorizeserver.presentation.oauth.api

import com.luffy.authorizeserver.presentation.oauth.dto.AuthorizeRequestDto
import com.luffy.authorizeserver.presentation.oauth.dto.TokenResponse
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriBuilder
import org.springframework.web.util.UriComponents
import java.net.URI

@RestController
@RequestMapping("/oauth")
class OauthController {

    @PostMapping("/token")
    fun token(code: String): TokenResponse {
        return TokenResponse("a", 1, "asdf", "Adsf", "Asdf")
    }

}