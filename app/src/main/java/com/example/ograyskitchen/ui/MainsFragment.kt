package com.example.ograyskitchen.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ograyskitchen.R
import com.example.ograyskitchen.data.stateholder.CustomAdapterFood
import com.example.ograyskitchen.data.stateholder.FoodItemsViewModel
import com.example.ograyskitchen.databinding.FragmentMainsBinding

class MainsFragment : Fragment() {

    //fragment viewBinding
    private var _binding: FragmentMainsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMainsBinding.inflate(inflater, container, false)
        val view = binding.root

        //get the recyclerView
        val recyclerView = binding.rvMains

        //this creates a vertical layout manager
        recyclerView.layoutManager = LinearLayoutManager(activity)

        //Array list of class ItemsViewModel)
        val data = ArrayList<FoodItemsViewModel>()

        //This loop will create 10 views containing
        //a image with the count of view
        for(i in 1..20)
            data.add(
                FoodItemsViewModel(
                    R.drawable.restaurant,
                    "Food items " + 1 , "R 120")
                )

        //This will pas the arrayList to our adapter
        val adapter = CustomAdapterFood(data)

        //Setting the Adapter with the recyclerView
        recyclerView.adapter = adapter

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}