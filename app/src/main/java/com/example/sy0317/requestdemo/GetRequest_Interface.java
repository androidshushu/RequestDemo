package com.example.sy0317.requestdemo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2018/3/5.
 */

public interface GetRequest_Interface {
    @POST("apkversion.php?plat=s00&channel=s02")
    Call<Translation> getCall();

}
