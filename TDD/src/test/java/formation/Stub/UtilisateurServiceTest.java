package formation.Stub;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

import formation.Stub.Entities.Utilisateur;
import formation.Stub.Repositories.UtilisateurRepository;
import formation.Stub.Services.UtilisateurService;

public class UtilisateurServiceTest {

    @Test 
    public void obtenirNomUtilisateur() {

        // Prepare
        UtilisateurRepository utilisateurRepositoryMock = mock(UtilisateurRepository.class);
        when(utilisateurRepositoryMock.trouveParId(1)).thenReturn(new Utilisateur("Alice"));
        when(utilisateurRepositoryMock.trouveParId(2)).thenReturn(new Utilisateur(null));

        UtilisateurService utilisateurService = new UtilisateurService(utilisateurRepositoryMock);
        // Agir
        String nomUtilisateur1 = utilisateurService.obtenirNomUtilisateur(1);
        String nomUtilisateur2 = utilisateurService.obtenirNomUtilisateur(2);

        // Verfier
        assertEquals("Alice", nomUtilisateur1);
        assertEquals(null, nomUtilisateur2);
        verify(utilisateurRepositoryMock, times(2)).trouveParId(anyInt());
    }

}
