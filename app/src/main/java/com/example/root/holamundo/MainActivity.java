package com.example.root.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button boton;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button) findViewById(R.id.boton1);
        boton.setOnClickListener(this);
        editText = (EditText) findViewById(R.id.texto);
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
}
