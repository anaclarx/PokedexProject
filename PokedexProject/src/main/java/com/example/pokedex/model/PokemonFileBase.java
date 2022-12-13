package com.example.pokedex.model;

public class PokemonFileBase extends Pokemon{

    private String filePath;

    private String description;

    public String getDescription(){return this.description;}

    public void setDescription(String description){this.description = description;}


    @Override
    public String getDataBase() {
        return this.filePath;
    }

    public void setFilePath(String filePath){
        this.filePath = filePath;
    }
}
