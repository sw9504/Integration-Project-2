package com.utn.segundoparciallauria.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.utn.segundoparciallauria.R
import com.utn.segundoparciallauria.databinding.FragmentAvatarBinding
import com.utn.segundoparciallauria.viewmodels.AvatarViewModel
import androidx.fragment.app.viewModels as viewModels

class AvatarFragment : Fragment() {

    companion object {
        fun newInstance() = AvatarFragment()
    }

    private lateinit var binding: FragmentAvatarBinding
    private val viewModel: AvatarViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAvatarBinding.inflate(inflater, container, false)
        val view = requireActivity().findViewById<BottomNavigationView>(R.id.bottomBar)
        view.visibility = View.VISIBLE
        return binding.root
    }

    override fun onStart() {
        super.onStart()
    }

}