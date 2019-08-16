package com.elielleal.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){
        TextView textoResultado = findViewById(R.id.textoResultado);
        int x = new Random().nextInt(11); // gerando um numero randomico, aleatorio. Seleciona um numero do tanto que deseja
        textoResultado.setText("O número selecionado é: " + x);
    }
}
