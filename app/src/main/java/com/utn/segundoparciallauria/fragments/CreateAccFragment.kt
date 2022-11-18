package com.utn.segundoparciallauria.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.utn.segundoparciallauria.R
import com.utn.segundoparciallauria.databinding.FragmentCreateAccBinding
import com.utn.segundoparciallauria.viewmodels.CreateAccViewModel

class CreateAccFragment : Fragment() {

    companion object {
        fun newInstance() = CreateAccFragment()
    }

    private lateinit var binding : FragmentCreateAccBinding
    private val viewModel: CreateAccViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateAccBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
    }
}