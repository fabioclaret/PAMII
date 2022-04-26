package com.example.minhaideiadb.view;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.minhaideiadb.R;
import com.example.minhaideiadb.api.AppUtil;
import com.example.minhaideiadb.controller.ClienteController;
import com.example.minhaideiadb.model.Cliente;
import com.example.minhaideiadb.model.Produto;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(AppUtil.TAG, "onCreate: App Minha Ideia DataBase");
        int i = 0;
        int teste = 5;
        int teste2 = 2;
        clienteController = new ClienteController(getApplicationContext());

    }
}