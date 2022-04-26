package com.example.interfaces;

import android.util.Log;

public class Produto implements iCrud {
    private static final String TAG = "CRUD";
    private String nomeProduto;
    private String fornecedor;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public void incluir() {

    }

    @Override
    public void alterar() {

    }

    @Override
    public void deletar() {
        Log.i(TAG, "deletar: Deletar Produto");       
    }

    @Override
    public void listar() {
        Log.i(TAG, "listar: Listar Produto");
    }
}
