package com.example.calculdora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText TxtNumero1;
    private EditText TxtNumero2;
    private EditText TxtNumero3;
    private TextView TvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TxtNumero1 = findViewById(R.id.TxtNumero1);
        TxtNumero2 = findViewById(R.id.TxtNumero2);
        TxtNumero3 = findViewById(R.id.TxtNumero3);

        TvResultado = findViewById(R.id.TvResultado);

    }

        public void somar(View view){
            double preco = Double.parseDouble(TxtNumero1.getText().toString());
            double horas = Double.parseDouble(TxtNumero2.getText().toString());
            double casco = Double.parseDouble(TxtNumero3.getText().toString());

            double precoLiquido = preco - casco;
            double valorMinuto = precoLiquido / horas;
            String resultadoFormatado = String.format("O valor por hora é: $ %.2f", valorMinuto * 60);

            TvResultado.setText(resultadoFormatado);
        }
}