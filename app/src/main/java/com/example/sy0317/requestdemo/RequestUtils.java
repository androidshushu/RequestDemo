package com.example.sy0317.requestdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2018/3/5.
 */

public class RequestUtils {
    private static RequestUtils instance;
    public static RequestUtils getInstance(){
        if (instance == null){
            instance  = new RequestUtils();
        }
        return  instance;
    }
    public void request() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gw.yhsy.shiyuegame.com/api/") // 设置 网络请求 Url
                .addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
                .build();
        GetRequest_Interface request = retrofit.create(GetRequest_Interface.class);

        //对 发送请求 进行封装
        Call<Translation> call = request.getCall();
        //步骤6:发送网络请求(异步)
        //步骤6:发送网络请求(异步)
        call.enqueue(new Callback<Translation>() {
            //请求成功时回调
            @Override
            public void onResponse(Call<Translation> call, Response<Translation> response) {
                // 步骤7：处理返回的数据结果
                Log.d("onResponse","result = "+response);
                response.body().show();
            }

            //请求失败时回调
            @Override
            public void onFailure(Call<Translation> call, Throwable throwable) {
                System.out.println("连接失败");
            }
        });
    }
    public void requestFanyi(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://fy.iciba.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GetRequest_Interfaces request_interfaces = retrofit.create(GetRequest_Interfaces.class);
        Call<Translations> calls = request_interfaces.getCall();
        calls.enqueue(new Callback<Translations>() {
            @Override
            public void onResponse(Call<Translations> call, Response<Translations> response) {

                response.body().showLog();
            }

            @Override
            public void onFailure(Call<Translations> call, Throwable t) {
            Log.d("requestFanyi ","request onFailure");
            }
        });





    }
}
