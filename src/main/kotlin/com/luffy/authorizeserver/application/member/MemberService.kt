package com.luffy.authorizeserver.application.member

import com.luffy.authorizeserver.domain.member.MemberRepository
import com.luffy.authorizeserver.infrastructure.Logger
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberRepository: MemberRepository
) : UserDetailsService {

    companion object : Logger

    override fun loadUserByUsername(email: String): UserDetails {
        val member = memberRepository.findByEmail(email) ?: throw UsernameNotFoundException("존재하지 않는 사용자 입니다.")

        return User(member.email, member.password, listOf(SimpleGrantedAuthority("ROLE_USER")))
    }

    fun signUp(signUpRequestDto: SignUpRequestDto) {
        log.debug("$signUpRequestDto")
        login()
    }

    fun login() {
        val securityContext = SecurityContextHolder.getContext()
        securityContext.authentication = UsernamePasswordAuthenticationToken()
        log.debug("login")
    }
}