package com.example.sharedpreferences;

import static com.example.sharedpreferences.AppUtil.PREF_NOME;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity<contato> extends AppCompatActivity {
    EditText senha, email;
    Button btnEntrar;
    CheckBox entrar;
    boolean checkLembrar;

    private static final String TAG = "Meu_APP";
    private static final String PREF_NOME = "Meu_APP_pref";

    SharedPreferences preferences;
    SharedPreferences.Editor dados;

    String putSenha, putEmail;

    Contato contato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFormulario();

        Log.i(TAG, "onCreate: Rodando ok...");


        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textEmail, textSenha;

                boolean isValido = validarDados();

                if (isValido) {
                    textEmail = email.getText().toString();
                    textSenha = senha.getText().toString();

                    checkLembrar = entrar.isChecked();

                    if (checkLembrar) {
                        preferences = getSharedPreferences(PREF_NOME, Context.MODE_PRIVATE);
                        Log.i(TAG, "onCreate: Pasta Shared criada...");

                        String senhaPref, emailPref;

                        dados = preferences.edit();

                        emailPref = "fabioclaret@gmail.com";
                        senhaPref = "admin";

                        dados.putString("email",emailPref);
                        dados.putString("senha", senhaPref);

                        dados.apply();

                        Log.i(TAG, "onCreate: Dados para serem salvos...:" );
                        Log.w(TAG, "onCreate: Email: "+emailPref);
                        Log.w(TAG, "onCreate: Senha: "+senhaPref);



                        String prefEmail = preferences.getString("email","");
                        String prefSenha = preferences.getString("senha","");

                        Contato contato = new Contato();
                        contato.setEmail(textEmail);
                        contato.setSenha(textSenha);
                        String email = contato.getEmail().toString();
                        String senha = contato.getSenha().toString();

                        if (email.equals(prefEmail) && senha.equals(prefSenha)) {
                            if (AppUtil.existeContato) {
                                Toast.makeText(MainActivity.this, "Usuario Checado com sucesso!", Toast.LENGTH_SHORT).show();
                            }
                        }else {
                            int teste4 = 0;
                            Toast.makeText(MainActivity.this, "Usuario ou senha digitados errados!", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(MainActivity.this, "Clique  no checkbox para fazer o login", Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });

    }

    private void initFormulario() {
        senha     = findViewById(R.id.editTextSenha);
        email     = findViewById(R.id.editTextEmail);
        entrar    = findViewById(R.id.checkBox);
        btnEntrar = findViewById(R.id.buttonEntrar);
    }

    private boolean validarDados() {
        boolean retorno = true;

        if (TextUtils.isEmpty(email.getText().toString())) {
            email.setError("*");
            email.requestFocus();
            retorno = false;
        }

        if (TextUtils.isEmpty(senha.getText().toString())) {
            senha.setError("*");
            senha.requestFocus();
            retorno = false;
        }
        return retorno;
    }
}