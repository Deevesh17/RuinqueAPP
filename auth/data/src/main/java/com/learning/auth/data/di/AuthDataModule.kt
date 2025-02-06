package com.learning.auth.data.di

import com.example.auth.domain.AuthRepository
import com.learning.auth.data.EmailPatternValidator
import com.example.auth.domain.PatternValidator
import com.example.auth.domain.UserDataValidator
import com.learning.auth.data.AuthRepositoryImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val authDataModule = module {
    single<PatternValidator> {
        EmailPatternValidator
    }
    singleOf(::UserDataValidator)
    singleOf(::AuthRepositoryImpl).bind<AuthRepository>()
}