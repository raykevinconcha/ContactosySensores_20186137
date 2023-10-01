package com.example.contactosysensores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Magnetometro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magnetometro);

        Button irAcelerometroButton=findViewById(R.id.button3);
        irAcelerometroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Magnetometro.this,Acelerometro.class);
                startActivity(intent);
            }
        });
    }
}