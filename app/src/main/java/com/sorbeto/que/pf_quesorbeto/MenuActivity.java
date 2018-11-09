package com.sorbeto.que.pf_quesorbeto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MenuActivity extends AppCompatActivity {

    //GUI Objects
    ListView lvMenu;

    //Menu objects
    ArrayAdapter<String> adapter;
    String[] titulosMenu = new String[]{"Clientes","Productos","Facturacion","Salir"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        inicializar();

        lvMenu.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        //Intent login = new Intent(getApplicationContext(), Login.class);
                        //startActivity(login);
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    default:

                        break;
                }
            }
        });
    }

    private void inicializar(){
        lvMenu = findViewById(R.id.lvMenu);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, titulosMenu);
        lvMenu.setAdapter(adapter);
    }

}
