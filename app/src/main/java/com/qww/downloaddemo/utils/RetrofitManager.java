package com.qww.downloaddemo.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {

    private static final RetrofitManager ourInstance = new RetrofitManager();
    private final Retrofit retrofit;
    public static RetrofitManager getInstance() {
        return ourInstance;
    }

    public RetrofitManager() {
        retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}
