package com.example.movies_fragments.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movies_fragments.MainActivity;
import com.example.movies_fragments.R;
import com.example.movies_fragments.controller.ActorController;
import com.example.movies_fragments.entities.Actor;

public class ActorAdapter extends RecyclerView.Adapter<ActorAdapter.MyViewHolder> {
    MainActivity activity;
    ActorController controller;

    public ActorAdapter(MainActivity activity) {
        this.activity = activity;
        this.controller = ActorController.getController();
    }

    @NonNull
    @Override
    public ActorAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_actor, parent, false);
        ActorAdapter.MyViewHolder holder = new ActorAdapter.MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ActorAdapter.MyViewHolder holder, int position) {
        holder.img_ator.setImageResource(controller.getListAtor().get(position).getFotoAtor());
        holder.txt_nomeAtor.setText(controller.getListAtor().get(position).getNomeAtor());
        holder.txt_dataNascimentoAtor.setText(controller.getListAtor().get(position).getDataNascimentoAtor());
    }

    @Override
    public int getItemCount() {
        return controller.getListAtor().size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView txt_nomeAtor;
        private TextView txt_dataNascimentoAtor;
        private ImageView img_ator;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_nomeAtor = (TextView) itemView.findViewById(R.id.txt_nomeAtor);
            txt_dataNascimentoAtor = (TextView) itemView.findViewById(R.id.txt_nascAtor);
            img_ator = (ImageView) itemView.findViewById(R.id.img_ator);
        }
    }

    public void insertItem(Actor ator) {
        controller.getListAtor().add(ator);
        notifyItemInserted(getItemCount());
    }
}