package com.utn.segundoparciallauria.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.utn.segundoparciallauria.R
import com.utn.segundoparciallauria.databinding.FragmentLoginBinding
import com.utn.segundoparciallauria.viewmodels.LoginViewModel


class LoginFragment : Fragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }
    private lateinit var binding : FragmentLoginBinding
    private val viewModel: LoginViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentLoginBinding.inflate(inflater,container,false)

        val view = requireActivity().findViewById<BottomNavigationView>(R.id.bottomBar)
        view.visibility = View.INVISIBLE

        return binding.root
    }

    override fun onStart() {
        super.onStart()

        binding.btnLogin.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToSelectorFragment()
            findNavController().navigate(action)
        }

        binding.txtCreateAcc.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToCreateAccFragment()
            findNavController().navigate(action)
        }

        binding.txtRecovery.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToRecoveryFragment()
            findNavController().navigate(action)
        }
    }

}