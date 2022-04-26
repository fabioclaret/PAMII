package com.example.interfaces;

import android.util.Log;

public class Cliente implements iCrud {
    private static final String TAG = "CRUD" ;
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void incluir() {
        Log.i(TAG, "incluir: Incluir Cliente "+ getNome());
    }

    @Override
    public void alterar() {
        Log.i(TAG, "alterar: Alterar Cliente");

    }

    @Override
    public void deletar() {
        Log.i(TAG, "deletar: Deletar Cliente ");

    }

    @Override
    public void listar() {

        Log.i(TAG, "listar: Listar Clientes");
    }
}
