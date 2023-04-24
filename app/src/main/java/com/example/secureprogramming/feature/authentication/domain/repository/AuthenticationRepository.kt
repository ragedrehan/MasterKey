package com.example.secureprogramming.feature.authentication.domain.repository

import com.example.secureprogramming.feature.authentication.domain.model.UserDomainModel
import com.example.secureprogramming.feature.authentication.domain.model.UserSignInRequestDomainModel
import com.example.secureprogramming.feature.authentication.domain.model.UserSignUpRequestDomainModel

interface AuthenticationRepository {

    suspend fun signIn(data : UserSignInRequestDomainModel) : UserDomainModel


    suspend fun signUp(data : UserSignUpRequestDomainModel) : UserDomainModel


    suspend fun logout()
}