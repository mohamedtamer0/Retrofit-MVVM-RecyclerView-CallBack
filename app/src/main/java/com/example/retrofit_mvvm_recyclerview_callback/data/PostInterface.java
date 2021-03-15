package com.example.retrofit_mvvm_recyclerview_callback.data;

import com.example.retrofit_mvvm_recyclerview_callback.pojo.PostModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostInterface {
    @GET("Posts")
    public Call<PostModel> getPosts();

}
