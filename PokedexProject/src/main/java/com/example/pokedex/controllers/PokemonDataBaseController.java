package com.example.pokedex.controllers;

import com.example.pokedex.model.Pokemon;
import com.example.pokedex.model.PokemonDataBase;
import com.example.pokedex.services.PokemonDataBaseDao;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class PokemonDataBaseController {
    private final PokemonDataBaseDao pokemonDataBaseDao;

    public PokemonDataBaseController(PokemonDataBaseDao pokemonDataBaseDao) {
        this.pokemonDataBaseDao = pokemonDataBaseDao;
    }

    public Pokemon accessDataBase(int id){
        return pokemonDataBaseDao.accessDataBase(id);
    }

}
