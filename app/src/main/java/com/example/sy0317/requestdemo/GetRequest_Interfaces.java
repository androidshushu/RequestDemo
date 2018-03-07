package com.example.sy0317.requestdemo;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2018/3/7.
 */

public interface GetRequest_Interfaces {
    @POST("ajax.php?a=fy&f=auto&t=auto&w=hello%20China")
    Call<Translations> getCall();
    @POST("apkversion.php?plat=s00&channel=s02")
    Call<Translation> getCalls();
}
