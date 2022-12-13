package com.example.pokedex.model;
import java.util.List;

public abstract class Pokemon {
    private int id;
    public String name;

    public Pokemon(String name){
        this.name = name;
    }

    abstract String[] getDescription();



}
