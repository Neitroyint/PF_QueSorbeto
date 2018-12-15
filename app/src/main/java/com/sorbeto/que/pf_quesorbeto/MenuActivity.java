package com.sorbeto.que.pf_quesorbeto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import classes.Pref;
import classes.Preference;

public class MenuActivity extends AppCompatActivity {
    //Preference
    public static Preference preferences;
    //GUI Objects
    private ListView lvMenu;

    //Menu objects
    private ArrayAdapter<String> adapter;
    private String[] titulosMenu = new String[]{"Clientes","Productos","Facturacion","Salir"};

    private AdapterView.OnItemClickListener MenuClick = new AdapterView.OnItemClickListener(){
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            redirect(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initializeControls();
        receiveUserExtras();
    }

    private void initializeControls(){
        lvMenu = findViewById(R.id.lvMenu);

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, titulosMenu);
        lvMenu.setAdapter(adapter);
        lvMenu.setOnItemClickListener(MenuClick);

        preferences = new Preference(getApplicationContext());
    }

    private boolean receiveUserExtras(){
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String password = intent.getStringExtra("password");
        Pref pref = new Pref(username, password);
        List<Pref> prefs = new ArrayList<Pref>();
        prefs.add(pref);
        boolean res = preferences.PutPreference(prefs);
        return res;
    }

    private void redirect(int i){
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
}
