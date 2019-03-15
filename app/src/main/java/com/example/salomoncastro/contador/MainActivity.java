package com.example.salomoncastro.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button sumarIn, sumarOut;
    public TextView texto1, texto2;

    public int i = 0;
    public int contador = 0;

    public int getContador2() {
        return contador2;
    }

    public void setContador2(int contador2) {
        this.contador2 = contador2;
    }

    public int contador2 = 0;


    public Button getSumarIn() {
        return sumarIn;
    }

    public void setSumarIn(Button sumarIn) {
        this.sumarIn = sumarIn;
    }

    public Button getSumarOut() {
        return sumarOut;
    }

    public void setSumarOut(Button sumarOut) {
        this.sumarOut = sumarOut;
    }

    public TextView getTexto1() {
        return texto1;
    }

    public void setTexto1(TextView texto1) {
        this.texto1 = texto1;
    }

    public TextView getTexto2() {
        return texto2;
    }

    public void setTexto2(TextView texto2) {
        this.texto2 = texto2;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumarIn = (Button) findViewById(R.id.boton1);
        sumarOut = (Button) findViewById(R.id.boton2);

        texto1 = (TextView) findViewById(R.id.entran);
        texto2 = (TextView) findViewById(R.id.salen);


        sumarIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contador++;

                texto1.setText(String.valueOf(contador));
            }
        });

        sumarOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contador2++;

                texto2.setText(String.valueOf(contador2));
            }
        });

    }
}
