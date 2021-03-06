package com.example.recyclerviewreceta;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private  List<Receta> mRecetaList = new ArrayList<>();


    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mRecetaList =Receta.getRecetaList(4);

        FloatingActionButton fab = findViewById(R.id.fab);
        //Creo el mRecyclerView antes por si acaso porque en el onclick lo utilizamos

        // Creates the RecyclerView and connects it with an adapter and the data.
        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerView);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this,mRecetaList);//extraeriamos solo lo de recetas
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager. NO OLVIDARSE DE ESTAS LINEAS!!!OJO!
        LinearLayoutManager manager= new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(manager);//++Ojo! imprescindible
        //si no le decimos que tipo de layout tiene que utilizxar no sabe cual utilizar
        //conseguir unas lineas entre items del recycler
        DividerItemDecoration dividerItemDecoration=
                new DividerItemDecoration
                        (mRecyclerView.getContext(),manager.getOrientation());
        mRecyclerView.addItemDecoration(dividerItemDecoration);





        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        // CREA LA LISTA DE ITEMS EN EL ON CREATE
        //createList();
    }

   /* public void createList(){
        for (int i = 0; i < 20; i++) {
            Receta rec=new Receta( "Receta "+i, "Descripcion "+i);
            mRecetaList.addLast(rec);
        }
    }
    */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
