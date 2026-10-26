package formation.TDMockitoTest.Service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


import org.junit.Test;

import formation.TDMockito.Repository.Repository;
import formation.TDMockito.Service.Service;


public class ServiceTest {



    @Test 
    public void testObtenirDonnees(){
        
        //Prepare
        Repository repositoryMock = mock(Repository.class);
        when(repositoryMock.recupererDonnees()).thenReturn("Données simulées");
        Service service = new Service(repositoryMock);

        //Agir
        String result = service.obtenirDonnees();

        //Verifier
        assertEquals("Données simulées", result);
        verify(repositoryMock).recupererDonnees(); // verifie que la methode a ete appelee
    }




}
