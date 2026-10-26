package formation.Stub;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import formation.Stub.Services.INotification;

public class GestionnaireNotificationServiceTest {

    @Test
    public void testEnvoyerNotificationAvecAction() {
        // preparer
        INotification notificationServiceMock = mock(INotification.class);
        doAnswer(invocation -> {
            System.out.println("Notification envoyée : " + invocation.getArgument(0));
            return null;
        }).when(notificationServiceMock).envoyer(anyString());

    }

}
