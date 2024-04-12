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
    protected void onCreate(Bundle savedInstanceState) { // aquí se inicializa la interfaz de usuario y se configuran los componentes de la actividad
        super.onCreate(savedInstanceState); // Esta línea llama al método onCreate de la clase base, es decir, AppCompatActivity, para que realice cualquier inicialización necesaria.
        setContentView(R.layout.activity_main); //Infla el diseño definido en el archivo activity_main.xml y lo muestra en la pantalla

        //Creo variables a partir del id del elemento del xml
        EditText nombre = findViewById(R.id.nombre);
        EditText apellido = findViewById(R.id.apellido);
        EditText email = findViewById(R.id.email);
        EditText clave = findViewById(R.id.clave);
        Button btnCrear = findViewById(R.id.btnCrear);

        //Evento clic
        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Capturo los datos ingresados por el usuario
               String nombreIn = nombre.getText().toString();
               String apellidoIn = apellido.getText().toString();
               String emailIn = email.getText().toString();
               String claveIn = clave.getText().toString();

                // Creo un intent para iniciar la actividad MostrarDatosActivity
                Intent intent = new Intent(MainActivity.this, MostrarDatosActivity.class); // MainActivity.this = hago referencia a la clase actual // MostrarDatosActivity.class  Esta es la clase que quiero "redireccionar"

                intent.putExtra("nombre", nombreIn); // nombre, nombreIn = clave:valor   agrego datos adicionales al intent
                intent.putExtra("apellido", apellidoIn);
                intent.putExtra("email", emailIn);
                intent.putExtra("clave", claveIn);
                startActivity(intent); // Inicia la actividad MostrarDatosActivity

            }
        });


    }
}