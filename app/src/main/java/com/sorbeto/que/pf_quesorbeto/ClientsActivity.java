package com.sorbeto.que.pf_quesorbeto;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ClientsActivity extends AppCompatActivity {
    //Controls
    Button save;
    Button cancel;
    EditText id;
    EditText name;
    EditText phone;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clients);

        initializeControls();
    }
    private void initializeControls(){
        save = findViewById(R.id.btnGuardar);
        save.setOnClickListener(save_OnClick);
        cancel = findViewById(R.id.btnCancelar);
        id = findViewById(R.id.etxID);
        name = findViewById(R.id.etxName);
        phone = findViewById(R.id.etxPhone);
        spinner = findViewById(R.id.spnClientes);
        populateSpinner();
    }
    private void populateSpinner(){
        List<String> lista = new ArrayList<>();
        lista.add("Yedrald Valerin");
        lista.add("Ashley Vargas");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, lista);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    private View.OnClickListener save_OnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
    private AdapterView.OnItemSelectedListener spnClientes_OnItemSelected  = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };
}
