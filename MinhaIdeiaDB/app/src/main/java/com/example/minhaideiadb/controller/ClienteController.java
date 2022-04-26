package com.example.minhaideiadb.controller;

import android.content.Context;
import android.util.Log;

import com.example.minhaideiadb.api.AppUtil;
import com.example.minhaideiadb.datasource.AppDataBase;

public class ClienteController extends AppDataBase {
    public ClienteController(Context context) {
        super(context);
        Log.d(AppUtil.TAG, "ClienteController: Conectado");
    }
}
