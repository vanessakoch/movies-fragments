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
import com.example.movies_fragments.entities.Actor;

import java.util.List;

public class ActorAdapter extends RecyclerView.Adapter<ActorAdapter.MyViewHolder> {

    MainActivity activity;
    List<Actor> actorList;

    public ActorAdapter(MainActivity activity) {
        this.activity = activity;
        this.actorList = activity.actorsList();
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
        holder.img_ator.setImageResource(actorList.get(position).getFotoAtor());
        holder.txt_nomeAtor.setText(actorList.get(position).getNomeAtor());
        holder.txt_dataNascimentoAtor.setText(actorList.get(position).getDataNascimentoAtor());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),actorList.get(holder.getAdapterPosition()).getNomeAtor(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return actorList.size();
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
        actorList.add(ator);
        notifyItemInserted(getItemCount());
    }
}