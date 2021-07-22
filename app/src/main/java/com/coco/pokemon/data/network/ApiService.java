package com.coco.pokemon.data.network;

import com.coco.pokemon.data.model.PokemonResponse;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface ApiService {
    @GET("pokemon")
    Observable<PokemonResponse> getPokemons();
}
