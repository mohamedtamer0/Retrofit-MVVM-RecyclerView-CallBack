package com.example.retrofit_mvvm_recyclerview_callback.data;

import com.example.retrofit_mvvm_recyclerview_callback.pojo.PostModel;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostClient {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
    private PostInterface postInterface;

    private static PostClient INSTANCE;

    public PostClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        postInterface = retrofit.create(PostInterface.class);
    }

    public static PostClient getINSTANCE() {
        if (null == INSTANCE) {
            INSTANCE = new PostClient();
        }
        return INSTANCE;
    }

    public Single<List<PostModel>> getPosts() {
        return postInterface.getPosts();
    }

}
