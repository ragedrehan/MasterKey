package com.example.secureprogramming.feature.authentication.data.mapper


import com.example.secureprogramming.feature.authentication.data.model.UserDataModel
import com.example.secureprogramming.feature.authentication.data.model.UserSignUpRequestDataModel
import com.example.secureprogramming.feature.authentication.domain.model.UserDomainModel
import com.example.secureprogramming.feature.authentication.domain.model.UserSignUpRequestDomainModel

class UserModelDataToDomainMapper {
    fun mapDomainToData(user: UserDataModel): UserDomainModel {
        return UserDomainModel(
            id = user.id,
            name = user.name,
            email = user.email
        )
    }
}
