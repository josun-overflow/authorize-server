package com.luffy.authorizeserver.application.member

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import org.springframework.format.annotation.DateTimeFormat

data class SignUpRequestDto(
    val email: String,
    val password: String,
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    val birthDay: String,
    val phoneNumber: String
)

class BirthDayDeserializer : JsonDeserializer<String>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): String {
        println("deserialize")
        return "test"
    }
}
