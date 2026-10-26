package formation.Stub.Services;

public class GestionnaireDeCommandes {

    private StockService stockService;
    private PaiementService paiementService;

    public GestionnaireDeCommandes(StockService stockService, PaiementService paiementService) {
        this.stockService = stockService;
        this.paiementService = paiementService;
    }

    public String passerCommande(int produitId, double montant) throws Exception {
        if (stockService.verifierDisponibilite(produitId).equals("Disponible")) {
            return paiementService.processserPaiement(montant);
        }
        return "Produit indisponible";
    }

}
