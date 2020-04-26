package com.example.movies_fragments.controller;

import com.example.movies_fragments.R;
import com.example.movies_fragments.entities.Actor;
import com.example.movies_fragments.entities.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieController {
    private List<Movie> movieList;
    private static MovieController controller;

    public MovieController(){
        initMovieList();
    }

    private List<Movie> initMovieList(){
        DirectorController directorController = new DirectorController();
        ActorController actorController = new ActorController();

        if (this.movieList == null) {
            this.movieList = new ArrayList<Movie>();
            movieList.add(new Movie(R.drawable.filme_alita,"Alita: Battle Angel",2019,"Action, Adventure, Sci-Fi", directorController.getListDiretor().get(0), actorController.getListAtor().get(0)));
            movieList.add(new Movie(R.drawable.filme_batman_superman,"Batman v Superman",2016,"Action, Adventure, Sci-Fi",directorController.getListDiretor().get(1), actorController.getListAtor().get(1)));
            movieList.add(new Movie(R.drawable.filme_bladerunner,"Blade Runner",2017,"Action, Drama, Mistery", directorController.getListDiretor().get(2), actorController.getListAtor().get(2)));
            movieList.add(new Movie(R.drawable.filme_capita_marvel,"Capitain Marvel",2019,"Action, Adventure, Sci-Fi", directorController.getListDiretor().get(3), actorController.getListAtor().get(3)));
            movieList.add(new Movie(R.drawable.filme_civilwar,"Captain America: Civil War",2016,"Action, Adventure, Sci-Fi", directorController.getListDiretor().get(4), actorController.getListAtor().get(4)));
            movieList.add(new Movie(R.drawable.filme_coringa,"Joker",2019,"Crime, Drama, Thriller", directorController.getListDiretor().get(5), actorController.getListAtor().get(5)));
            movieList.add(new Movie(R.drawable.filme_jurassicworld,"Jurassic World",2018,"Action, Adventure, Sci-Fi", directorController.getListDiretor().get(6), actorController.getListAtor().get(6)));
            movieList.add(new Movie(R.drawable.filme_liga_justica,"Justice League",2018,"Action, Adventure, Fantasy", directorController.getListDiretor().get(1), actorController.getListAtor().get(1)));
            movieList.add(new Movie(R.drawable.filme_madmax,"Mad Max: Fury Road",2015,"Action, Adventure, Sci-Fi", directorController.getListDiretor().get(7), actorController.getListAtor().get(7)));
            movieList.add(new Movie(R.drawable.filme_moonlight,"Moonlight",2016,"Drama", directorController.getListDiretor().get(8), actorController.getListAtor().get(8)));
            movieList.add(new Movie(R.drawable.filme_pantera_negra,"Black Panther",2018,"Action, Adventure, Sci-Fi", directorController.getListDiretor().get(9), actorController.getListAtor().get(9)));
            movieList.add(new Movie(R.drawable.filme_starwars,"Star Wars: Episode VII",2015,"Action, Adventure, Sci-Fi", directorController.getListDiretor().get(10), actorController.getListAtor().get(9)));
        }
        return this.movieList;
    }

    public List<Movie> getListMovie() {
        return movieList;
    }

    public MovieController getController(){
        if(controller == null){
            controller = new MovieController();
        }
        return controller;
    }

}
