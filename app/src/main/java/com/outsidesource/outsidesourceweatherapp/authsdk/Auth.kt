package com.outsidesource.outsidesourceweatherapp.authsdk

import com.outsidesource.outsidesourceweatherapp.util.Outcome
import kotlinx.coroutines.delay
import java.util.regex.Pattern

internal val users: Map<String, String> = mapOf("test@test.com" to "password1234")

data class User(val email: String)

enum class AuthError {
    InvalidUser,
    InvalidEmail,
    InvalidPassword
}

val emailPattern: Pattern = Pattern.compile(
    ("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
            "\\@" +
            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
            "(" +
            "\\." +
            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
            ")+")
)

class Auth {
    companion object {
        suspend fun login(email: String, password: String): Outcome<User> {
            if (!emailPattern.matcher(email).matches()) return Outcome.Error(AuthError.InvalidEmail)
            delay(1000)
            if (!users.containsKey(email)) return Outcome.Error(AuthError.InvalidUser)
            if (users[email] != password) return Outcome.Error(AuthError.InvalidPassword)
            return Outcome.Ok(User(email = email))
        }
    }
}