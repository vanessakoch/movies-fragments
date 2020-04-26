package com.example.movies_fragments.fragments;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.movies_fragments.MainActivity;
import com.example.movies_fragments.R;
import com.example.movies_fragments.adapters.ActorAdapter;
import com.example.movies_fragments.controller.ActorController;
import com.example.movies_fragments.entities.Actor;

import java.util.Calendar;

public class FragmentInsertActor extends Fragment {
    ImageView img_ator;
    EditText nome_ator;
    EditText date_ator;
    Button btnadd_ator;
    DatePickerDialog picker;
    ActorAdapter adapterAtor;
    MainActivity activity;

    public FragmentInsertActor(MainActivity activity) {
        this.activity = activity;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.add_actor, container, false);

        adapterAtor = new ActorAdapter(activity);

        img_ator = (ImageView) view.findViewById(R.id.img_actornovo);
        nome_ator = (EditText) view.findViewById(R.id.txtNomeAtor);
        date_ator = (EditText) view.findViewById(R.id.txtDateAtor);
        btnadd_ator = (Button) view.findViewById(R.id.btnAddAtor);

        selecionaCalendario(date_ator);

        btnadd_ator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Actor novo = new Actor(R.drawable.chadwick_boseman, String.valueOf(nome_ator.getText()), String.valueOf(date_ator.getText()));
            adapterAtor.insertItem(novo);
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame_ator, new FragmentActor(activity)).commit();
            }
        });

        return view;
    }


    private void selecionaCalendario(EditText date){
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int dia = calendar.get(Calendar.DAY_OF_MONTH);
                int mes = calendar.get(Calendar.MONTH);
                int ano = calendar.get(Calendar.YEAR);

                picker = new DatePickerDialog(getContext(),
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                                date_ator.setText(i2 + "/" + (i1 + 1) + "/" + i);
                            }
                        }, ano, mes, dia);

                picker.show();
            }
        });

    }

}
