package com.afrodroid.shoestore.screens.shoelist_screen

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.afrodroid.shoestore.R
import com.afrodroid.shoestore.databinding.InstructionScreenFragmentBinding
import com.afrodroid.shoestore.databinding.ShoeListScreenFragmentBinding
import timber.log.Timber

class ShoeListScreen : Fragment() {

    companion object {
        fun newInstance() = ShoeListScreen()
    }

    private var _binding: ShoeListScreenFragmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: ShoeListScreenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ShoeListScreenFragmentBinding.inflate(inflater, container, false)

        //Launch ShoeDetail Screen
        binding.shoeDetailButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_shoeListScreen_to_shoeDetailFragment
            )
        )


        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ShoeListScreenViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Timber.i("binding object set to null")
    }
}