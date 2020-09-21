package com.ogva.datopersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class VerDatos extends AppCompatActivity {

    TextView tvNombreCompleto;
    TextView tvFechaNacimiento;
    TextView tvTelefono;
    TextView tvEmail;
    TextView tvDescripcion;
    MaterialButton btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_datos);

        tvNombreCompleto    = findViewById(R.id.tvNombreCompleto);
        tvFechaNacimiento   = findViewById(R.id.tvFechaNacimiento);
        tvTelefono          = findViewById(R.id.tvTelefono);
        tvEmail             = findViewById(R.id.tvEmail);
        tvDescripcion       = findViewById(R.id.tvDescripcion);
        btnEdit             = findViewById(R.id.btnEdit);

        Bundle parametros = getIntent().getExtras();
        String nombre_completo  = parametros.getString(getResources().getString(R.string.param_nombre_completo));
        String telefono         = parametros.getString(getResources().getString(R.string.param_telefono));
        String email            = parametros.getString(getResources().getString(R.string.param_email));
        String descripcion      = parametros.getString(getResources().getString(R.string.param_descripcion));
        String day      = parametros.getString(getResources().getString(R.string.param_day));
        String month    = parametros.getString(getResources().getString(R.string.param_month));
        String year     = parametros.getString(getResources().getString(R.string.param_year));

        tvNombreCompleto.setText(nombre_completo);
        tvFechaNacimiento.setText("Fecha Nacimiento: " + day + "/" + month + "/" + year);
        tvTelefono.setText("Tel. " + telefono);
        tvEmail.setText("Email: " + email);
        tvDescripcion.setText("Descripcion: " + descripcion);

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}