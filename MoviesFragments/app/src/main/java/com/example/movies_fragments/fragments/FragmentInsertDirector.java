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
import com.example.movies_fragments.adapters.DirectorAdapter;
import com.example.movies_fragments.entities.Director;

import java.util.Calendar;

public class FragmentInsertDirector extends Fragment {
    ImageView img_diretor;
    EditText nome_diretor;
    EditText date_diretor;
    Button btnadd_diretor;
    DatePickerDialog picker;
    DirectorAdapter adapterDiretor;
    MainActivity activity;

    public FragmentInsertDirector(MainActivity activity) {
        this.activity = activity;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.add_director, container, false);

        adapterDiretor = new DirectorAdapter(activity);

        img_diretor = (ImageView) view.findViewById(R.id.img_diretornovo);
        nome_diretor = (EditText) view.findViewById(R.id.txtNomeDiretor);
        date_diretor = (EditText) view.findViewById(R.id.txtDateDiretor);
        btnadd_diretor = (Button) view.findViewById(R.id.btnAddDiretor);

        selecionaCalendario(date_diretor);

        btnadd_diretor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Director novo = new Director(R.drawable.emptydirector, String.valueOf(nome_diretor.getText()), String.valueOf(date_diretor.getText()));
                adapterDiretor.insertItem(novo);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_diretor, new FragmentDirector(activity)).commit();
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
                            date_diretor.setText(i2 + "/" + (i1 + 1) + "/" + i);
                        }
                    }, ano, mes, dia);

            picker.show();
            }
        });

    }

}
