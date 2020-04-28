package com.example.movies_fragments.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.movies_fragments.MainActivity;
import com.example.movies_fragments.R;
import com.example.movies_fragments.adapters.MovieAdapter;
import com.example.movies_fragments.controller.ActorController;
import com.example.movies_fragments.controller.DirectorController;
import com.example.movies_fragments.entities.Actor;
import com.example.movies_fragments.entities.Director;
import com.example.movies_fragments.entities.Movie;

public class FragmentInsertMovie extends Fragment {
    ImageView img_movieadd;
    EditText nome_movieadd;
    EditText ano_movieadd;
    EditText genero_movieadd;
    Spinner spinner_diretor;
    Spinner spinner_ator;
    Button btnRegister;
    MainActivity activity;
    MovieAdapter adapter;
    DirectorController directorController;
    ActorController actorController;
    ArrayAdapter<Actor> actorArrayAdapter;
    ArrayAdapter<Director> directorArrayAdapter;

    public FragmentInsertMovie(MainActivity activity) {
        this.activity = activity;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.add_movie, container, false);

        adapter = new MovieAdapter(activity);
        actorController = ActorController.getController();
        directorController = DirectorController.getController();

        img_movieadd = (ImageView) view.findViewById(R.id.moviephoto_add);
        nome_movieadd = (EditText) view.findViewById(R.id.movietitle_add);
        ano_movieadd = (EditText) view.findViewById(R.id.movieyear_add);
        genero_movieadd = (EditText) view.findViewById(R.id.moviegenre_add);
        btnRegister = (Button) view.findViewById(R.id.btnadd_movie);
        spinner_diretor = (Spinner) view.findViewById(R.id.director_spinner);
        spinner_ator = (Spinner) view.findViewById(R.id.actor_spinner);

        actorArrayAdapter = new ArrayAdapter<Actor>(getContext(), R.layout.spinner_item, actorController.getListAtor());
        actorArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_ator.setAdapter(actorArrayAdapter);

        directorArrayAdapter = new ArrayAdapter<Director>(getContext(), R.layout.spinner_item, directorController.getListDiretor());
        directorArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_diretor.setAdapter(directorArrayAdapter);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Movie novo = new Movie(R.drawable.movieempty, String.valueOf(nome_movieadd.getText()), Integer.parseInt(ano_movieadd.getText().toString()),
                        String.valueOf(genero_movieadd.getText()), (Director) spinner_diretor.getSelectedItem(), (Actor) spinner_ator.getSelectedItem());
                adapter.insertItem(novo);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_filme, new FragmentMovie(activity)).commit();
            }
        });

        return view;
    }

}
