package com.outsidesource.outsidesourceweatherapp.ui.login

import androidx.fragment.app.Fragment
import com.outsidesource.outsidesourceweatherapp.R
import org.koin.androidx.viewmodel.ext.android.viewModel


class LoginFragment: Fragment(R.layout.login_fragment) {
    val viewModel: LoginViewModel by viewModel()
}