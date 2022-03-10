package com.luffy.authorizeserver.domain

import java.time.LocalDateTime
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseEntity {
    var createdAt: LocalDateTime? = null
    var createdBy: String? = null
    var updatedAt: LocalDateTime? = null
    var updatedBy: String? = null
}