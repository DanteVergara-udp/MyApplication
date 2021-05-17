package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton Ball;
    private TextView respuesta;
    private String [] respuestaArray={"Si", "No", "Probablemente", "Te ira mal", "Te ira bien", "Dificil", "Facil", "Ni lo pienses", "Aprobaras todo", "Es cierto", "No puedo decirtelo", "Tu ya lo sabes",
    "Confia en eso", "Todo apunta a que si", "Ya te lo echaste", "Deja de hacer preguntas", "Pregunta nuevamente", "El futuro es incierto", "Por supuesto", "Un poco", "Ahora no", "Mejor no", "Mejor estudia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Referencia la imagen
        Ball = findViewById(R.id.btn);
        //Referencia del texto
        respuesta = findViewById(R.id.respuestavista);
        //Proceso
        Ball.setOnClickListener(this);
        Toast.makeText(MainActivity.this, "Consulta algo de la U", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onClick(View v){
        //Creacion metodo switch
    switch (v.getId()){
        case R.id.btn:
            int rand = new Random() .nextInt(respuestaArray.length);
            respuesta.setText(respuestaArray[rand]);
            break;
    }
    }
}