package com.pilleriina.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pilleriina.main.entity.Recipe;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
	
	public List<Recipe> findRecipeByRecName(String recName);
	

}
