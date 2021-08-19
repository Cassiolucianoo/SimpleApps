package com.cassiolucianodasilva.recyclerview.ui.activity;

import android.os.Bundle;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;

import com.cassiolucianodasilva.recyclerview.R;
import com.cassiolucianodasilva.recyclerview.dao.NotaDAO;
import com.cassiolucianodasilva.recyclerview.model.Nota;
import com.cassiolucianodasilva.recyclerview.ui.recyclerview.adapter.ListaNotasAdapter;


import java.util.List;

public class ListaNotasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        ListView listaNotas = findViewById(R.id.nota_ini_recyclerview);

        NotaDAO dao = new NotaDAO();


        for ( int  i = 1 ; i <= 1000 ; i++) {
            dao.insere(new Nota("Nota" + i, "Descrição "+i));
        }



        List<Nota> todasNotas = dao.todos();

        listaNotas.setAdapter( new ListaNotasAdapter(this, todasNotas));



    }
}