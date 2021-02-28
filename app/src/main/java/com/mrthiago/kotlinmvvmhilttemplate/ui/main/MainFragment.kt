package com.mrthiago.kotlinmvvmhilttemplate.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.bumptech.glide.RequestManager
import com.mrthiago.kotlinmvvmhilttemplate.R
import com.mrthiago.kotlinmvvmhilttemplate.databinding.MainFragmentBinding
import com.mrthiago.kotlinmvvmhilttemplate.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }
    private lateinit var binding: MainFragmentBinding
    private val viewModel: MainViewModel by viewModels()

    @Inject
    lateinit var glide: RequestManager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Use the ViewModel

        (viewModel.helloWorld + " - MainFragment").also { binding.message.text = it }
        glide.load(R.drawable.architecture).into(binding.imageView)
    }

}