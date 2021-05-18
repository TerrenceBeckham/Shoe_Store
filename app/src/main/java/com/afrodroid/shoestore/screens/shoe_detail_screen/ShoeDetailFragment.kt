package com.afrodroid.shoestore.screens.shoe_detail_screen

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.afrodroid.shoestore.R
import com.afrodroid.shoestore.databinding.ShoeDetailFragmentBinding

class ShoeDetailFragment : Fragment() {

    companion object {
        fun newInstance() = ShoeDetailFragment()
    }

    private var _binding: ShoeDetailFragmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: ShoeDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ShoeDetailFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ShoeDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}