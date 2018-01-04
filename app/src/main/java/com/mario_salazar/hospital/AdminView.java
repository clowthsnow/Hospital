package com.mario_salazar.hospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AdminView extends AppCompatActivity implements Admin.View {

    private Admin.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        presenter= new AdminPresenter(this);
    }

    public void registrarDoctor(View view) {
        presenter.chooseOption("doctor");
    }
    public void registrarEnfermera(View view) {
        presenter.chooseOption("enfermera");
    }
    public void registrarPaciente(View view) {
        presenter.chooseOption("paciente");
    }
    public void cerrar(){
        Intent intent = new Intent(this, LoginView.class);
        // prg.setProgress(25);
        startActivity(intent);
    }

    @Override
    public void showOption(int status) {
        if(status==1){
            Intent siguiente= new Intent(AdminView.this, RegistroDocView.class);
            startActivity(siguiente);
        }else if(status==2){
            Intent siguiente= new Intent(AdminView.this, RegistroEnfView.class);
            startActivity(siguiente);
        }else if(status==3){
            Intent siguiente= new Intent(AdminView.this, RegistroPacView.class);
            startActivity(siguiente);
        }else{
            Toast.makeText(getApplicationContext(),"Opcion Incorrecta",Toast.LENGTH_LONG).show();
        }
    }
}
