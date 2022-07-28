package com.zls.androidtemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.*
import com.zls.androidtemplate.databinding.ActivityMainBinding
import com.zls.androidtemplate.presentation.post.viewmodel.PostViewModel
import com.zls.androidtemplate.utils.Resource
import dagger.hilt.android.AndroidEntryPoint


private const val TAG = "MainActivity"

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val postViewModel : PostViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        lifecycleScope.launchWhenStarted {
            postViewModel.posts.collect {
                when (it) {
                    is Resource.Success -> {
                        Toast.makeText(
                            this@MainActivity,
                            "Data successfully fetched",
                            Toast.LENGTH_LONG
                        ).show()
                        Log.d(TAG, "success response is " + it.data)
                    }
                    is Resource.Error -> {
                        Toast.makeText(this@MainActivity, it.message.toString(), Toast.LENGTH_LONG)
                            .show()
                    }
                    is Resource.Loading -> {
                        if (it.isLoading) {
                            binding.progressBar.visibility = View.VISIBLE
                        } else {
                            binding.progressBar.visibility = View.GONE
                        }
                    }
                }
            }
        }
    }
}