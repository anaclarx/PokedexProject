package com.example.pokedex.view;

import com.example.pokedex.controllers.PokemonDataBaseController;
import com.example.pokedex.model.PokemonDataBase;
import com.example.pokedex.model.PokemonFileBase;
import com.example.pokedex.utilities.FileLogUtility;

import java.io.IOException;

public class PokemonOutPut {
    public static void main(String[] args) {
        PokemonDataBaseController findPokemon = new PokemonDataBaseController();
        if(args.length < 2){
            PokemonDataBase pokemon = findPokemon.getPokemonApi(Integer.parseInt(args[0]));
            String[] description = new String[2];
            description[0] = pokemon.weight;
            description[1] = pokemon.size;
            System.out.println("Pokémon name " + pokemon.name);
            System.out.println("Pokémon description : weight (" +
                    pokemon.weight +
                    "), height (" +
                    pokemon.size +
                    ")"
            );
            //FileLogUtility.logHtmlToFile(pokemon.name, description, "/BonnesPratiuques/emse_solid_lesson/PokedexProject/src/main/java/com/example/pokedex/output.html");
        }
        else{
            PokemonFileBase pokemon = findPokemon.getPokemonFileBase(Integer.parseInt(args[0]),args[1]);
            String[] description = new String[1];
            description[0] = pokemon.description;
            System.out.println("Pokémon name " + pokemon.name);
            System.out.println("Pokémon description " + pokemon.description);
            //FileLogUtility.logHtmlToFile(pokemon.name, description, "/BonnesPratiuques/emse_solid_lesson/PokedexProject/src/main/java/com/example/pokedex/output.html");

        }
    }
}
