package com.utn.segundoparciallauria.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.utn.segundoparciallauria.R
import com.utn.segundoparciallauria.databinding.FragmentBthBinding
import com.utn.segundoparciallauria.viewmodels.BthViewModel

class BthFragment : Fragment() {

    companion object {
        fun newInstance() = BthFragment()
    }

    private lateinit var binding : FragmentBthBinding
    private val viewModel: BthViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBthBinding.inflate(inflater, container, false)
        val view = requireActivity().findViewById<BottomNavigationView>(R.id.bottomBar)
        view.visibility = View.VISIBLE
        return binding.root
    }

    override fun onStart() {
        super.onStart()
    }

}