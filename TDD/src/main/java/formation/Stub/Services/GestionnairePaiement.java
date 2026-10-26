package formation.Stub.Services;

public class GestionnairePaiement {

    private PaiementService paiementService;

    public GestionnairePaiement(PaiementService paiementService) {
        this.paiementService = paiementService;
    }

    public String effectuerPaiement(double montant) {
        try {
            return paiementService.processserPaiement(montant);

        } catch (Exception e) {
            return "Erreur de paiement";
        }
    }

}
