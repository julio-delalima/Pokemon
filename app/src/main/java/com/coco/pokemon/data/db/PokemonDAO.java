package com.coco.pokemon.data.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.coco.pokemon.data.model.Pokemon;

import java.util.List;


/**
 * Created by Abhinav Singh on 17,June,2020
 */

@Dao
public interface PokemonDAO {

    @Insert
    void insertPokemon(Pokemon pokemon);

    @Query("DELETE FROM favorites WHERE name = :pokemonName")
    void deletePokemon(String pokemonName);

    @Query("DELETE FROM favorites")
    void deleteAll();

    @Query("SELECT * FROM favorites")
    LiveData<List<Pokemon>> getFavoritePokemons();
}
