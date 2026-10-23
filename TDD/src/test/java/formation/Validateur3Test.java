package formation;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Validateur3Test {

    @Test
    public void valideAgeTest() {
        // prepare
        Validateur validateur = new Validateur();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            validateur.validerAge(-5);
        });

        // verifier
        assertEquals("l age ne peut pas etre negatif", exception.getMessage());
    }
}
