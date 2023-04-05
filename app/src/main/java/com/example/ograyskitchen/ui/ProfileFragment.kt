package com.example.ograyskitchen.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ograyskitchen.R
import com.example.ograyskitchen.data.stateholder.CustomAdapterSettings
import com.example.ograyskitchen.data.stateholder.SettingsViewModel
import com.example.ograyskitchen.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    //fragment viewBinding
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val view = binding.root

        // get the recyclerview
        val recyclerView = binding.settingsRecycView

        recyclerView.layoutManager = LinearLayoutManager(activity)

        //Array list of class SettingsViewModel
        val data = ArrayList<SettingsViewModel>()

        //This will create 10 views containing a image with the count of view
        for (i in 1..5)
            data.add(
                SettingsViewModel(
                    R.drawable.restaurant,
                    "Settings"
                )
            )

        val adapter = CustomAdapterSettings(data)

        //Setting the adapter with the recycleView
        recyclerView.adapter = adapter

        return view
    }


}