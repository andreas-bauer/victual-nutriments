package org.andreasbauer.victualnutriments.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Victual)) return false;

        Victual victual = (Victual) o;

        if (!id.equals(victual.id)) return false;
        if (!name.equals(victual.name)) return false;
        if (!category.equals(victual.category)) return false;
        return Objects.equals(nutrientsPer100g, victual.nutrientsPer100g);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + category.hashCode();
        result = 31 * result + (nutrientsPer100g != null ? nutrientsPer100g.hashCode() : 0);
        return result;
    }
}
