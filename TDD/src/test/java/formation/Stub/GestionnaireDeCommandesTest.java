package formation.Stub;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import formation.Stub.Services.GestionnaireDeCommandes;
import formation.Stub.Services.PaiementService;
import formation.Stub.Services.StockService;

public class GestionnaireDeCommandesTest {

    @Test
    public void testPasserCommandeProduitDisponible() throws Exception {
        // prepare
        StockService stockServiceMock = mock(StockService.class);
        PaiementService paiementServiceMock = mock(PaiementService.class);
        when(stockServiceMock.verifierDisponibilite(1)).thenReturn("Disponible");
        when(paiementServiceMock.processserPaiement(100.0)).thenReturn("Paiement réussi");

        GestionnaireDeCommandes gestionnaireDeCommandes = new GestionnaireDeCommandes(stockServiceMock,
                paiementServiceMock);

        // agir
        String result = gestionnaireDeCommandes.passerCommande(1, 100.0);

        // verifier
        assertEquals("Paiement réussi", result);
        verify(stockServiceMock).verifierDisponibilite(1);
        verify(paiementServiceMock).processserPaiement(100.0);

    }

}
