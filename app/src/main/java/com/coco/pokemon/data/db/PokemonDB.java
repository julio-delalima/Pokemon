package com.coco.pokemon.data.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.coco.pokemon.data.model.Pokemon;


/**
 * Created by Abhinav Singh on 17,June,2020
 */
@Database(entities = {Pokemon.class},version = 2,exportSchema = false)
public abstract class PokemonDB extends RoomDatabase {
        public abstract PokemonDAO pokeDao();
}
