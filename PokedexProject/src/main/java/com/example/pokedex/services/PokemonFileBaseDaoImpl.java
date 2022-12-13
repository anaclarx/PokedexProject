package com.example.pokedex.services;

import com.example.pokedex.model.Pokemon;
import com.example.pokedex.model.PokemonFileBase;

import java.sql.*;

public class PokemonFileBaseDaoImpl implements PokemonFileBaseDao {

    private PokemonFileBase pokemon;

    @Override
    public Pokemon accessFileBase(int id) {
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
            String name = rs.getString("name");
            String description = rs.getString("description");
            pokemon.setName(name);
            pokemon.setDescription(description);
        } catch (SQLException e) {
        }
        return pokemon;
    }
}
