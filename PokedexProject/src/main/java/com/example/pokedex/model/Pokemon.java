package com.example.pokedex.model;
import java.util.List;

public abstract class Pokemon {
    private int id;
    public String name;

    public Pokemon(String name){
        this.name = name;
    }
    //The description depends on the databse used, if it is the local file, it has lenght = 1, since it gets just the description,
    //if it has lenght > 1, it accessed the API and has weight and size as descriptions parameters.
    abstract String[] getDescription();



}
