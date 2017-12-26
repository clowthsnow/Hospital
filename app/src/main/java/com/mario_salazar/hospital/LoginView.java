package com.mario_salazar.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginView extends AppCompatActivity {

    private EditText edUsuario;
    private EditText edContra;
    private Button btIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edUsuario=(EditText) findViewById(R.id.userText);
        edContra=(EditText) findViewById(R.id.passText);
        btIngresar=(Button)findViewById(R.id.btnLogin);
    }

    public void iniciarClick(View view){

    }
}
