package com.example.pokedex;


import com.example.pokedex.controllers.PokemonDataBaseController;
import com.example.pokedex.model.Pokemon;
import com.example.pokedex.model.PokemonDataBase;
import com.example.pokedex.model.PokemonFileBase;

public class Pokedex {

    public static void main(String[] args) {
//        System.out.println("Java version " + System.getProperty("java.version"));
//        System.out.println("It's working !");
//        if (args.length > 0) {
//            System.out.println("Vous avez fourni l'argument " + args[0]);
//        }

        PokemonDataBaseController findPokemon = new PokemonDataBaseController();
        if(args.length < 2){
            PokemonDataBase pokemon = findPokemon.getPokemonApi(Integer.parseInt(args[0]));
            System.out.println("Pokémon name " + pokemon.name);
            System.out.println("Pokémon description : weight (" +
                    pokemon.weight +
                    "), height (" +
                    pokemon.size +
                    ")"
            );
        }
        else{
            PokemonFileBase pokemon = findPokemon.getPokemonFileBase(Integer.parseInt(args[0]),args[1]);
            System.out.println("Pokémon name " + pokemon.name);
            System.out.println("Pokémon description " + pokemon.description);

        }
//        SQLLiteExample.run();
//        HTTPRequestExample.run();
    }

    public String getName() {
        return "Hello";
    }
}
