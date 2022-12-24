package com.example.pokedex;


import com.example.pokedex.controllers.PokemonDataBaseController;
import com.example.pokedex.model.PokemonDataBase;
import com.example.pokedex.model.PokemonFileBase;
import com.example.pokedex.utilities.ConsoleLogUtility;
import com.example.pokedex.utilities.FileLogUtility;
import com.example.pokedex.view.PokemonHtmlView;
import com.example.pokedex.view.PokemonTextView;

import java.io.IOException;

public class Pokedex {
    static String[] description = new String[2];
    public static void main(String[] args) throws IOException {
        PokemonDataBaseController findPokemon = new PokemonDataBaseController();
        //If it has 2 arguments, it access the local file database, otherwise it acces the online API
        if(args.length < 2){
            PokemonDataBase pokemon = findPokemon.getPokemonApi(Integer.parseInt(args[0]));
            description[0] = pokemon.weight;
            description[1] = pokemon.size;
            PokemonTextView pokemonView = new PokemonTextView(description, pokemon.name);
            PokemonHtmlView pokemonHtmlView = new PokemonHtmlView(description, pokemon.name, args[0]);
            FileLogUtility.logHtmlToFile("./output.html", pokemonHtmlView);
            ConsoleLogUtility.logTextToConsole(pokemonView);
        }
        else{
            PokemonFileBase pokemon = findPokemon.getPokemonFileBase(Integer.parseInt(args[0]),args[1]);
            description[0] = pokemon.description;
            PokemonTextView pokemonView = new PokemonTextView(description, pokemon.name);
            PokemonHtmlView pokemonHtmlView = new PokemonHtmlView(description, pokemon.name, args[0]);
            FileLogUtility.logHtmlToFile("./output.html", pokemonHtmlView);
            ConsoleLogUtility.logTextToConsole(pokemonView);
        }
    }
}
