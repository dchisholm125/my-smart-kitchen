package com.company;

import java.util.ArrayList;

public class Pantry {
    private ArrayList<InventoryIngredient> inventory = new ArrayList<InventoryIngredient>();      //if in inventory
    private ArrayList<InventoryIngredient> groceryList = new ArrayList<InventoryIngredient>();    //if not in inventory, add here

    public boolean inInventory(InventoryIngredient inventoryIngredient) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventoryIngredient.getName().toLowerCase().equals(inventory.get(i).getName().toLowerCase())) {
                System.out.println("inInventory() --> Pantry object --> returned true");
                return true;
            }
        }

        System.out.println("inInventory() --> Pantry object --> returned false");
        return false;
    }

    public double amountInInventory (InventoryIngredient inventoryIngredient) {
        System.out.println("amountInInventory --> Pantry object");

        if (inInventory(inventoryIngredient)) {
            double inventoryAmount = inventory.get(inventory.indexOf(inventoryIngredient)).getAmount();

            System.out.println("Found " + inventoryAmount + " " + inventoryIngredient.getUnit() + " of " + inventoryIngredient.getName() + " in inventory.");
            return inventoryAmount;
        }

        System.out.println("No " + inventoryIngredient.getName() + " in inventory.");
        return -1;
    }

    public ArrayList<InventoryIngredient> getInventory() {
        System.out.println("getInventory() --> Pantry object");
        return inventory;
    }

    public ArrayList<InventoryIngredient> getGroceryList() {
        System.out.println("getGroceryList() --> Pantry object");
        return groceryList;
    }
}
