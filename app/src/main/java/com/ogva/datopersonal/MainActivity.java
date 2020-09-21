package com.ogva.datopersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextInputEditText editTextNombreCompleto;
    DatePicker fechaNacimiento;
    TextInputEditText editTextTelefono;
    TextInputEditText editTextEmail;
    TextInputEditText editTextDescripcion;
    MaterialButton btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNombreCompleto  = findViewById(R.id.editTextNombreCompleto);
        fechaNacimiento         = findViewById(R.id.fechaNacimiento);
        editTextTelefono        = findViewById(R.id.editTextTelefono);
        editTextEmail           = findViewById(R.id.editTextEmail);
        editTextDescripcion     = findViewById(R.id.editTextDescripcion);
        btnSiguiente            = findViewById(R.id.btnSiguiente);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VerDatos.class);
                intent.putExtra(getResources().getString(R.string.param_nombre_completo),editTextNombreCompleto.getText().toString());
                intent.putExtra(getResources().getString(R.string.param_telefono),editTextTelefono.getText().toString());
                intent.putExtra(getResources().getString(R.string.param_email),editTextEmail.getText().toString());
                intent.putExtra(getResources().getString(R.string.param_descripcion),editTextDescripcion.getText().toString());
                intent.putExtra(getResources().getString(R.string.param_day),String.valueOf(fechaNacimiento.getDayOfMonth()));
                intent.putExtra(getResources().getString(R.string.param_month),String.valueOf(fechaNacimiento.getMonth()));
                intent.putExtra(getResources().getString(R.string.param_year),String.valueOf(fechaNacimiento.getYear()));
                startActivity(intent);
            }
        });
    }
}