package com.example.formulario;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MostrarDatosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String apellido = intent.getStringExtra("apellido");
        String email = intent.getStringExtra("email");
        String clave = intent.getStringExtra("clave");

        // Muestra los datos en los TextView correspondientes
        TextView nombreIngresado = findViewById(R.id.nombreIngresado);
        nombreIngresado.setText("Nombre: " + nombre);

        TextView apellidoIngresado = findViewById(R.id.apellidoIngresado);
        apellidoIngresado.setText("Apellido: " +apellido);


        TextView correoIngresado = findViewById(R.id.correoIngresado);
        correoIngresado.setText("Correo: " +email);

        TextView claveIngresada = findViewById(R.id.claveIngresada);
        claveIngresada.setText("Contraseña: " +clave);
    }
}
