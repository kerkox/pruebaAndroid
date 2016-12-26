package com.example.root.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button boton;
    EditText editText;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button) findViewById(R.id.boton1);
        boton.setOnClickListener(this);
        editText = (EditText) findViewById(R.id.texto);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new ListenerRadioButton());
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
