package com.example.pokedex.model;
import java.util.List;

public abstract class Pokemon {
    private int id;
    private String name;

    public Pokemon(String name){
        this.name = name;
    }

    public Pokemon(){}

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }



    public abstract String getDataBase();
}
