package com.example.pokedex.controllers;

import com.example.pokedex.model.Pokemon;
import com.example.pokedex.services.PokemonDataBaseDao;
import com.example.pokedex.services.PokemonFileBaseDao;

public class PokemonFileBaseController{

    private final PokemonFileBaseDao pokemonFileBaseDao;

    public PokemonFileBaseController(PokemonFileBaseDao pokemonFileBaseDao) {
        this.pokemonFileBaseDao = pokemonFileBaseDao;
    }

    public Pokemon accessFileBase(int id){
        return pokemonFileBaseDao.accessFileBase(id);
    }

}
