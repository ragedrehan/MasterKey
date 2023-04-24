package com.example.secureprogramming.feature.authentication.data.repository.datasource

import com.example.secureprogramming.feature.authentication.data.model.UserDataModel
import com.example.secureprogramming.feature.authentication.data.model.UserSignInRequestDataModel
import com.example.secureprogramming.feature.authentication.data.model.UserSignUpRequestDataModel

interface AuthenticationSource {

    suspend fun signIn(data : UserSignInRequestDataModel) : UserDataModel


    suspend fun signUp(data : UserSignUpRequestDataModel) : UserDataModel


    suspend fun logout()

}