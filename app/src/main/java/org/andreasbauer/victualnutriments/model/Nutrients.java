package org.andreasbauer.victualnutriments.model;

import java.util.Objects;

public class Nutrients {

    private int energyInKcal;
    private int fats;
    private int proteins;
    private int carbs;

    public Nutrients(int energyInKcal, int fats, int proteins, int carbs) {
        this.energyInKcal = energyInKcal;
        this.fats = fats;
        this.proteins = proteins;
        this.carbs = carbs;
    }

    public int getEnergyInKcal() {
        return energyInKcal;
    }

    public void setEnergyInKcal(int energyInKcal) {
        this.energyInKcal = energyInKcal;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        this.fats = fats;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nutrients nutrients = (Nutrients) o;
        return energyInKcal == nutrients.energyInKcal && fats == nutrients.fats && proteins == nutrients.proteins && carbs == nutrients.carbs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(energyInKcal, fats, proteins, carbs);
    }
}
