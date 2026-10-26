package formation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Validateur4Test {

    @ParameterizedTest
    @ValueSource(strings = { "12345", "67890", "0000" })
    public void testEstValide(String code) {
        Validateur validateur = new Validateur();
        assertTrue(validateur.estValide(code));
    }

    @ParameterizedTest
    @ValueSource(strings = { "" })
    public void testEstInValide(String code) {
        Validateur validateur = new Validateur();
        assertFalse(validateur.estValide(code));
    }

}
