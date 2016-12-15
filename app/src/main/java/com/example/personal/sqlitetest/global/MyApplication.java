package com.example.personal.sqlitetest.global;

import android.app.Application;
import android.content.Context;

/**
 * Created by dell on 2016/12/15.
 */
public class MyApplication extends Application {

    private Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public Context getmContext() {
        return mContext;
    }
}
