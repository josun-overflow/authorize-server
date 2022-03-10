package com.luffy.authorizeserver.domain.member

import com.luffy.authorizeserver.domain.BaseEntity
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Member(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val memberId: Long = 0,
    val email: String,
    val password: String,
    val birthDay: LocalDate,
    val phoneNumber: String
) : BaseEntity()