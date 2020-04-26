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
import com.example.movies_fragments.fragments.FragmentAddMovie;
import com.example.movies_fragments.fragments.FragmentInsertActor;
import com.example.movies_fragments.fragments.FragmentInsertDirector;
import com.example.movies_fragments.fragments.FragmentDirector;
import com.example.movies_fragments.fragments.FragmentMovie;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
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

    public List<Director> directorsList(){
        if (this.directorList == null) {
            this.directorList = new ArrayList<Director>();

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
        return this.directorList;
    }

    public List<Actor> actorsList(){
        if (this.actorList == null) {
            this.actorList = new ArrayList<Actor>();

            actorList.add(new Actor(R.drawable.rosa_salazar, "Rosa Salazar", "16/07/1985"));
            actorList.add(new Actor(R.drawable.ben_affleck, "Ben Affleck", "15/08/1972"));
            actorList.add(new Actor(R.drawable.harrison_ford, "Harrison Ford", "13/07/1942"));
            actorList.add(new Actor(R.drawable.brie_larson, "Brie Larson", "01/10/1989"));
            actorList.add(new Actor(R.drawable.chris_evans, "Christopher R. Evans", "13/06/1981"));
            actorList.add(new Actor(R.drawable.joaquin_phoenix, "Joaquin Phoenix", "28/10/1974"));
            actorList.add(new Actor(R.drawable.chris_pratt, "Chris Pratt", "21/06/1979"));
            actorList.add(new Actor(R.drawable.tom_hardy, "Tom Hardy", "15/09/1977"));
            actorList.add(new Actor(R.drawable.mahershala_ali, "Mahershala Ali", "16/02/1974"));
            actorList.add(new Actor(R.drawable.chadwick_boseman, "Chadwick Boseman", "29/11/1976"));
            actorList.add(new Actor(R.drawable.daisy_ridley, "Daisy Ridley", "10/04/1992"));
        }
        return this.actorList;
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
        fragmentTransaction.replace(R.id.frame_filme, new FragmentAddMovie(this)).commit();
    }
}
