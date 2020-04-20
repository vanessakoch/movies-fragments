package com.example.movies_fragments.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movies_fragments.R;
import com.example.movies_fragments.entities.Movie;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class RecyclerMovieAdapter extends RecyclerView.Adapter<RecyclerMovieAdapter.MyViewHolder> {

    Context mContext;
    List<Movie> movieList;

    public RecyclerMovieAdapter(Context mContext, List<Movie> movieList) {
        this.mContext = mContext;
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.item_movie, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        holder.img_movie.setImageResource(movieList.get(position).getFotoFilme());
        holder.tv_titulo.setText(movieList.get(position).getTitulo());
        holder.tv_lancamento.setText(String.valueOf(movieList.get(position).getAnoLançamento()));
        holder.tv_genero.setText(movieList.get(position).getGenero());
        holder.tv_diretor.setText(movieList.get(position).getDiretor());
        holder.tv_protagonista.setText(movieList.get(position).getProtagonista());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),movieList.get(holder.getAdapterPosition()).getTitulo(),Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_titulo;
        private TextView tv_lancamento;
        private TextView tv_genero;
        private TextView tv_diretor;
        private TextView tv_protagonista;
        private ImageView img_movie;
        private FloatingActionButton btnMovie;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_titulo = (TextView) itemView.findViewById(R.id.txtTitulo);
            tv_lancamento = (TextView) itemView.findViewById(R.id.txtLancamento);
            tv_genero = (TextView) itemView.findViewById(R.id.txtGenero);
            tv_diretor = (TextView) itemView.findViewById(R.id.txtDiretor);
            tv_protagonista = (TextView) itemView.findViewById(R.id.txtProtagonista);
            img_movie = (ImageView) itemView.findViewById(R.id.img_movie);
            btnMovie = (FloatingActionButton) itemView.findViewById(R.id.btnFilme);

        }
    }

    public void insertItem(Movie movie) {
        movieList.add(movie);
        notifyItemInserted(getItemCount());
    }


}
