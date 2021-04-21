package com.afrodroid.shoestore.screens.login_screen

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.afrodroid.shoestore.R
import com.afrodroid.shoestore.databinding.LoginScreenFragmentBinding
import timber.log.Timber

class LoginScreen : Fragment() {

    companion object {
        fun newInstance() = LoginScreen()
    }

    private var _binding: LoginScreenFragmentBinding? = null
    private val binding get() = _binding!!


    private lateinit var viewModel: LoginScreenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = LoginScreenFragmentBinding.inflate(inflater,container, false)
        binding.loginButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_loginScreen_to_welcomeScreen))
        binding.loginWithExistingAccount.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_loginScreen_to_welcomeScreen))
        return binding.root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoginScreenViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Timber.i("binding object set to null")
    }
}