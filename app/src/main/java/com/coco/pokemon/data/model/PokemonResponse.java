package com.coco.pokemon.data.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PokemonResponse {
    private Integer count;
    private String next, previous;
    private ArrayList<Pokemon> results;

    public PokemonResponse(Integer count, String next, String previous, ArrayList<Pokemon> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }
}
