package com.barcod.juegabebe.view.container.threegame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.barcod.juegabebe.databinding.FragmentSiHaTodoBinding


class SiHaTodoFragment : Fragment() {

    private var _binding: FragmentSiHaTodoBinding? = null
    private val binding get() = _binding!!

    fun newInstance(): SiHaTodoFragment {
        return SiHaTodoFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSiHaTodoBinding.inflate(inflater, container, false)
        confIU()
        return binding.root
    }

    private fun confIU() {

    }

}