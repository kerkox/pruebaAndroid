package com.example.root.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button boton;
    EditText editText;
    RadioGroup radioGroup;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button) findViewById(R.id.boton1);
        boton.setOnClickListener(this);
        editText = (EditText) findViewById(R.id.texto);
        //Radiop Button
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new ListenerRadioButton());
        //Spiner
        spinner = (Spinner) findViewById(R.id.spinner);
        List list = new ArrayList();
        list.add("item 1");
        list.add("item 2");
        list.add("item 3");
        list.add("item 4");
        list.add("item 5");
        list.add("item 6");
        list.add("item 7");
        list.add("item 8");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Position "+String.valueOf(spinner.getSelectedItem()),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton1:
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                String dato = editText.getText().toString();
                intent.putExtra("DATO",dato);
                startActivity(intent);

                break;

        }
    }

    public class ListenerRadioButton implements RadioGroup.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if(checkedId == R.id.radioButton){
                Toast.makeText(getApplicationContext(),"1",Toast.LENGTH_SHORT).show();
            }else if(checkedId == R.id.radioButton2){
                Toast.makeText(getApplicationContext(),"2",Toast.LENGTH_SHORT).show();
            }else if(checkedId == R.id.radioButton3){
                Toast.makeText(getApplicationContext(),"3",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
