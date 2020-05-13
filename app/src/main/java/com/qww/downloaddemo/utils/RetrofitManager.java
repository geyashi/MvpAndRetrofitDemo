package com.qww.downloaddemo.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://route.showapi.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    public static Retrofit getRetrofit() {
        return retrofit;
    }
}
