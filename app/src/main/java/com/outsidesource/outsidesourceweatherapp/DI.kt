package com.outsidesource.outsidesourceweatherapp

import com.outsidesource.outsidesourceweatherapp.ui.forecast.ForecastViewModel
import com.outsidesource.outsidesourceweatherapp.ui.login.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val applicationModule = module {
    viewModel { ForecastViewModel() }
    viewModel { LoginViewModel() }
}