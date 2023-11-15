package org.andreasbauer.victualnutriments.services;

import org.andreasbauer.victualnutriments.services.http.HttpNetwork;
import org.andreasbauer.victualnutriments.model.Nutrients;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class NutrientsService {
    HttpNetwork networkUtils;

    // DI without magic
    public NutrientsService(HttpNetwork net) {
        this.networkUtils = net;
    }

    public Nutrients getNutrientsForVictualWithName(String name) {

        URL url = networkUtils.buildUrl(name);
        try {
            String content = networkUtils.getResponseFromHttpUrl(url);
            Nutrients retNut = parseToNutrient(content);
            return retNut;

        } catch (IOException e) {
            e.printStackTrace();
            return  null;
        }
    }

    public String[] getAvailableNames() {
        URL url = networkUtils.buildUrl("all");
        try {
            String content = networkUtils.getResponseFromHttpUrl(url);
            return content.split(",");

        } catch (IOException e) {
            e.printStackTrace();
            return  null;
        }
    }

    protected Nutrients parseToNutrient(String strNutrient) {
        JSONObject json;
        Nutrients nutrients = new Nutrients(0,0,0,0);

        try {
            json = new JSONObject(strNutrient);

            nutrients.setEnergyInKcal(json.getInt("energy"));
            nutrients.setFats(json.getInt("fat"));
            nutrients.setProteins(json.getInt("proteins"));
            nutrients.setCarbs(json.getInt("carbs"));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return nutrients;
    }
}
