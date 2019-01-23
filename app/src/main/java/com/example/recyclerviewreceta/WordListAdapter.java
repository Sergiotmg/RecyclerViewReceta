package com.example.recyclerviewreceta;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder>  {
    //To hold your data in the adapter:
    private final List<Receta> mRecetaList;//los items que iremos mostrando
    private LayoutInflater mInflater;//para crear distintos layout
    private Context context; // nos hara context.getresources para coger los colores de fondo
    //constructor
    public WordListAdapter(Context context,List<Receta> recetaList) {//context no se deberia

        mInflater = LayoutInflater.from(context);// si hay 20 creara 20
        this.mRecetaList = recetaList;
        this.context=context;
    }

    //una clase dentro de otra clase+

    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public final TextView mTitulo;
        public final TextView mDescripcion;
        public final LinearLayout linearLayout;
        final WordListAdapter mAdapter;

        // constructor para el wordViewHolder
        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);

            linearLayout =itemView.findViewById(R.id.linearLayout);
            mTitulo = itemView.findViewById(R.id.txtTitulo);
            mDescripcion=itemView.findViewById(R.id.txtDescripcion);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            // Get the position of the item that was clicked.
            int mPosition = getLayoutPosition();//E en todos los view HOlders
            // Use that to access the affected item in mWordList.
            Receta element = mRecetaList.get(mPosition);
            // Cambia la receta en recetaList.
            //recetaList.set(mPosition,element);//objeto tipo receta
            // Notify the adapter, that the data has changed so it can
            // update the RecyclerView to display the data.
            //mAdapter.notifyDataSetChanged();
            //notifyItemChanged, que uno ha cambiado
            // si no tuvieramos el context no podriamos hacer ese metodo
            Intent intent=new Intent(context,Main2Activity.class);


            intent.putExtra("title",element.getTitulo());// mismo nombre con el que luego
            //lo recogeremos en el Main2Activity
            intent.putExtra("imageUrl",element.getImageUrl());
            intent.putExtra("recipe",element.getRecipe());

            context.startActivity(intent);
        }
    }

    //es obligatorio hacerle overrides en dicha clase
    @NonNull
    @Override
    // vamos a crear un view holer para cada uno de los item ( sostenedor de vista)
    //solo se carga de cargar el layout
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                             int viewType) {//int la posicion item
        View mItemView = mInflater.
                //generamos vista para inflar el layout, el padre y attach: se
                //ate a padre=false
                        inflate(R.layout.wordlist_item,parent, false);// como false siempre
        return new WordViewHolder(mItemView, this);// generamos un nuevo objeto con
        //siempre sera = esta ultima linea , siempre devovleremos ese WordViewHolder
    }

    @Override
    //bind= enlazar unir view holder con la vista y que muestre lo q toca
    // se puede poner el onclick dentro del onBind pero no es recomendable porque cada vez que
    //deslizamos se vuelven a generar todos los onclick
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {
        Receta mCurrent = mRecetaList.get(position);

        holder.mTitulo.setText(mCurrent.getTitulo());
        holder.mDescripcion.setText(mCurrent.getDescripcion());
        /*for (int i=0; i<recetaList.size();i++){


        }*/
        holder.linearLayout.setBackgroundColor(9);
    }

    @Override
    //el tamaño de la vista del redycler
    public int getItemCount() {
        return mRecetaList.size();
    }


}
