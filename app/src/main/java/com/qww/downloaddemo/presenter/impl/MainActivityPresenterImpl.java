package com.qww.downloaddemo.presenter.impl;

import android.util.Log;

import com.qww.downloaddemo.model.Api;
import com.qww.downloaddemo.model.domain.PostWithParamsResult;
import com.qww.downloaddemo.model.domain.PostWithParamsResult.ShowapiResBodyBean.PagebeanBean;
import com.qww.downloaddemo.presenter.IMainActivityPresenter;
import com.qww.downloaddemo.utils.RetrofitManager;
import com.qww.downloaddemo.view.IMainActivityCallback;

import java.net.HttpURLConnection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityPresenterImpl implements IMainActivityPresenter {

    private IMainActivityCallback callback = null;

    @Override
    public void requestData() {
        Api api = RetrofitManager.getInstance().getRetrofit().create(Api.class);
        Call<PostWithParamsResult> task = api.postWithParam("206023",
                "093d0688540b4c4fafd2567822dec6bf",
                "20200512144439",
                "0");
        task.enqueue(new Callback<PostWithParamsResult>() {
            @Override
            public void onResponse(Call<PostWithParamsResult> call, Response<PostWithParamsResult> response) {
                int code = response.code();
                if (code == HttpURLConnection.HTTP_OK) {
                    PostWithParamsResult postWithParamsResult = response.body();
                    PagebeanBean pagebean = postWithParamsResult.getShowapi_res_body().getPagebean();
                    if (postWithParamsResult != null) {
                        Log.d("MainPresenterImpl", postWithParamsResult.toString());
                        Log.d("MainPresenterImpl", pagebean.toString());
                        if (callback != null) {
                            callback.onDataLoaded(pagebean);
                        }
                    }
                }else {
                    Log.d("MainPresenterImpl", "请求失败, code:" + code);
                }
            }

            @Override
            public void onFailure(Call<PostWithParamsResult> call, Throwable t) {
                Log.d("MainPresenterImpl", t.toString());
            }
        });
    }

    @Override
    public void registerCallback(IMainActivityCallback callback) {
        this.callback = callback;
    }

    @Override
    public void unRegisterCallback(IMainActivityCallback callback) {
        callback = null;
    }
}
