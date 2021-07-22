package com.coco.pokemon.data.repository;

import androidx.lifecycle.LiveData;

import com.coco.pokemon.data.db.PokemonDAO;
import com.coco.pokemon.data.model.Pokemon;
import com.coco.pokemon.data.model.PokemonResponse;
import com.coco.pokemon.data.network.ApiService;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Observable;

public class PokemonRepository {

    private final PokemonDAO pokeDao;
    private final ApiService apiService;

    @Inject
    public PokemonRepository(PokemonDAO pokeDao, ApiService apiService) {
        this.pokeDao = pokeDao;
        this.apiService = apiService;
    }


    public Observable<PokemonResponse> getPokemons() {
        return apiService.getPokemons();
    }


    public void insertPokemon(Pokemon pokemon) {
        pokeDao.insertPokemon(pokemon);
    }

    public void deletePokemon(String pokemonName) {
        pokeDao.deletePokemon(pokemonName);
    }

    public void deleteAll() {
        pokeDao.deleteAll();
    }

    public LiveData<List<Pokemon>> getFavoritePokemon() {
        return pokeDao.getFavoritePokemons();
    }
}
