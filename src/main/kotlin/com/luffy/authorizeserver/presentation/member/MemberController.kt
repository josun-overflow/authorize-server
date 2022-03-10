package com.luffy.authorizeserver.presentation.member

import com.luffy.authorizeserver.application.member.MemberService
import com.luffy.authorizeserver.application.member.SignUpRequestDto
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class MemberController(private val memberService: MemberService) {

    @GetMapping("/signUp")
    fun signUpView(): String {
        return "member/signUp"
    }

    @PostMapping("/signUp")
    @ResponseBody
    fun signUp(signUpRequestDto: SignUpRequestDto) {
        memberService.signUp(signUpRequestDto)
    }

    @GetMapping("/login")
    fun loginView(): String {
        return "member/login"
    }

}