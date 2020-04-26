package com.example.movies_fragments.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.example.movies_fragments.MainActivity;
import com.example.movies_fragments.R;


public class FragmentAddMovie extends Fragment {
    ImageView img_movieadd;
    EditText nome_movieadd;
    EditText ano_movieadd;
    EditText genero_movieadd;
    Spinner spinner_diretor;
    Spinner spinner_ator;
    Button btnRegister;
    MainActivity activity;

    public FragmentAddMovie(MainActivity activity) {
        this.activity = activity;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.add_movie, container, false);

        img_movieadd = (ImageView) view.findViewById(R.id.moviephoto_add);
        nome_movieadd = (EditText) view.findViewById(R.id.movietitle_add);
        ano_movieadd = (EditText) view.findViewById(R.id.movieyear_add);
        genero_movieadd = (EditText) view.findViewById(R.id.moviegenre_add);
        spinner_diretor = (Spinner) view.findViewById(R.id.director_spinner);
        spinner_ator = (Spinner) view.findViewById(R.id.actor_spinner);
        btnRegister = (Button) view.findViewById(R.id.btnadd_movie);

        return view;
    }


}
