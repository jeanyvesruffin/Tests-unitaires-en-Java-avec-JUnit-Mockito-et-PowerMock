package formation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class Validateur2Test {

    @Test
    public void valideAgeTest() {
        // prepare
        Validateur validateur = new Validateur();

        // agir - verifier
        try {
            validateur.validerAge(-5);
            fail("Une exception aurait du etre levee");
        } catch (IllegalArgumentException e) {
            assertEquals("l age ne peut pas etre negatif", e.getMessage());
        }

    }

}
