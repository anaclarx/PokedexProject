package com.example.pokedex.model;

public class PokemonFileBase extends Pokemon{

    public String filePath;

    public String description;

    public PokemonFileBase(String name, String description) {
        super(name);
        this.description = description;
    }


    @Override
    String[] getDescription() {
        String[] description = new String[1];
        description[0] = this.description;
        return description;
    }
}
