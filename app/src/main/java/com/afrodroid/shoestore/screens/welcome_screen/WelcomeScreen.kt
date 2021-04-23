package com.afrodroid.shoestore.screens.welcome_screen

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.afrodroid.shoestore.R
import com.afrodroid.shoestore.databinding.WelcomeScreenBinding
import timber.log.Timber

class WelcomeScreen : Fragment() {

    companion object {
        fun newInstance() = WelcomeScreen()
    }

    private var _binding: WelcomeScreenBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: WelcomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = WelcomeScreenBinding.inflate(inflater, container, false)

        binding.instuctionScreenButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_welcomeScreen_to_instructionScreen
            )
        )


        return binding.root


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WelcomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Timber.i("binding object set to null")
    }
}