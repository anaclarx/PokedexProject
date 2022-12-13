package com.example.pokedex.controllers;

import com.example.pokedex.model.Pokemon;
import com.example.pokedex.model.PokemonDataBase;
import com.example.pokedex.model.PokemonFileBase;
import com.example.pokedex.services.PokemonDataBaseDao;
import com.example.pokedex.services.PokemonDataBaseDaoImpl;
import com.example.pokedex.services.PokemonFileBaseDaoImpl;

public class PokemonDataBaseController {
    private PokemonDataBaseDaoImpl pokemonDataBaseDaoImpl = new PokemonDataBaseDaoImpl();

    private PokemonFileBaseDaoImpl pokemonFileBaseDaoImpl = new PokemonFileBaseDaoImpl();
    //instantiate dao impl
    public PokemonFileBase getPokemonFileBase(int id, String file){
            String name = pokemonFileBaseDaoImpl.getPokemonName(id, file);
            String description = pokemonFileBaseDaoImpl.getPokemonInfo(id, file)[0];
            return new PokemonFileBase(name, description);
        }

    public PokemonDataBase getPokemonApi(int id){
            String name = pokemonDataBaseDaoImpl.getPokemonName(id, "");
            String weight = pokemonDataBaseDaoImpl.getPokemonInfo(id, "")[0];
            String size = pokemonDataBaseDaoImpl.getPokemonInfo(id, "")[1];
            return new PokemonDataBase(name,weight,size);
        }


}
