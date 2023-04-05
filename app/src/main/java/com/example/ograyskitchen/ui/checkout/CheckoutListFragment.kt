package com.example.ograyskitchen.ui.checkout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ograyskitchen.R
import com.example.ograyskitchen.data.stateholder.CheckoutListViewModel
import com.example.ograyskitchen.data.stateholder.CustomAdapterCheckoutList
import com.example.ograyskitchen.data.stateholder.CustomAdapterFood
import com.example.ograyskitchen.data.stateholder.FoodItemsViewModel
import com.example.ograyskitchen.databinding.FragmentCheckoutListBinding

class CheckoutListFragment : Fragment() {
    //fragment viewBiding

    private var _binding: FragmentCheckoutListBinding ?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCheckoutListBinding.inflate(inflater, container, false)
        val view = binding.root

        //get recyclerView
        val recyclerView = binding.checkoutRV

        //this creates a vertical layout manager
        recyclerView.layoutManager = LinearLayoutManager(activity)

        //arrray list of checkoutItemsViewModel()
        val data = ArrayList<CheckoutListViewModel>()

        //this loop will create 10 views containing
        //image with the count of view
        for (i in 1..5)
            data.add(
                CheckoutListViewModel(
                    R.drawable.restaurant,
                    "Food items " + 1, "R150", 10
                )
            )

        //This will pass the array List to our adapter
        val adapter = CustomAdapterCheckoutList(data)

        //setting the adapter with the recyclerView
        recyclerView.adapter = adapter

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}