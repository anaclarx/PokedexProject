package com.example.pokedex.model;

import com.example.pokedex.controllers.PokemonDataBaseController;

//The class should extend or implement pokemon?
public class PokemonDataBase extends Pokemon {

    private PokemonDataBaseController dataBaseInfo;

    public PokemonDataBase(PokemonDataBaseController dataBaseInfo){
        this.dataBaseInfo = dataBaseInfo;
    }

    private String size;
    private String weight;

    private Pokemon pokemon;

    public void PokemonDatBase(){};

    public String getSize(){
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWeight(){
        return weight;
    }

    public void setWeight(String weight){
        this.weight = weight;
    }

    @Override
    public String getDataBase() {
        return null;
    }


    //Should it be abstract at Pokemon class??


}
