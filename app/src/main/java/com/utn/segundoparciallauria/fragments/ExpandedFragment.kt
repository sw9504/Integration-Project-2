package com.utn.segundoparciallauria.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.utn.segundoparciallauria.R
import com.utn.segundoparciallauria.databinding.FragmentExpandedBinding
import com.utn.segundoparciallauria.viewmodels.ExpandedViewModel

class ExpandedFragment : Fragment() {

    companion object {
        fun newInstance() = ExpandedFragment()
    }

    private val viewModel: ExpandedViewModel by viewModels()
    private lateinit var binding : FragmentExpandedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExpandedBinding.inflate(inflater, container, false)

        val view = requireActivity().findViewById<BottomNavigationView>(R.id.bottomBar)
        view.visibility = View.INVISIBLE

        return binding.root
    }

}