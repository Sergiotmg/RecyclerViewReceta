package com.example.recyclerviewreceta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        Receta current= new Receta();
        current.setTitulo(intent.getStringExtra("title"));
        current.setImageUrl(intent.getStringExtra("imageUrl"));
        current.setRecipe(intent.getStringExtra("recipe"));

        TextView txtTitulo= findViewById(R.id.txtTitle);
        txtTitulo.setText(current.getTitulo());

        ImageView imgReceta=findViewById(R.id.imgReceta);
        //glide tmb sirve para cargar imagenes locales
        imgReceta.setImageResource(R.drawable.ic_add);
        //Glide.with(this).load(R.drawable.ic_add).into(imgReceta);
        //Glide.with(this).load(current.getImageUrl()).into(imgReceta);

        TextView txtRecipe =findViewById(R.id.txtRecipe);
        txtRecipe.setText(current.getRecipe());

    }
}
