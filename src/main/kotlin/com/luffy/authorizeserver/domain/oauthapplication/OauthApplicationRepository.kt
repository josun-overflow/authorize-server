package com.luffy.authorizeserver.domain.oauthapplication

import org.springframework.data.jpa.repository.JpaRepository

interface OauthApplicationRepository : JpaRepository<OauthApplication, Long> {
}