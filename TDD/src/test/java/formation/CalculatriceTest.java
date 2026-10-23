package formation;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class CalculatriceTest {

    @Test 
    public void testAdditionner() {
        // Prepare
        Calculatrice calculatrice = new Calculatrice();
        int a = 5;
        int b = 3;
        int resultatAttendu = 8;

        // Agir
        int resultatObtenu = calculatrice.addition(a, b);

        // Verifier
        assertEquals(resultatAttendu, resultatObtenu);

    }

}
