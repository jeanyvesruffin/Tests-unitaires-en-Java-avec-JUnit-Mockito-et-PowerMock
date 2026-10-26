package formation.Stub;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import formation.Stub.Services.EmailService;
import formation.Stub.Services.NotificationService;

public class NotificationServiceTest {

    @Test
    public void testNotifierUtilisateur() {
        // prepare
        EmailService emailServiceMock = mock(EmailService.class);
        NotificationService notificationService = new NotificationService(emailServiceMock);
     

        // agir
        notificationService.notifierUtilisateur("alice@example.com", "Bonjour Alice");

        // verifier
        verify(emailServiceMock).envoyerEmail("alice@example.com", "Bonjour Alice");   
    }

}
