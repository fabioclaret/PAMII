package com.example.minhaideiadb.model;

import android.util.Log;

import com.example.minhaideiadb.api.AppUtil;
import com.example.minhaideiadb.controller.iCrud;

public class Produto implements iCrud {
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
        Log.i(AppUtil.TAG, "deletar: Deletar Produto");
    }

    @Override
    public void listar() {
        Log.i(AppUtil.TAG, "listar: Listar Produto");
    }
}
