package com.example.minhaideiadb.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.minhaideiadb.api.AppUtil;

public class AppDataBase extends SQLiteOpenHelper {

    public static final String DB_NAME = "APPMinhaIdeia.sqlite";
    public static final int VERSION = 1;

    public AppDataBase( Context context) {
        super(context, DB_NAME, null, VERSION);
        Log.d(AppUtil.TAG, "AppDataBase: Criando Conexao");
    }



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
