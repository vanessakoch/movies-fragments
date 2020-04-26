package com.example.movies_fragments.controller;

import com.example.movies_fragments.R;
import com.example.movies_fragments.entities.Actor;

import java.util.ArrayList;
import java.util.List;

public class ActorController {
    private List<Actor> actorList;
    private static ActorController controller;

    public ActorController(){
        initActorsList();
    }

    private List<Actor> initActorsList(){
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

    public List<Actor> getListAtor() {
        return actorList;
    }

    public ActorController getController(){
        if(controller == null){
            controller = new ActorController();
        }
        return controller;
    }

}
