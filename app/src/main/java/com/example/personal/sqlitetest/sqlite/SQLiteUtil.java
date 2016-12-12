package com.example.personal.sqlitetest.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by dell on 2016/12/12.
 */
public class SQLiteUtil {

    Context mContext;
    SQLiteDatabase db;

    public SQLiteUtil(Context context,String dbName){
        mContext = context;
        db = mContext.openOrCreateDatabase(dbName, Context.MODE_PRIVATE,null);
    }

    public void insert(){

    }

}
