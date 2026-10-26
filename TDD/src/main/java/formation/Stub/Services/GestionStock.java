package formation.Stub.Services;

public class GestionStock {

    private StockService stockService;

    public GestionStock(StockService stockService) {
        this.stockService = stockService;
    }

    public String verifierStock(int produitId) {
        return stockService.verifierDisponibilite(produitId);
    }

}
