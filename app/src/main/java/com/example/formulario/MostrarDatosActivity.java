package com.example.formulario;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MostrarDatosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        // Obtiene el intent que inició esta actividad.
        Intent intent = getIntent(); //con esto obtengo los datos ingresados en la pantalla anterior

        //Creo "variables" a traves del intent con los datos ingresados
        String nombre = intent.getStringExtra("nombre");  //Extraigo el valor asociado con la clave "nombre" del intento.
        String apellido = intent.getStringExtra("apellido");
        String email = intent.getStringExtra("email");
        String clave = intent.getStringExtra("clave");

        //Muestro un mensaje en el textview de bienvenida
        TextView bienvenida = findViewById(R.id.bienvenida);
        bienvenida.setText("Bienvenido " +nombre +" "+apellido);

        // Muestra los datos en los TextView correspondientes
        TextView nombreIngresado = findViewById(R.id.nombreIngresado);
        nombreIngresado.setText("Nombre: " + nombre);

        TextView apellidoIngresado = findViewById(R.id.apellidoIngresado);
        apellidoIngresado.setText("Apellido: " +apellido);

        TextView correoIngresado = findViewById(R.id.correoIngresado);
        correoIngresado.setText("Correo: " +email);

        TextView claveIngresada = findViewById(R.id.claveIngresada);
        claveIngresada.setText("Contraseña: " +clave);

        //Declaro el boton para volver a la pantalla anterior
        Button btnVolver = findViewById(R.id.btnVolver);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MostrarDatosActivity.this, MainActivity.class);
                startActivity(intent); //Vuelvo a la pantalla anterior
            }
        });




    }
}
