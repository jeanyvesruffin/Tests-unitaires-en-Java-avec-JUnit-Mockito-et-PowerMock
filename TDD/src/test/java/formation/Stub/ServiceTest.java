package formation.Stub;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

import formation.Stub.Repositories.Repository;
import formation.Stub.Services.Service;

public class ServiceTest {

    @Test
    public void testObtenirDonneesAvecException() throws Exception{
        // prepare
        Repository repositoryMock = mock(Repository.class);
        when(repositoryMock.recupererDonnees(1)).thenThrow(new Exception("Erreur simule"));
        Service service = new Service(repositoryMock);

        // agir
        String obtenirDonneees = service.obtenirDonneees(1);

        // verifier
        assertEquals("Erreur", obtenirDonneees);
        verify(repositoryMock).recupererDonnees(1);

    }

}
