package org.andreasbauer.victualnutriments.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class VictualTest {

    Victual victual;
    // before all tests
    @Before
    public void setup() {
        victual = new Victual();
    }

    @Test
    public void testIsValid_empty() {
        // generateObje()
        assertFalse(victual.isValid());
    }

    @Test
    public void testIsValid_oneMissing() {
        victual.setName("Banana");
        victual.setCategory("fruits");

        assertFalse(victual.isValid());
    }

    @Test
    public void testIsValid() {
        Nutrients nutrients = new Nutrients(90,20,0,1);
        victual.setName("Banana");
        victual.setCategory("fruits");
        victual.setNutrimentsPer100g(nutrients);

        boolean result = victual.isValid();

        assertTrue(result);
    }

}
