package com.example.movies_fragments.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movies_fragments.R;
import com.example.movies_fragments.entities.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

    AppCompatActivity activity;
    List<Movie> movieList;


    public MovieAdapter(AppCompatActivity activity) {
        this.activity = activity;
        this.movieList = new ArrayList<Movie>();;

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

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        holder.img_movie.setImageResource(movieList.get(position).getFotoFilme());
        holder.tv_titulo.setText(movieList.get(position).getTitulo());
        holder.tv_lancamento.setText(String.valueOf(movieList.get(position).getAnoLançamento()));
        holder.tv_genero.setText(movieList.get(position).getGenero());
        holder.tv_diretor.setText(movieList.get(position).getDiretor());
        holder.tv_protagonista.setText(movieList.get(position).getProtagonista());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), movieList.get(holder.getAdapterPosition()).getTitulo(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_titulo;
        TextView tv_lancamento;
        TextView tv_genero;
        TextView tv_diretor;
        TextView tv_protagonista;
        ImageView img_movie;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_titulo = (TextView) itemView.findViewById(R.id.txtTitulo);
            tv_lancamento = (TextView) itemView.findViewById(R.id.txtLancamento);
            tv_genero = (TextView) itemView.findViewById(R.id.txtGenero);
            tv_diretor = (TextView) itemView.findViewById(R.id.txtDiretor);
            tv_protagonista = (TextView) itemView.findViewById(R.id.txtProtagonista);
            img_movie = (ImageView) itemView.findViewById(R.id.img_movie);
        }
    }

    public void insertItem(Movie movie) {
        movieList.add(movie);
        notifyItemInserted(getItemCount());
    }


}
