package com.company;

import java.util.Locale;

public class InventoryIngredient {
    private double amount;
    private String unit;
    private String name;

    //need all three when adding so we can track inventory
    public InventoryIngredient(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase(Locale.ROOT);
    }

    public double getAmount() {
        System.out.println("getAmount() --> " + name + " = InventoryIngredient object.");     //debug assistance
        return amount;
    }

    public String getUnit() {
        System.out.println("getUnit() --> " + name + " = InventoryIngredient object.");       //debug assistance
        return unit;
    }

    public String getName() {
        System.out.println("getName() --> " + name + " = InventoryIngredient object.");       //debug assistance
        return name;
    }
}
