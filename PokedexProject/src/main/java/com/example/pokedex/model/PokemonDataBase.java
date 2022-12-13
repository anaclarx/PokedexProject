package com.example.pokedex.model;

import com.example.pokedex.controllers.PokemonDataBaseController;

//The class should extend or implement pokemon?
public class PokemonDataBase extends Pokemon {

    public String size;

    public String weight;

    //private Pokemon pokemon;

    public PokemonDataBase(String name,String weight, String size) {
        super(name);
        this.weight = weight;
        this.size = size;
    }


    public String getSize(){ return  this.size;}

    public String getWeight(){ return  this.weight;}

    @Override
    String[] getDescription() {
        String[] description = new String[2];
        description[0] = this.weight;
        description[1] = this.size;
        return description;
    }

    //Should it be abstract at Pokemon class??


}
