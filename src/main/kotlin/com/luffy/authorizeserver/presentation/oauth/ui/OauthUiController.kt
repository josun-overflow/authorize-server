package com.luffy.authorizeserver.presentation.oauth.ui

import com.luffy.authorizeserver.presentation.oauth.dto.AuthorizeRequestDto
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class OauthUiController {

    @GetMapping("/oauth/authorize")
    fun authorize(model: Model, authorizeRequestDto: AuthorizeRequestDto): String {
        return "oauth/authorize"
    }

}