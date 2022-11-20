package com.utn.segundoparciallauria.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.utn.segundoparciallauria.R
import com.utn.segundoparciallauria.adapters.ValueAdapter
import com.utn.segundoparciallauria.databinding.FragmentListBinding
import com.utn.segundoparciallauria.entities.Value
import com.utn.segundoparciallauria.viewmodels.ListViewModel

class ListFragment : Fragment() {

    companion object {
        fun newInstance() = ListFragment()
    }

    private lateinit var binding : FragmentListBinding
    private val viewModel: ListViewModel by viewModels()

    var valueList : MutableList<Value> = mutableListOf()
    lateinit var adapter : ValueAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(inflater, container, false)
        val view = requireActivity().findViewById<BottomNavigationView>(R.id.bottomBar)
        view.visibility = View.VISIBLE

        valueList.add(Value("1234","domingo",
            29,49,"aaaa",
            30,48,"aaaaa"
        ))
        valueList.add(Value("12345","domingo",
            29,49,"aaaa",
            30,48,"aaaaa"
        ))
        valueList.add(Value("1234","domingo",
            29,49,"aaaa",
            30,48,"aaaaa"
        ))

        return binding.root
    }

    override fun onStart() {
        super.onStart()

        adapter = ValueAdapter(valueList) { position ->
            var action = ListFragmentDirections.actionListFragmentToExpandedFragment()
            findNavController().navigate(action)
        }
        binding.recValue.layoutManager = LinearLayoutManager(requireContext())
        binding.recValue.adapter = adapter
    }
}