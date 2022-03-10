package com.luffy.authorizeserver.presentation.oauth

import com.luffy.authorizeserver.presentation.oauth.api.OauthController
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.post

@WebMvcTest(OauthController::class)
internal class OauthControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun `인가코드 생성`() {
        mockMvc.get("/oauth/authorize")
            .andExpect {
                status { is3xxRedirection() }
            }
    }

    @Test
    fun `토큰 생성`() {
        mockMvc.post("/oauth/token")
    }

    @Test
    fun `토큰 갱신`() {
        mockMvc.post("/oauth/token")
    }

    @Test
    fun `토큰 폐기`() {

    }
}