package org.andreasbauer.victualnutriments.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
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

    @Test
    public void testEquals() {
        victual.setId("123");
        victual.setName("Apple");
        victual.setCategory("fruits");

        Victual other = new Victual();
        other.setId("123");
        other.setName("Apple");
        other.setCategory("fruits");

        assertEquals(victual, other);
    }

    @Test
    public void testEquals_not() {
        victual.setId("123");
        victual.setName("Apple");
        victual.setCategory("fruits");

        Victual other = new Victual();
        other.setId("456");
        other.setName("Apple");
        other.setCategory("fruits");

        assertNotEquals(victual, other);
    }

}
