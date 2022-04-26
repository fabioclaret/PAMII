package com.example.minhaideiadb.model;

import android.util.Log;

import com.example.minhaideiadb.api.AppUtil;
import com.example.minhaideiadb.controller.iCrud;

public class Cliente implements iCrud {

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
        Log.i(AppUtil.TAG, "incluir: Incluir Cliente "+ getNome());
    }

    @Override
    public void alterar() {
        Log.i(AppUtil.TAG, "alterar: Alterar Cliente");

    }

    @Override
    public void deletar() {
        Log.i(AppUtil.TAG, "deletar: Deletar Cliente ");

    }

    @Override
    public void listar() {

        Log.i(AppUtil.TAG, "listar: Listar Clientes");
    }
}
