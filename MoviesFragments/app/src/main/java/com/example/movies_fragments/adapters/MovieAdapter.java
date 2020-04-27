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

import com.example.movies_fragments.MainActivity;
import com.example.movies_fragments.R;
import com.example.movies_fragments.controller.MovieController;
import com.example.movies_fragments.entities.Movie;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {
    MainActivity activity;
    MovieController controller;

    public MovieAdapter(MainActivity activity) {
        this.activity = activity;
        this.controller = MovieController.getController();
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
        holder.img_movie.setImageResource(controller.getListMovie().get(position).getFotoFilme());
        holder.tv_titulo.setText(controller.getListMovie().get(position).getTitulo());
        holder.tv_lancamento.setText(String.valueOf(controller.getListMovie().get(position).getAnoLançamento()));
        holder.tv_genero.setText(controller.getListMovie().get(position).getGenero());
        holder.tv_diretor.setText(controller.getListMovie().get(position).getDiretor().getNomeDiretor());
        holder.tv_protagonista.setText(controller.getListMovie().get(position).getProtagonista().getNomeAtor());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), controller.getListMovie().get(holder.getAdapterPosition()).getTitulo(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return controller.getListMovie().size();
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
        controller.getListMovie().add(movie);
        notifyItemInserted(getItemCount());
    }


}
