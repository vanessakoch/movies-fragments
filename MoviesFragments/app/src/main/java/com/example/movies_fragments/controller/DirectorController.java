package com.example.movies_fragments.controller;

import com.example.movies_fragments.R;
import com.example.movies_fragments.entities.Director;

import java.util.ArrayList;
import java.util.List;

public class DirectorController {
    private List<Director> directorList;
    private static DirectorController controller;

    public DirectorController(){
        initDirectorsList();
    }

    private List<Director> initDirectorsList() {
        if (this.directorList == null) {
            this.directorList = new ArrayList<Director>();
            directorList.add(new Director(R.drawable.robert_rodriguez, "Robert Rodriguez", "20/06/1968"));
            directorList.add(new Director(R.drawable.zack_snyder, "Zack Snyder", "01/03/1966"));
            directorList.add(new Director(R.drawable.denis_villeneuve, "Denis Villeneuve", "03/10/1967"));
            directorList.add(new Director(R.drawable.anna_boden, "Anna Boden", "20/09/1976"));
            directorList.add(new Director(R.drawable.anthony_russo, "Anthony Russo", "03/02/1970"));
            directorList.add(new Director(R.drawable.todd_phillips, "Todd Phillips", "20/12/1970"));
            directorList.add(new Director(R.drawable.ja_bayona, "Juan A. García Bayona", "09/05/1975"));
            directorList.add(new Director(R.drawable.george_miller, "George Miller", "03/03/1945"));
            directorList.add(new Director(R.drawable.barry_jenkins, "Barry Jenkins", "19/11/1979"));
            directorList.add(new Director(R.drawable.ryan_coogler, "Ryan Coogler", "03/05/1986"));
            directorList.add(new Director(R.drawable.jj_abrams, "Jeffrey Jacob Abrams", "27/06/1966"));
        }
        return this.directorList;
    }

    public List<Director> getListDiretor() {
        return directorList;
    }

    public DirectorController getController(){
        if(controller == null){
            controller = new DirectorController();
        }
        return controller;
    }

}


