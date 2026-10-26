package formation.Stub.Services;

public class GestionnaireNotificationService {

private INotification notificationService;

public GestionnaireNotificationService(INotification notificationService) {
    this.notificationService = notificationService;
}

public void envoyerNotification(String message){
    notificationService.envoyer(message);
}

}
