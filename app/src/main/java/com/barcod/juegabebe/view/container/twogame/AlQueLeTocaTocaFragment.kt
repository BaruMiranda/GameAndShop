package com.barcod.juegabebe.view.container.twogame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.barcod.juegabebe.databinding.FragmentAlQueLeTocaTocaBinding


class AlQueLeTocaTocaFragment : Fragment() {

    private var _binding: FragmentAlQueLeTocaTocaBinding? = null
    private val binding get() = _binding!!

    fun newInstance(): AlQueLeTocaTocaFragment {
        return AlQueLeTocaTocaFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAlQueLeTocaTocaBinding.inflate(inflater, container, false)
        confIU()
        return binding.root
    }

    private fun confIU() {

    }

}