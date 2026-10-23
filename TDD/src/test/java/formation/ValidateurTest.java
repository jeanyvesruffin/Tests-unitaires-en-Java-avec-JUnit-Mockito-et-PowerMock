package formation;

import org.junit.Test;

public class ValidateurTest {

    @Test(expected = IllegalArgumentException.class)
    public void valideAgeTest() {
        // prepare
        int age = -1;
        Validateur validateur = new Validateur();

        // agir - verifier
        validateur.validerAge(age);

    }

}
