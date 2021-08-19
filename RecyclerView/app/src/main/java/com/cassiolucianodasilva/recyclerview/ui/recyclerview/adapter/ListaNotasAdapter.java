package com.cassiolucianodasilva.recyclerview.ui.recyclerview.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.recyclerview.widget.RecyclerView;

import com.cassiolucianodasilva.recyclerview.R;
import com.cassiolucianodasilva.recyclerview.model.Nota;
import com.cassiolucianodasilva.recyclerview.ui.activity.ListaNotasActivity;

import java.util.List;


public class ListaNotasAdapter extends RecyclerView.Adapter implements ListAdapter {

    private Context context;
    private List<Nota> notas;



    public ListaNotasAdapter(Context context, List<Nota> notas) {
        this.context = context;
        this.notas = notas;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewCriada = LayoutInflater.from(context).inflate(R.layout.item_nota, parent, false);
     return new NotaViewHolder(viewCriada);



    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return notas.size();
    }

    class NotaViewHolder extends RecyclerView.ViewHolder{


        public NotaViewHolder(View itemView) {
            super(itemView);
        }
    }
    }



