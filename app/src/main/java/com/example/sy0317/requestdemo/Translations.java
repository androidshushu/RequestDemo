package com.example.sy0317.requestdemo;

import android.util.Log;

/**
 * Created by Administrator on 2018/3/7.
 */

public class Translations {
    private int status;
    private content content;
    private static class  content{
        private String from;
        private String to;
        private String vendor;
        private String out;
        private int errNo;
    }
    //定义输出返回数据的方法
    public void showLog (){
        Log.d("Translations","status = "+status);
        Log.d("Translations","from = "+content.from);
        Log.d("Translations","to = "+content.to);
        Log.d("Translations","vendor = "+content.vendor);
        Log.d("Translations","out = "+content.out);
        Log.d("Translations","errNo = "+content.errNo);
        Log.d("Translations","success");
    }

}
