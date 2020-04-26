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

import com.example.movies_fragments.MainActivity;
import com.example.movies_fragments.R;
import com.example.movies_fragments.adapters.DirectorAdapter;

public class FragmentDirector extends Fragment {
    View view;
    RecyclerView recyclerView;
    MainActivity activity;
    DirectorAdapter adapter;

    public FragmentDirector(MainActivity activity) {
        this.activity = activity;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.director_fragment, container, false);

        adapter = new DirectorAdapter(activity);

        recyclerView = (RecyclerView) view.findViewById(R.id.diretor_recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        recyclerView.setAdapter(adapter);

        return view;
    }

}
