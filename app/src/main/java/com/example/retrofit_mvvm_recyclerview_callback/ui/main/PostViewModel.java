package com.example.retrofit_mvvm_recyclerview_callback.ui.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


import com.example.retrofit_mvvm_recyclerview_callback.data.PostClient;
import com.example.retrofit_mvvm_recyclerview_callback.pojo.PostModel;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

import io.reactivex.schedulers.Schedulers;


public class PostViewModel extends ViewModel {
    MutableLiveData<List<PostModel>> postsMutableLiveData = new MutableLiveData<>();

    public void getPosts(){
        Single<List<PostModel>> observable = PostClient.getINSTANCE().getPosts()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

        observable.subscribe(o -> postsMutableLiveData.setValue(o));


    }

}

