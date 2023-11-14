package org.andreasbauer.victualnutriments.services;

import static org.junit.Assert.assertEquals;

import org.andreasbauer.victualnutriments.services.http.NetworkUtilsDummy;
import org.andreasbauer.victualnutriments.model.Nutrients;
import org.junit.Test;

public class NutrientsServiceTest {


    @Test
    public void testGetNutrientsForVictualWithName() {
        NutrientsService service = new NutrientsService(new NetworkUtilsDummy());

        Nutrients result = service.getNutrientsForVictualWithName("Banana");

        assertEquals(90, result.getEnergyInKcal());
        assertEquals(20, result.getFats());
        assertEquals(1, result.getProteins());
        assertEquals(2, result.getCarbs());
    }

}
