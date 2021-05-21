package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MyCookbook myCookbook = new MyCookbook();
        Pantry pantry = new Pantry();
        Recipe recipe = new Recipe("chicken & lemon");
        Recipe recipes = new Recipe("beef stew");
        InventoryIngredient chicken = new InventoryIngredient(2.5, "lb", "chicken");
        InventoryIngredient blackPepper = new InventoryIngredient(0.5, "tbsp", "black pepper");
        InventoryIngredient thyme = new InventoryIngredient(0.5, "tsp", "thyme");
        InventoryIngredient lemon = new InventoryIngredient(2, "lemons", "lemon");
        InventoryIngredient potato = new InventoryIngredient(4, "lb", "potatoes");

        recipe.getIngredients().add(chicken);
        recipe.getIngredients().add(blackPepper);
        recipe.getIngredients().add(thyme);
        recipe.getIngredients().add(lemon);
        recipe.getIngredients().add(potato);

        pantry.getInventory().add(chicken);
        pantry.amountInInventory(chicken);

        pantry.getInventory().add(chicken);
        pantry.getInventory().add(blackPepper);
        pantry.getInventory().add(thyme);
        pantry.getInventory().add(lemon);

        recipe.canMake(pantry);

        recipe.getInstructions().add("Peel potatoes");
        recipe.getInstructions().add("Chop garlic");
        recipe.getInstructions().add("Mix wet ingredients");
        recipe.getInstructions().add("Pour over chicken");
        recipe.getInstructions().add("Bake at 350 degrees for an hour");

        recipe.printRecipe();
        recipes.printRecipe();
    }
}
