package com.qww.downloaddemo.model;

import com.qww.downloaddemo.model.domain.PostWithParamsResult;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface Api {

    @FormUrlEncoded
    @POST("/126-2")
    Call<PostWithParamsResult> postWithParam(@Field("showapi_appid") String showApiAppId,
                                             @Field("showapi_sign") String showApiSign,
                                             @Field("showapi_timestamp") String showApiTimestamp,
                                             @Field("showapi_res_gzip") String showApiResGzip);
}
