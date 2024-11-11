package com.huyvnnb.taco_cloud.repository;

import com.huyvnnb.taco_cloud.model.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);
    Ingredient save(Ingredient ingredient);
}
