package com.example.formulario;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nombre = findViewById(R.id.nombre);
        EditText apellido = findViewById(R.id.apellido);
        EditText email = findViewById(R.id.email);
        EditText clave = findViewById(R.id.clave);
        Button btnCrear = findViewById(R.id.btnCrear);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String nombreIn = nombre.getText().toString();
               String apellidoIn = apellido.getText().toString();
               String emailIn = email.getText().toString();
               String claveIn = clave.getText().toString();


                Intent intent = new Intent(MainActivity.this, MostrarDatosActivity.class);

                intent.putExtra("nombre", nombreIn);
                intent.putExtra("apellido", apellidoIn);
                intent.putExtra("email", emailIn);
                intent.putExtra("clave", claveIn);
                startActivity(intent);

            }
        });


    }
}