package com.example.ograyskitchen.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ograyskitchen.R

/**
 * A simple [Fragment] subclass.
 * Use the [StartersFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StartersFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(com.example.ograyskitchen.ARG_PARAM1)
            param2 = it.getString(com.example.ograyskitchen.ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_starters, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment StartersFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            StartersFragment().apply {
                arguments = Bundle().apply {
                    putString(com.example.ograyskitchen.ARG_PARAM1, param1)
                    putString(com.example.ograyskitchen.ARG_PARAM2, param2)
                }
            }
    }
}