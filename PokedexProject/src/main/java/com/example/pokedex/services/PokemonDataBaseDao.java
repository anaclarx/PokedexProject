package com.example.pokedex.services;

import com.example.pokedex.model.Pokemon;
import com.example.pokedex.model.PokemonDataBase;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;

public interface PokemonDataBaseDao {

    public String getPokemonName(int id,  String file);

    public String[] getPokemonInfo(int id,  String file);

}
