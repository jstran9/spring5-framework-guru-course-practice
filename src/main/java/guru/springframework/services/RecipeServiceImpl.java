package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipes = new HashSet<>();
//        Iterable<Recipe> recipeIterable = recipeRepository.findAll();
//        for(Recipe recipe: recipeIterable) {
//            recipes.add(recipe);
//        }
        // java 8 syntax.
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }

}
