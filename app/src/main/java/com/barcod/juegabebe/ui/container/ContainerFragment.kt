package com.barcod.juegabebe.ui.container

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.viewModels
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.barcod.juegabebe.data.model.response.CategoryResponse
import com.barcod.juegabebe.databinding.FragmentContainerBinding
import com.barcod.juegabebe.ui.main.MainActivity
import com.barcod.juegabebe.util.*
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ContainerFragment : Fragment() {

    private var _binding: FragmentContainerBinding? = null
    private val binding get() = _binding!!

    private val categoryViewModel: CategoryViewModel by viewModels()

    private lateinit var  listCategory : List<CategoryResponse>

    fun newInstance(): ContainerFragment {
        return ContainerFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentContainerBinding.inflate(inflater, container, false)
        confIU()
        observer()
        return binding.root
    }

    private fun observer() {

        categoryViewModel.itemCategoryLiveData.observe(viewLifecycleOwner) {
            if (it != null) {
                listCategory = it
            }
        }

    }

    private fun confIU() {

        categoryViewModel.getCategory()

        binding.todito.setOnClickListener {
            IDCATEGORY = listCategory[2].id.toString()
            DESCRIPTIONCATEGORY = listCategory[2].descripcion
            (activity as MainActivity?)!!.verToditoFragment()
        }

    }

}