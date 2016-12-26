package com.example.root.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    Button botonBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView =  (TextView) findViewById(R.id.texto);
        botonBack = (Button) findViewById(R.id.buttonBack);
        botonBack.setOnClickListener(new ListenerBoton());
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle!=null){
            String cadena = (String) bundle.get("DATO");
            textView.setText(cadena);
        }

    }

public class ListenerBoton implements View.OnClickListener{

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonBack:
                Intent intentA = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intentA);
                break;

        }
    }
}


}
