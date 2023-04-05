package com.example.ograyskitchen.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ograyskitchen.R
import com.example.ograyskitchen.data.stateholder.CustomAdapterFood
import com.example.ograyskitchen.data.stateholder.FoodItemsViewModel
import com.example.ograyskitchen.database.FoodItemDatabase
import com.example.ograyskitchen.database.FoodItemViewModel
import com.example.ograyskitchen.database.FoodItemViewModelFactory
import com.example.ograyskitchen.databinding.FragmentDessertBinding

class DessertFragment : Fragment() {
    //fragment viewBiding
    private var _binding: FragmentDessertBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDessertBinding.inflate(inflater, container, false)
        val view = binding.root


        val application = requireNotNull(this.activity).application
        val dao = FoodItemDatabase.getInstance(application).foodItemDao()
        val viewModelFactory = FoodItemViewModelFactory(dao)
        val viewModel = ViewModelProvider(
            this, viewModelFactory).get(FoodItemViewModel::class.java)

        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner


        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}