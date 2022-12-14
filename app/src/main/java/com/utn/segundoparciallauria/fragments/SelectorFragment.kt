package com.utn.segundoparciallauria.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.utn.segundoparciallauria.R
import com.utn.segundoparciallauria.databinding.FragmentAvatarBinding
import com.utn.segundoparciallauria.databinding.FragmentSelectorBinding

class SelectorFragment : Fragment() {
    private lateinit var binding : FragmentSelectorBinding
    private val viewModel: SelectorViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSelectorBinding.inflate(inflater, container, false)

        val view = requireActivity().findViewById<BottomNavigationView>(R.id.bottomBar)
        view.visibility = View.INVISIBLE

        return binding.root
    }

    override fun onStart() {
        super.onStart()

        binding.btnRealTime.setOnClickListener {
            val action = SelectorFragmentDirections.actionSelectorFragmentToBthActivity()
            findNavController().navigate(action)
        }

        binding.btnHistory.setOnClickListener {
            val action = SelectorFragmentDirections.actionSelectorFragmentToListFragment()
            findNavController().navigate(action)
        }
    }
}