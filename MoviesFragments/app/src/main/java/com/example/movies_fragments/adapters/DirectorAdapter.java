package com.example.movies_fragments.adapters;

import android.content.Context;
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
import com.example.movies_fragments.entities.Director;

import java.util.ArrayList;
import java.util.List;

public class DirectorAdapter extends RecyclerView.Adapter<DirectorAdapter.MyViewHolder> {

    AppCompatActivity activity;
    List<Director> directorList;

    public DirectorAdapter(AppCompatActivity activity, List<Director> directorList) {
        this.activity = activity;
        this.directorList = directorList;
    }

    @NonNull
    @Override
    public DirectorAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_director, parent, false);
        DirectorAdapter.MyViewHolder holder = new DirectorAdapter.MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final DirectorAdapter.MyViewHolder holder, int position) {
        holder.img_diretor.setImageResource(directorList.get(position).getFotoDiretor());
        holder.txt_nomeDiretor.setText(directorList.get(position).getNomeDiretor());
        holder.txt_dataNascimentoDiretor.setText(directorList.get(position).getDataNascimentoDiretor());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),directorList.get(holder.getAdapterPosition()).getNomeDiretor(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return directorList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView txt_nomeDiretor;
        private TextView txt_dataNascimentoDiretor;
        private ImageView img_diretor;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_nomeDiretor = (TextView) itemView.findViewById(R.id.txt_nomeDiretor);
            txt_dataNascimentoDiretor = (TextView) itemView.findViewById(R.id.txt_nascDiretor);
            img_diretor = (ImageView) itemView.findViewById(R.id.img_diretor);
        }
    }

    public void insertItem(Director diretor) {
        directorList.add(diretor);
        notifyItemInserted(getItemCount());
    }
}