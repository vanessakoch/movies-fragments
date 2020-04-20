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
import com.example.movies_fragments.entities.Director;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class RecyclerDirectorAdapter extends RecyclerView.Adapter<RecyclerDirectorAdapter.MyViewHolder> {

    Context mContext;
    List<Director> directorList;

    public RecyclerDirectorAdapter(Context mContext, List<Director> directorList) {
        this.mContext = mContext;
        this.directorList = directorList;
    }

    @NonNull
    @Override
    public RecyclerDirectorAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.item_director, parent, false);
        RecyclerDirectorAdapter.MyViewHolder holder = new RecyclerDirectorAdapter.MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerDirectorAdapter.MyViewHolder holder, int position) {
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
        private FloatingActionButton btnDiretor;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_nomeDiretor = (TextView) itemView.findViewById(R.id.txt_nomeDiretor);
            txt_dataNascimentoDiretor = (TextView) itemView.findViewById(R.id.txt_nascDiretor);
            img_diretor = (ImageView) itemView.findViewById(R.id.img_diretor);
            btnDiretor = (FloatingActionButton) itemView.findViewById(R.id.btnDiretor);
        }
    }

    public void insertItem(Director diretor) {
        directorList.add(diretor);
        notifyItemInserted(getItemCount());
    }
}
