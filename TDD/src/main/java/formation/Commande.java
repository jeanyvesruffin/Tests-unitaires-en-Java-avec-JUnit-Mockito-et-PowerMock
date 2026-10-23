package formation;

import java.util.List;

public class Commande {
    public double calculeMontantTotal(List<Double> prixArticle, double tauxTaxe) {
        double sousTotal = prixArticle.stream().mapToDouble(Double::doubleValue).sum();
        return sousTotal * (1 + tauxTaxe);
    }

}
