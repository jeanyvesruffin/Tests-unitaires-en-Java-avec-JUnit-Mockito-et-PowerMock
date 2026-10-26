package formation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidateurTestBestPratique {


    @Test 
    public void testEstValide(){
        Validateur validateur = new  Validateur();
        assertTrue(validateur.estValide("valide"));
        assertFalse(validateur.estValide(""));
        assertFalse(validateur.estValide(null));
    }

}
