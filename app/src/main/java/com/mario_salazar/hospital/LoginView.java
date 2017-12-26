package com.mario_salazar.hospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.logging.LoggingMXBean;

public class LoginView extends AppCompatActivity implements Login.View {

    private EditText edUsuario;
    private EditText edContra;
    private TextView txtError;

    private Login.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edUsuario=(EditText) findViewById(R.id.userText);
        edContra=(EditText) findViewById(R.id.passText);
        txtError=(TextView) findViewById(R.id.error);
        presenter= new LoginPresenter(this);
    }

    public void iniciarClick(View view){
        presenter.login(edUsuario.getText().toString(),edContra.getText().toString());
    }

    @Override
    public void showLogin(String status) {
        if(status.equals("ok")){
            Intent siguiente= new Intent(LoginView.this, MainActivity.class);
            startActivity(siguiente);
        }else {
            //txtError.setText("Error al iniciar sesión");
            Toast.makeText(getApplicationContext(),"Usuario Incorrecto",Toast.LENGTH_LONG).show();
        }

    }
}
