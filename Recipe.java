package com.company;

import java.util.ArrayList;
import java.util.Locale;

public class Recipe {
    private String name;
    private ArrayList<String> instructions = new ArrayList<String>();
    private ArrayList<InventoryIngredient> inventoryIngredients = new ArrayList<InventoryIngredient>();

    //recipe needs name, but the lists can be un-initialized
    public Recipe(String name) {
        this.name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase(Locale.ROOT);
    }

    //can we make this recipe? check with the inventory ArrayList in your Pantry object
    public boolean canMake(Pantry pantry) {
        //run through the recipes inventoryIngredients
        for (int i = 0; i < inventoryIngredients.size(); i++) {
            InventoryIngredient toFind = inventoryIngredients.get(i);
            double amountRequired = toFind.getAmount();
            double amountOnHand = 0;

            //check if the ingredient is in the pantry's inventory
            if (pantry.inInventory(toFind)) {
                amountOnHand = pantry.amountInInventory(toFind);
            } else {
                System.out.println("No " + toFind.getName() + " found");
                return false;
            }

            //check if the pantry's inventory amount has enough of the ingredient
            if ((amountOnHand - amountRequired) < 0) {
                System.out.println("Not enough " + toFind.getName() + " in pantry.");
                return false;
            }
        }

        //if all inventoryIngredients are found and you have enough for the recipe, tell the user!
        System.out.println("You've got enough inventoryIngredients!");
        return true;
    }

    public void printRecipe() {
        System.out.println("printRecipe() --> " + name + " = Recipe object");
        printIngredients();
        System.out.println();
        printInstructions();
    }

    public void printIngredients() {
        System.out.println("printIngredients() --> " + name + " = Recipe object");

        if (inventoryIngredients.size() < 1) {
            System.out.println("No inventoryIngredients added yet.");
        } else {
            for (int i = 0; i < inventoryIngredients.size(); i++) {
                    System.out.println((i + 1) + ". " + inventoryIngredients.get(i).getName());
            }
        }
    }

    public void printInstructions() {
        System.out.println("printInstructions() --> " + name + " = Recipe object");

        if (instructions.size() < 1) {
            System.out.println("No instructions added yet.");
        } else {

            for (int i = 0; i < instructions.size(); i++) {
                    System.out.println((i + 1) + ". " + instructions.get(i));
            }
        }
    }

    public String getName() {
        System.out.println("getName() --> " + name + " = Recipe object");
        return name;
    }

    public ArrayList<String> getInstructions() {
        System.out.println("getInstructions() --> " + name + " = Recipe object");
        return instructions;
    }

    public ArrayList<InventoryIngredient> getIngredients() {
        System.out.println("getIngredients() --> " + name + " = Recipe object");
        return inventoryIngredients;
    }
}
