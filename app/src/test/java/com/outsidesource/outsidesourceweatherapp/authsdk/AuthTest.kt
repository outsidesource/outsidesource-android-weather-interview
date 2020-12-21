package com.outsidesource.outsidesourceweatherapp.authsdk

import com.outsidesource.outsidesourceweatherapp.util.Outcome
import kotlinx.coroutines.runBlocking
import org.junit.Test

class AuthTest {
    @Test
    fun invalidEmail() = runBlocking {
        val result = Auth.login("test", "blah")
        assert(result is Outcome.Error && result.error == AuthError.InvalidEmail)
    }

    @Test
    fun invalidUser() = runBlocking {
        val result = Auth.login("example@example.com", "blah")
        assert(result is Outcome.Error && result.error == AuthError.InvalidUser)
    }

    @Test
    fun invalidPassword() = runBlocking {
        val result = Auth.login("test@test.com", "blah")
        assert(result is Outcome.Error && result.error == AuthError.InvalidPassword)
    }

    @Test
    fun success() = runBlocking {
        val result = Auth.login("test@test.com", "password1234")
        assert(result is Outcome.Ok && result.value.email == "test@test.com")
    }
}