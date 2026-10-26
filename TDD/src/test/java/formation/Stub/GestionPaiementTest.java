package formation.Stub;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import formation.Stub.Services.GestionnairePaiement;
import formation.Stub.Services.PaiementService;

public class GestionPaiementTest {

    @Test
    public void testEffectuerPaiementAvecException() throws Exception {
        // prepare
        PaiementService paiementServiceMock = mock(PaiementService.class);
        // Simuler une exceptionqui est attrape par le mock
        doThrow(new Exception("Erreur simulee")).when(paiementServiceMock).processserPaiement(100.0);

        GestionnairePaiement gestionnairePaiement = new GestionnairePaiement(paiementServiceMock);

        // agir
        String result = gestionnairePaiement.effectuerPaiement(100.0);

        // verifier
        assertEquals("Erreur de paiement", result);
        verify(paiementServiceMock).processserPaiement(100.0);
    }

}
