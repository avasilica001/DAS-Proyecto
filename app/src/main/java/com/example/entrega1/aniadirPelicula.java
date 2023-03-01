package com.example.entrega1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class aniadirPelicula extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aniadir_pelicula);

        EditText titulo= (EditText) findViewById(R.id.ap_t_nombre);
        EditText anio= (EditText) findViewById(R.id.ap_t_anio);
        EditText url= (EditText) findViewById(R.id.ap_t_portada);

        EditText descripcion= (EditText) findViewById(R.id.ap_t_descripcion);
        RatingBar valoracion= (RatingBar) findViewById(R.id.ap_rb_valoracion);

        Button aniadir= (Button) findViewById(R.id.ap_b_aniadir);

        aniadir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                DBHelper db=new DBHelper(aniadirPelicula.this);
                db.aniadirPelicula(titulo.getText().toString().trim(),Integer.valueOf(anio.getText().toString().trim()),url.getText().toString().trim(),2.5f,descripcion.getText().toString().trim());
            }
        });
    }
}