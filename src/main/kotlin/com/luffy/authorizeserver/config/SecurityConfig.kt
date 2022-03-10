package com.luffy.authorizeserver.config

import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.web.servlet.invoke

@EnableWebSecurity
class SecurityConfig : WebSecurityConfigurerAdapter() {
    private val permitAllList = listOf("/login", "/signUp")
    override fun configure(http: HttpSecurity) {
        http {
            csrf { disable() }
            authorizeRequests {
                permitAllList.forEach {
                    authorize(it, permitAll)
                }
                authorize(anyRequest, authenticated)
            }
            formLogin {
                loginPage = "/login"
            }
        }


    }
}