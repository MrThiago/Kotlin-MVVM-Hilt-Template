package com.mrthiago.kotlinmvvmhilttemplate.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mrthiago.kotlinmvvmhilttemplate.R
import com.mrthiago.kotlinmvvmhilttemplate.databinding.MainActivityBinding
import com.mrthiago.kotlinmvvmhilttemplate.ui.main.MainFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }
}