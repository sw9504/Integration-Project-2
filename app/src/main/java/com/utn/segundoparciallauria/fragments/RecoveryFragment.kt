package com.utn.segundoparciallauria.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.utn.segundoparciallauria.R
import com.utn.segundoparciallauria.databinding.FragmentRecoveryBinding
import com.utn.segundoparciallauria.viewmodels.RecoveryViewModel

class RecoveryFragment : Fragment() {

    companion object {
        fun newInstance() = RecoveryFragment()
    }

    private lateinit var binding : FragmentRecoveryBinding
    private val viewModel: RecoveryViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRecoveryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
    }

}