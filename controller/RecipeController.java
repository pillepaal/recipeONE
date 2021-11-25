package com.pilleriina.main.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pilleriina.main.entity.Recipe;
import com.pilleriina.main.repository.RecipeRepository;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
	
	@Autowired
	RecipeRepository recipeRepository;

	// insert new recipe into database
	@PostMapping("/add")
	public Recipe addRecipe(@RequestBody Recipe recipe) {

		return recipeRepository.save(recipe);
	}

	// fetch all recipe list from database
	@GetMapping("/all")
	public Iterable<Recipe> allRecipe() {

		return recipeRepository.findAll();
	}

	// fetch specific recipe by their ID
	@GetMapping("/{recipeId}")
	public Optional<Recipe> recipeById(@PathVariable("myRecipeId") int recipeId) {

		return recipeRepository.findById(recipeId);
	}

	// update existing recipe
	@PutMapping("/update")
	public Recipe updateRecipe(@RequestBody Recipe recipe) {

		return recipeRepository.save(recipe);
	}

	// delete recipe from database
	@DeleteMapping("/{recipeId}")
	public void deleteRecipe(@PathVariable("recipeId") int recipeId) {

		recipeRepository.deleteById(recipeId);
	}
	
	}
