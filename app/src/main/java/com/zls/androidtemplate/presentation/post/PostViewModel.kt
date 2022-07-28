package com.zls.androidtemplate.presentation.post.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zls.androidtemplate.domain.repository.SampleRepository
import com.zls.androidtemplate.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject constructor(
    private val repository: SampleRepository
) : ViewModel() {


    val posts: StateFlow<Resource<Any>> = flow {
        val result = try {
            repository.getPosts()
        } catch (e: Exception) {
            Resource.Error(e.localizedMessage)
        }
        emit(result)
        emit(Resource.Loading(false))

    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = Resource.Loading(true)
    )


}