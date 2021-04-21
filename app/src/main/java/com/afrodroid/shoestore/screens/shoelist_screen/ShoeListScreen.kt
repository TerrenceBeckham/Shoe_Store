package com.afrodroid.shoestore.screens.shoelist_screen

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.afrodroid.shoestore.R

class ShoeListScreen : Fragment() {

    companion object {
        fun newInstance() = ShoeListScreen()
    }

    private lateinit var viewModel: ShoeListScreenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.shoe_list_screen_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ShoeListScreenViewModel::class.java)
        // TODO: Use the ViewModel
    }

}