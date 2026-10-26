package formation.Stub;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

import org.junit.Test;

import formation.Stub.Repositories.Repository;
import formation.Stub.Services.Service;

public class ServiceTest {

    @Test
    public void testObtenirDonneesAvecException() throws Exception {
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

    @Test
    public void traiterDonneesTest() throws Exception {
        // prepare
        Repository repositoryMock = mock(Repository.class);
        Service service = new Service(repositoryMock);

        // agir
        service.traiterDonnees(1);
        // verifier
        verify(repositoryMock, times(2)).recupererDonnees(1); // verifie que la methode a ete appelee deux fois

    }

    @Test
    public void traiterDonneesTestArgument() throws Exception {
        // prepare
        Repository repositoryMock = mock(Repository.class);
        Service service = new Service(repositoryMock);

        // agir
        service.traiterDonnees2(1);
        // verifier
        verify(repositoryMock).recupererDonnees(eq(1)); // verifie que la methode a utiliser 1 comment arguments de la
                                                        // methode

    }

    public void ssaveDatasTets() {
        // prepare
        Repository repositoryMock = mock(Repository.class);
        Service service = new Service(repositoryMock);

        // agir
        service.saveData("data importantes");
        // verifier
        verify(repositoryMock).sauvegarder("data importantes"); // verifie que la methode a ete appelee

    }

}
