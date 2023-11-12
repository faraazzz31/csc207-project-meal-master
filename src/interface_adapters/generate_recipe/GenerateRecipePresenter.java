package interface_adapters.generate_recipe;

import entity.Recipe;
import use_case.generate_recipe.GenerateRecipeOutputBoundary;
import use_case.generate_recipe.GenerateRecipeOutputData;

import java.util.ArrayList;

public class GenerateRecipePresenter implements GenerateRecipeOutputBoundary {
    public GenerateRecipePresenter() {
    }

    @Override
    public void prepareSuccessView(GenerateRecipeOutputData generateRecipeOutputData) {
        Recipe recipe = generateRecipeOutputData.getRecipe();
        String label = recipe.getLabel();
        String recipeUrl = recipe.getRecipeUrl();
        String imagePath = recipe.getImagePath();
        int calories = recipe.getCalories();
        ArrayList<String> ingredients = recipe.getIngredients();
        int preparationTime = recipe.getPreparationTime();
        int yield = recipe.getYield();

        System.out.println("Label: " + label);
        System.out.println("Image URL: " + imagePath);
        System.out.println("Number of serving(s): " + yield);
        System.out.println("Calories (per serving): " + calories);
        System.out.println("Ingredients:");
        for (String ingredient : ingredients) {
            System.out.println('\t' + ingredient);
        }
        System.out.println("Recipe URL: " + recipeUrl);
        System.out.println("Preparation Time: " + preparationTime);
    }
}
