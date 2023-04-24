package com.example.secureprogramming.feature.authentication.data.repository.datasource

import android.widget.Toast
import com.example.secureprogramming.feature.authentication.data.model.UserDataModel
import com.example.secureprogramming.feature.authentication.data.model.UserSignInRequestDataModel
import com.example.secureprogramming.feature.authentication.data.model.UserSignUpRequestDataModel
import com.google.firebase.auth.FirebaseAuth

class AuthenticationDataSource : AuthenticationSource {
    private lateinit var auth: FirebaseAuth

    override suspend fun signIn(data: UserSignInRequestDataModel): UserDataModel {
        auth = FirebaseAuth.getInstance()
        auth.signInWithEmailAndPassword(data.email, data.password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                } else {

                }
            }

        return UserDataModel(
            id = auth.currentUser!!.uid,
            name = auth.currentUser!!.displayName!!,
            email = auth.currentUser!!.email!!
        )
    }

    override suspend fun signUp(data: UserSignUpRequestDataModel): UserDataModel {
        auth = FirebaseAuth.getInstance()
        auth.createUserWithEmailAndPassword(data.email, data.password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                } else {
                }
            }

        return UserDataModel(
            id = auth.currentUser!!.uid,
            name = auth.currentUser!!.displayName!!,
            email = auth.currentUser!!.email!!
        )

    }

    override suspend fun logout() {
        auth = FirebaseAuth.getInstance()
        auth.signOut()
    }
}