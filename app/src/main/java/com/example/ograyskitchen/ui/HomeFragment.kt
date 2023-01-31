package com.example.ograyskitchen.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.ograyskitchen.R
import com.example.ograyskitchen.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    //fragment viewBinding
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view



        binding.cvStarters.setOnClickListener{
            view.findNavController()
                .navigate(R.id.action_homeFragment_to_startersFragment)
        }

        binding.cvSpecials.setOnClickListener{
            view.findNavController()
                .navigate(R.id.action_homeFragment_to_specialsFragment)
        }

        binding.cvDesserts.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_homeFragment_to_dessertsFragment)
        }

        binding.cvMains.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_homeFragment_to_mainsFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}