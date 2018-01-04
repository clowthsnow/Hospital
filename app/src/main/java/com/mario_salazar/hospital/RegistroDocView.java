package com.mario_salazar.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class RegistroDocView extends AppCompatActivity {

    EditText codigoDoc;
    EditText nombreDoc;
    EditText dniDoc;
    EditText telefonoDoc;
    EditText correoDoc;
    EditText contraseñaDoc;
    Spinner areaDoc;

    String[]  Areas = {"Histologia", "Urologia", "Rinologia","Hepatologia","Traumatologia","Pediatria","Ginecologia"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_doc);
        codigoDoc=(EditText) findViewById(R.id.codigoDoc);
        nombreDoc=(EditText) findViewById(R.id.nombreDoc);
        dniDoc=(EditText) findViewById(R.id.dniDoc);
        telefonoDoc=(EditText) findViewById(R.id.telefonoDoc);
        correoDoc=(EditText) findViewById(R.id.correoDoc);
        contraseñaDoc=(EditText) findViewById(R.id.passDoc);
        areaDoc=(Spinner) findViewById(R.id.areaDocSpiner);
        ArrayAdapter<String> areaspinner = new ArrayAdapter(this,android.R.layout.simple_spinner_item,Areas) ;
        areaDoc.setAdapter(areaspinner);
    }
    public void registrarDocClick(View view){

    }
}
