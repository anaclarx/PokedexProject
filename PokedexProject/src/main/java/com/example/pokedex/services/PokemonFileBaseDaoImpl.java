package com.example.pokedex.services;

import com.example.pokedex.model.Pokemon;
import com.example.pokedex.model.PokemonFileBase;

import java.sql.*;

public class PokemonFileBaseDaoImpl implements PokemonDataBaseDao {

    @Override
    public String getPokemonName(int id, String file) {
        Connection conn = null;
        String name = "";
        try {
            // db parameters
            String url = "jdbc:sqlite:../sujet_TP/ressources/" + file;
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");

            PreparedStatement stmt = conn.prepareStatement("SELECT name, description FROM pokemons WHERE id = ?");
            stmt.setInt(1, 3); // Sets the value "3" for parameter at position 1
            ResultSet rs = stmt.executeQuery();
            rs.next();
            name = rs.getString("name");
        } catch (SQLException e) {
        }
        return name;
    }

    @Override
    public String[] getPokemonInfo(int id,  String file) {
        String[] arrayInfo = new String[2];
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:../sujet_TP/ressources/pokemondatabase.sqlite";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");

            PreparedStatement stmt = conn.prepareStatement("SELECT name, description FROM pokemons WHERE id = ?");
            stmt.setInt(1, 3); // Sets the value "3" for parameter at position 1
            ResultSet rs = stmt.executeQuery();
            rs.next();
            arrayInfo[0] = rs.getString("description");
        } catch (SQLException e) {
        }
        return arrayInfo;
    }
}
