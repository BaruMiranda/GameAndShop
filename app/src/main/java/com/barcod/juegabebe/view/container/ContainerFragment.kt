package com.barcod.juegabebe.view.container

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.barcod.juegabebe.R
import com.barcod.juegabebe.databinding.FragmentContainerBinding
import com.barcod.juegabebe.view.main.MainActivity


class ContainerFragment : Fragment() {

    private var _binding: FragmentContainerBinding? = null
    private val binding get() = _binding!!

    fun newInstance(): ContainerFragment {
        return ContainerFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentContainerBinding.inflate(inflater, container, false)
        confIU()
        return binding.root
    }

    private fun confIU() {
        binding.todito.setOnClickListener {
            (activity as MainActivity?)!!.verToditoFragment()

        }
    }

}