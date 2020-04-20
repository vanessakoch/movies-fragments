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
import com.example.movies_fragments.adapters.RecyclerActorAdapter;
import com.example.movies_fragments.entities.Actor;

import java.util.ArrayList;
import java.util.List;

public class FragmentActor extends Fragment {
    View view;
    private RecyclerView recyclerView;
    private List<Actor> actorList;

    public FragmentActor(){
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.actor_fragment, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.actor_recyclerview);
        RecyclerActorAdapter adapter = new RecyclerActorAdapter(getContext(), actorList);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        actorList = new ArrayList<Actor>();
        actorList.add(new Actor(R.drawable.rosa_salazar,"Rosa Salazar","16/07/1985"));
        actorList.add(new Actor(R.drawable.ben_affleck,"Ben Affleck","15/08/1972"));
        actorList.add(new Actor(R.drawable.harrison_ford,"Harrison Ford","13/07/1942"));
        actorList.add(new Actor(R.drawable.brie_larson,"Brie Larson","01/10/1989"));
        actorList.add(new Actor(R.drawable.chris_evans,"Christopher R. Evans","13/06/1981"));
        actorList.add(new Actor(R.drawable.joaquin_phoenix,"Joaquin Phoenix","28/10/1974"));
        actorList.add(new Actor(R.drawable.chris_pratt,"Chris Pratt","21/06/1979"));
        actorList.add(new Actor(R.drawable.tom_hardy,"Tom Hardy","15/09/1977"));
        actorList.add(new Actor(R.drawable.mahershala_ali,"Mahershala Ali","16/02/1974"));
        actorList.add(new Actor(R.drawable.chadwick_boseman,"Chadwick Boseman","29/11/1976"));
        actorList.add(new Actor(R.drawable.daisy_ridley,"Daisy Ridley","10/04/1992"));

    }
}
