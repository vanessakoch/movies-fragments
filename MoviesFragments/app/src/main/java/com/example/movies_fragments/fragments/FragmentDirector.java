package com.example.movies_fragments.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movies_fragments.R;
import com.example.movies_fragments.adapters.RecyclerDirectorAdapter;
import com.example.movies_fragments.entities.Director;

import java.util.ArrayList;
import java.util.List;

public class FragmentDirector extends Fragment {
    View view;
    private RecyclerView recyclerView;
    private List<Director> directorList;

    public FragmentDirector(){
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.director_fragment, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.diretor_recyclerview);
        RecyclerDirectorAdapter adapter = new RecyclerDirectorAdapter(getContext(), directorList);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        directorList = new ArrayList<Director>();
        directorList.add(new Director(R.drawable.robert_rodriguez,"Robert Rodriguez","20/06/1968"));
        directorList.add(new Director(R.drawable.zack_snyder,"Zack Snyder","01/03/1966"));
        directorList.add(new Director(R.drawable.denis_villeneuve,"Denis Villeneuve","03/10/1967"));
        directorList.add(new Director(R.drawable.anna_boden,"Anna Boden","20/09/1976"));
        directorList.add(new Director(R.drawable.anthony_russo,"Anthony Russo","03/02/1970"));
        directorList.add(new Director(R.drawable.todd_phillips,"Todd Phillips","20/12/1970"));
        directorList.add(new Director(R.drawable.ja_bayona,"Juan A. García Bayona","09/05/1975"));
        directorList.add(new Director(R.drawable.george_miller,"George Miller","03/03/1945"));
        directorList.add(new Director(R.drawable.barry_jenkins,"Barry Jenkins","19/11/1979"));
        directorList.add(new Director(R.drawable.ryan_coogler,"Ryan Coogler","03/05/1986"));
        directorList.add(new Director(R.drawable.jj_abrams,"Jeffrey Jacob Abrams","27/06/1966"));

    }
}
