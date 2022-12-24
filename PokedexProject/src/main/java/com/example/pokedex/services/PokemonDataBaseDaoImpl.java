package com.example.pokedex.services;

import com.example.pokedex.controllers.PokemonDataBaseController;
import com.example.pokedex.model.Pokemon;
import com.example.pokedex.model.PokemonDataBase;
import com.example.pokedex.model.PokemonFileBase;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class PokemonDataBaseDaoImpl implements PokemonDataBaseDao {
    //I created two separate functions to make more logical the way to create the log output and the html file.
    @Override
    public String getPokemonName(int id, String file) {
        String jsonResponse = "";
        String name = "";
        try {
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet("https://pokeapi.co/api/v2/pokemon/" + Integer.toString(id));
            request.addHeader("content-type", "application/json");
            HttpResponse result = httpClient.execute(request);
            jsonResponse = EntityUtils.toString(result.getEntity(), "UTF-8");

            JSONParser parser = new JSONParser();
            Object resultObject = parser.parse(jsonResponse);
            if (resultObject instanceof JSONObject) {
                JSONObject obj =(JSONObject)resultObject;
                name = obj.get("name").toString();
            } else {
                System.err.println("Error, we expected a JSON Object from the API");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.err.println("Could not parse the response given by the API as JSON");
            System.err.println("Response body is :");
            System.err.println(jsonResponse);
            e.printStackTrace();
        }
        return name;
    }

    @Override
    public String[] getPokemonInfo(int id, String file) {
        String jsonResponse = "";
        String[] arrayInfo = new String[2];
        try {
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet("https://pokeapi.co/api/v2/pokemon/" + Integer.toString(id));
            request.addHeader("content-type", "application/json");
            HttpResponse result = httpClient.execute(request);
            jsonResponse = EntityUtils.toString(result.getEntity(), "UTF-8");

            JSONParser parser = new JSONParser();
            Object resultObject = parser.parse(jsonResponse);
            if (resultObject instanceof JSONObject) {
                JSONObject obj =(JSONObject)resultObject;
                String weight = obj.get("weight").toString();
                String size = obj.get("height").toString();
                arrayInfo[0] = weight;
                arrayInfo[1] = size;
            } else {
                System.err.println("Error, we expected a JSON Object from the API");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.err.println("Could not parse the response given by the API as JSON");
            System.err.println("Response body is :");
            System.err.println(jsonResponse);
            e.printStackTrace();
        }
        return arrayInfo;
    }
}
