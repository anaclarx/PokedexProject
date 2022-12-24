package com.example.pokedex.view;

import com.example.pokedex.model.Pokemon;
import com.example.pokedex.utilities.OutPutGeneratorInterfaceText;

public class PokemonTextView implements OutPutGeneratorInterfaceText {
    public String[] pokemonDescription;
    public String pokemonName;

    public PokemonTextView(String[] pokemonDescription, String pokemonName){
        this.pokemonDescription = pokemonDescription;
        this.pokemonName = pokemonName;
    }
    @Override
    public String generateText() {
        String str = "=============================";
        str = str + "Name : " + this.pokemonName;
        if(pokemonDescription.length > 1){
            str = str + "\n Weight : " + this.pokemonDescription[0];
            str = str + "\n Height : " + this.pokemonDescription[1];
        }
        else{
            str = str + "Description : " + this.pokemonDescription[0];
        }
        str = str + "\n =============================";
        /* etc  */
        return str;
    }
}
