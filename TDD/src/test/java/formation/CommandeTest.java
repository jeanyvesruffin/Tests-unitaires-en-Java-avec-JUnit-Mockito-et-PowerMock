package formation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;


import org.junit.Test;

public class CommandeTest {


    @Test 
    public void testCalculeMontant(){
        // Prepare
        List<Double> prixArticle = Arrays.asList(10.0,20.0,30.0);
        double tauxTaxe = 0.10;
        double resultatAttendu = 66.0; // (10+20+30)*1.10

        // Agir
        Commande commande = new Commande();
        double resultatObtenu = commande.calculeMontantTotal(prixArticle, tauxTaxe);

        // Verifier
        assertEquals(resultatAttendu, resultatObtenu);

    }

}
