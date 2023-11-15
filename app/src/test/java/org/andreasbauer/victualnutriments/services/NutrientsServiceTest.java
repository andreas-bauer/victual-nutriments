package org.andreasbauer.victualnutriments.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.andreasbauer.victualnutriments.services.http.NetworkUtilsDummy;
import org.andreasbauer.victualnutriments.model.Nutrients;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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

    @Test
    public void testGetAvailableNames() {
        NutrientsService service = new NutrientsService(new NetworkUtilsDummy());

        String[] result = service.getAvailableNames();
        List<String> resList = Arrays.asList(result);

        assertEquals(resList.size(), 3);
        assertTrue(resList.contains("Banana"));
        assertTrue(resList.contains("Apple"));
        assertTrue(resList.contains("Orange"));
    }

}
