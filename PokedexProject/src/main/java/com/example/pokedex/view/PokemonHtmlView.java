package com.example.pokedex.view;

import com.example.pokedex.utilities.OutputGeneratorInterfaceHtml;

public class PokemonHtmlView implements OutputGeneratorInterfaceHtml {
    public String[] pokemonDescription;
    public String pokemonId;
    public String pokemonName;

    public PokemonHtmlView(String[] pokemonDescription, String pokemonName, String pokemonId){
        this.pokemonDescription = pokemonDescription;
        this.pokemonName = pokemonName;
        this.pokemonId = pokemonId;
    }
    @Override
    public String generateHtml() {
        String str = "<h1>" + pokemonName + "</h1>\n\t<ul>";
        str = str + "\n\t<li>Id:" + pokemonId + "</li>";
        if(pokemonDescription[1] != null) {
            str = str + "\n\t<li>Size:" + pokemonDescription[1] + "</li>";
            str = str + "\n\t<li>Weight:" + pokemonDescription[0] + "</li>";
        }
        else{
            str = str + "\n\t<li>Description:" + pokemonDescription[0] + "</li>";
        }
        str = str + "\n\t</ul>";
        return str;
    }
}
