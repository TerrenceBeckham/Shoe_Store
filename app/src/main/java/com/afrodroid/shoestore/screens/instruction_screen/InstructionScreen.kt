package com.afrodroid.shoestore.screens.instruction_screen

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.afrodroid.shoestore.R
import com.afrodroid.shoestore.databinding.InstructionScreenFragmentBinding
import com.afrodroid.shoestore.databinding.WelcomeScreenBinding
import timber.log.Timber

class InstructionScreen : Fragment() {

    companion object {
        fun newInstance() = InstructionScreen()
    }

    private var _binding: InstructionScreenFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: InstructionScreenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = InstructionScreenFragmentBinding.inflate(inflater, container, false)
        binding.shoeListButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_instructionScreen_to_shoeListScreen
            )
        )
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InstructionScreenViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Timber.i("binding object set to null")
    }
}