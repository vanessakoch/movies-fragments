package com.example.movies_fragments.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movies_fragments.R;
import com.example.movies_fragments.adapters.RecyclerMovieAdapter;
import com.example.movies_fragments.entities.Movie;

import java.util.ArrayList;
import java.util.List;

public class FragmentMovie extends Fragment {
    View view;
    private RecyclerView recyclerView;
    private List<Movie> movieList;

    public FragmentMovie (){
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.movie_fragment, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.movie_recyclerview);
        RecyclerMovieAdapter adapter = new RecyclerMovieAdapter(getContext(), movieList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        movieList = new ArrayList<Movie>();
        movieList.add(new Movie(R.drawable.filme_alita,"Alita: Battle Angel",2019,"Action, Adventure, Sci-Fi","Robert Rodriguez","Rosa Salazar"));
        movieList.add(new Movie(R.drawable.filme_batman_superman,"Batman v Superman",2016,"Action, Adventure, Sci-Fi","Zack Snyder","Ben Affleck"));
        movieList.add(new Movie(R.drawable.filme_bladerunner,"Blade Runner",2017,"Action, Drama, Mistery","Denis Villeneuve","Harrison Ford"));
        movieList.add(new Movie(R.drawable.filme_capita_marvel,"Capitain Marvel",2019,"Action, Adventure, Sci-Fi","Anna Boden","Brie Larson"));
        movieList.add(new Movie(R.drawable.filme_civilwar,"Captain America: Civil War",2016,"Action, Adventure, Sci-Fi","Anthony Russo","Christopher Robert Evans"));
        movieList.add(new Movie(R.drawable.filme_coringa,"Joker",2019,"Crime, Drama, Thriller","Todd Phillips","Joaquin Phoenix"));
        movieList.add(new Movie(R.drawable.filme_jurassicworld,"Jurassic World",2018,"Action, Adventure, Sci-Fi","Juan Antônio García Bayona","Chris Pratt"));
        movieList.add(new Movie(R.drawable.filme_liga_justica,"Justice League",2018,"Action, Adventure, Fantasy","Zack Snyder","Ben Affleck"));
        movieList.add(new Movie(R.drawable.filme_madmax,"Mad Max: Fury Road",2015,"Action, Adventure, Sci-Fi","George Miller","Tom Hardy"));
        movieList.add(new Movie(R.drawable.filme_moonlight,"Moonlight",2016,"Drama","Barry Jenkins","Mahershala Ali"));
        movieList.add(new Movie(R.drawable.filme_pantera_negra,"Black Panther",2018,"Action, Adventure, Sci-Fi","Ryan Coogler","Chadwick Boseman"));
        movieList.add(new Movie(R.drawable.filme_starwars,"Star Wars: Episode VII",2015,"Action, Adventure, Sci-Fi","Jeffrey Jacob Abrams","Daisy Ridley"));

    }
}
