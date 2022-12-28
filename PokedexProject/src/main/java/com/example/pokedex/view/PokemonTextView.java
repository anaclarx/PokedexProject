package com.example.pokedex.view;

import com.example.pokedex.model.Pokemon;
import com.example.pokedex.utilities.OutPutGeneratorInterfaceText;

public class PokemonTextView implements OutPutGeneratorInterfaceText {
    /*
    * THis file creates the implementation of the output showed at the console when the code is builded.
    * */
    public String[] pokemonDescription;
    public String pokemonName;

    public PokemonTextView(String[] pokemonDescription, String pokemonName){
        this.pokemonDescription = pokemonDescription;
        this.pokemonName = pokemonName;
    }
    @Override
    public String generateText() {
        String str = "=============================";
        str = str + "\nName : " + this.pokemonName;
        if(pokemonDescription[1] != null){
            str = str + "\n Weight : " + this.pokemonDescription[0];
            str = str + "\n Height : " + this.pokemonDescription[1];
        }
        else{
            str = str + "\nDescription : " + this.pokemonDescription[0];
        }
        str = str + "\n =============================";
        /* etc  */
        return str;
    }
}
