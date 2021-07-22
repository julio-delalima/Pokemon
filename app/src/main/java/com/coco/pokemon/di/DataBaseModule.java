package com.coco.pokemon.di;

import android.app.Application;

import androidx.room.Room;

import com.coco.pokemon.data.db.PokemonDAO;
import com.coco.pokemon.data.db.PokemonDB;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;

/**
 * Created by Abhinav Singh on 17,June,2020
 */

@Module
@InstallIn(ApplicationComponent.class)
public class DataBaseModule {

    @Provides
    @Singleton
    public static PokemonDB providePokemonDB(Application application){
         return Room.databaseBuilder(application,PokemonDB.class,"Favorite Database")
                 .fallbackToDestructiveMigration()
                 .allowMainThreadQueries()
                 .build();
    }

    @Provides
    @Singleton
    public static PokemonDAO providePokeDao(PokemonDB pokemonDB){
        return pokemonDB.pokeDao();
    }
}
