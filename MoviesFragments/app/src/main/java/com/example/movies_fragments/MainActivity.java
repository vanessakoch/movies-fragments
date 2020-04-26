package com.example.movies_fragments;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.example.movies_fragments.adapters.PagerAdapter;
import com.example.movies_fragments.entities.Actor;
import com.example.movies_fragments.entities.Director;
import com.example.movies_fragments.fragments.FragmentActor;
import com.example.movies_fragments.fragments.FragmentInsertMovie;
import com.example.movies_fragments.fragments.FragmentInsertActor;
import com.example.movies_fragments.fragments.FragmentInsertDirector;
import com.example.movies_fragments.fragments.FragmentDirector;
import com.example.movies_fragments.fragments.FragmentMovie;
import com.google.android.material.tabs.TabLayout;

import java.util.List;

public class MainActivity extends AppCompatActivity  {
    TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter adapter;
    List<Director> directorList;
    List<Actor> actorList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new PagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        adapter.add(new FragmentMovie(this), "MOVIES");
        adapter.add(new FragmentActor(this), "ACTORS");
        adapter.add(new FragmentDirector(this), "DIRECTORS");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_film);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_star);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_directors);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);


    }
    public void newFragmentDirector(View v){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_diretor, new FragmentInsertDirector(this)).commit();
    }

    public void newFragmentAtor(View v){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_ator, new FragmentInsertActor(this)).commit();
    }

    public void newFragmentMovie(View v){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_filme, new FragmentInsertMovie(this)).commit();
    }
}
