package formation.Stub;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import formation.Stub.Services.GestionStock;
import formation.Stub.Services.StockService;

public class GestionStockTest {

    @Test
    public void testVerifierStockAvecSequence() {
        // prepare
        StockService stockServiceMock = mock(StockService.class);
        when(stockServiceMock.verifierDisponibilite(1)).thenReturn("Disponible").thenReturn("En rupture de stock");

        GestionStock gestionStock = new GestionStock(stockServiceMock);

        // agir
        String premierResult = gestionStock.verifierStock(1);
        String deuxiemeResult = gestionStock.verifierStock(1);
        // verifier
        assertEquals(premierResult, "Disponible");

        assertEquals(deuxiemeResult, "En rupture de stock");

    }

}
