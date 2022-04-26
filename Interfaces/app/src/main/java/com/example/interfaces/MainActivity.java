package com.example.interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Cliente objCliente;
    Produto objProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objCliente = new Cliente();
        objProduto = new Produto();

        objProduto.setNomeProduto("HD SSF 1 TB");
        objProduto.setFornecedor("Dell");

        objCliente.setNome("Fabio Claret");
        objCliente.setEmail("fabioclaret@gmail.com");

        objCliente.incluir();
        objCliente.alterar();

        objProduto.deletar();
        objProduto.listar();
    }
}