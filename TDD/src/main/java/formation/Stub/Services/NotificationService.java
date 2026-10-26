package formation.Stub.Services;

public class NotificationService {
    private EmailService emailService;

    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void notifierUtilisateur(String email, String message){
        emailService.envoyerEmail(email, message);

    }

}
