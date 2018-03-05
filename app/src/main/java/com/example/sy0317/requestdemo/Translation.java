package com.example.sy0317.requestdemo;

import android.util.Log;

/**
 * Created by Administrator on 2018/3/5.
 * 请求结果处理类，请求的结果出来以后就直接取出来进行处理做成一个对象然后给对应的字段赋值。
 */

public class Translation {
    private String serverUrl;
    private String serverVersion;
//    private content content;
//    private static class content {
//        private String serverUrl;
//        private String serverVersion;
//    }
    public void  show(){
        Log.d("showResult","serverUrl="+serverUrl);
        Log.d("showResult","serverVersion="+serverVersion);

    }

}
