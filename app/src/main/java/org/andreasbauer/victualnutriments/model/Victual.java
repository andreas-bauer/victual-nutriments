package org.andreasbauer.victualnutriments.model;

public class Victual {

    private String id;
    private String name;
    private String category;
    private Nutrients nutrientsPer100g;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Nutrients getNutrimentsPer100g() {
        return nutrientsPer100g;
    }

    public void setNutrimentsPer100g(Nutrients nutrimentsPer100g) {
        this.nutrientsPer100g = nutrimentsPer100g;
    }

    public boolean isValid() {
        return name != null
                & category != null
                & nutrientsPer100g != null;
    }
}
