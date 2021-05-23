package com.patrickramosruas.pokedex.repository;

import com.patrickramosruas.pokedex.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokedexRepository extends ReactiveMongoRepository<Pokemon, String> {
}
