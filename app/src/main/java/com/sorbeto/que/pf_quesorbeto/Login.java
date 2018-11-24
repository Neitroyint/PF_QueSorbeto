package com.sorbeto.que.pf_quesorbeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        Button ingresaboton = (Button) findViewById(R.id.Ingresar);
        ingresaboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String correo = ((EditText)findViewById(R.id.txtCorreo)).getText().toString();
                String password = ((EditText)findViewById(R.id.txtPassword)).getText().toString();
                if (!correo.equals("") && !password.equals(""))
                {
                    Intent llamaprueba = new Intent(getApplicationContext(), MenuActivity.class);
                    //Le agregamos un "Extra"
                    llamaprueba.putExtra("username", correo);
                    llamaprueba.putExtra( "password" , password);
                    startActivity(llamaprueba);

                }
                else {
                    Toast.makeText(getApplicationContext(),"Usuario o Contraseña no pueden estar vacios", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

}
