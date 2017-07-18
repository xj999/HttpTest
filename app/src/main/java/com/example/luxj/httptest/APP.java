package com.example.luxj.httptest;

import android.app.Application;

import com.lzy.okgo.OkGo;

/**
 * @author Luxj
 * @date create 2017/7/18
 * @description
 */
public class APP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        OkGo.getInstance().init(this);
    }
}
