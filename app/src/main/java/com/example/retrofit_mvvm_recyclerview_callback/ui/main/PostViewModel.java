package com.example.retrofit_mvvm_recyclerview_callback.ui.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.retrofit_mvvm_recyclerview_callback.pojo.PostModel;

import java.util.List;

public class PostViewModel extends ViewModel {
    MutableLiveData<List<PostModel>> postsMutableLiveData = new MutableLiveData<>();

    public void getPosts(){}

}

